package it.web;
import labelPrinting.AuthenticateUser;
import labelPrinting.Package;
import labelPrinting.Token;
import labelPrinting.UserInfo;
import labelPrinting.Utility;
import labelPrinting.XmlMessage;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.glassfish.jersey.server.mvc.Viewable;
import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import com.usps_cpas.www.usps_cpas.GSSAPI.AuthenticateResult;
import com.usps_cpas.www.usps_cpas.GSSAPI.CalculatePostageResult;
import com.usps_cpas.www.usps_cpas.GSSAPI.ConsolidatorWebServiceSoapProxy;
import com.usps_cpas.www.usps_cpas.GSSAPI.LabelResult;
import com.usps_cpas.www.usps_cpas.GSSAPI.LoadAndRecordLabeledPackageResponseLoadAndRecordLabeledPackageResult;
import com.usps_cpas.www.usps_cpas.GSSAPI.TrackResult;
@Path("/")
public class Labelresource {
	
	
@POST
@Path("/printLabel")
@Produces(MediaType.APPLICATION_JSON)

public String  printLabel(JSONObject json,@QueryParam("callback") String callback) throws DOMException, SOAPException, IOException, SAXException, ParserConfigurationException, JSONException
  {    
	  //Inialization
	  int boxnumber=1;
	  ClassLoader classLoader = getClass().getClassLoader();
	  File templatefile = new File(classLoader.getResource("templatePackageData.xml").getFile());
	  
	  Document xmlDoc=XmlMessage.updatePkgXmlvalues(json, templatefile);
	  Token token=new Token();
      /*
       * autheticateuserResponse start
       * @param
       * 
       */
	  ConsolidatorWebServiceSoapProxy proxy =new ConsolidatorWebServiceSoapProxy();
	  AuthenticateResult re=proxy.authenticateUser(UserInfo.userID, UserInfo.password, UserInfo.locationID, UserInfo.workstationID);
      
      token.setAccess_token(re.getAccessToken().toString());
      
      /*
       * authenticateuserResponse End
       */
      
      
      /*-----------------------------------------------------------------------------------*/
      
      
      /*
       * uploadpackagedata start
       * @param
       * xmldoc;accessToken
       */
	  Package pkg=new Package();
	  LoadAndRecordLabeledPackageResponseLoadAndRecordLabeledPackageResult result=pkg.LoadAndRecordLabeledPackage(xmlDoc,token.getAccess_token().toString());
	 
	  Document XMLDoc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(result.get_any()[0].toString());
	  Utility.getPackageIdInResponse(XMLDoc);
	  String packageId=Utility.tempPackageID;
	  LabelResult result1=new LabelResult();
	  if(json.get("IsPrinted").toString()=="false") {
		 
		   result1=pkg.GetPackageLabels(packageId, UserInfo.shippingAgentID,boxnumber,token.getAccess_token());
	  }else {
		   result1=pkg.GetPackageLabels(json.getString("PackageID"), UserInfo.shippingAgentID, boxnumber, token.getAccess_token());
	  }
	  
	  /*
	   * uploadpackagedata end 
	   */
	  
	  /*-----------------------------------------------------------------------------------*/
      
	  
	  byte[][] output = null;
	 
	  output=result1.getLabel();//label output as byte[] format
	  
	  JSONObject map=new JSONObject();
	  map.put(json.has("PacakageID")?json.getString("PackageID"):packageId, output);
	  
	  return map.toString();
  }
@POST
@Path("/createReceptacle")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public JSONObject createReceptacle(JSONObject json) throws JSONException {
	JSONObject out=new JSONObject();
	if(json.has("haha")) {
		out.put("test", "success");
		return out;
	}
	out.put("test1", "fail");
	return out;
	
}
@POST
@Path("/addPackageInRecepatacle")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public JSONObject addPackageInRecepatacle(JSONObject json) throws JSONException {
	JSONObject out=new JSONObject();
	if(json.has("haha")) {
		out.put("test", "success");
		return out;
	}
	out.put("test1", "fail");
	return out;
	
}

@GET
@Path("/main")
@Produces(MediaType.TEXT_HTML)
public Viewable getmain() {
    return new Viewable("/Main.jsp", this);
}
@GET
@Path("/hello")
@Produces(MediaType.TEXT_HTML)
public Viewable getHello() {
    return new Viewable("/index.jsp", this);
}
@POST
@Path("/test")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public JSONObject test(JSONObject json) throws Exception {
//	Iterator it=((JSONObject)json.get("Package")).keys();
//	while(it.hasNext()) {
//		System.out.println(((JSONObject)json.get("Package")).get(it.next().toString()));
//	}
	JSONObject out=new JSONObject();
	JSONObject map=new JSONObject();
	//Inialization
	  int boxnumber=1;
	  ClassLoader classLoader = getClass().getClassLoader();
	  File templatefile = new File(classLoader.getResource("templatePackageData.xml").getFile());
	  Document xmlDoc;
	  Token token=new Token();
	  ConsolidatorWebServiceSoapProxy proxy =new ConsolidatorWebServiceSoapProxy();
	  
	  AuthenticateResult re;
	  LabelResult result1=new LabelResult();
      Package pkg=new Package();
      
      
      LoadAndRecordLabeledPackageResponseLoadAndRecordLabeledPackageResult result = new LoadAndRecordLabeledPackageResponseLoadAndRecordLabeledPackageResult();
      String packageId=null;
      
      /*
       * autheticateuserResponse start
       * @param
       *  
       */
  	
  	  try{
  		  re=proxy.authenticateUser(UserInfo.userID, UserInfo.password, UserInfo.locationID, UserInfo.workstationID);
  	  }catch(Exception e) {
  		  map.put("Exception", e.toString());
  		  map.put("Message", "failure");
  		  return map;
  	  }
        
        token.setAccess_token(re.getAccessToken().toString());
      /*
       * authenticateuserResponse End
       */
 
    if((((JSONObject)json.get("Package")).getBoolean("IsPrinted")==false)) {
	  try {
	        xmlDoc=XmlMessage.updatePkgXmlvalues(json, templatefile);
//	        Transformer transformer = TransformerFactory.newInstance().newTransformer();
//	        Result output = new StreamResult(new File("/Users/lizhe/sampleInput.xml"));
//	        Source input = new DOMSource(xmlDoc);
//
//	        transformer.transform(input, output);
	  }catch(Exception e) {
		  map.put("Exception", e.toString());
		  map.put("Message", "failure");
		  return map;
	  }
	

   // System.out.println(xmlDoc.);
     
    
	  
	  try{
		  result=pkg.LoadAndRecordLabeledPackage(xmlDoc,token.getAccess_token().toString());
	  }catch(Exception e) {
		  map.put("Exception", e.toString());
		  map.put("Message", "failure");
		  return map;
	  }
	   //System.out.println(result.get_any()[0].toString());
	  Document XMLDoc = result.get_any()[0].getAsDocument();
	  Utility.getPackageIdInResponse(XMLDoc);
	  packageId =Utility.tempPackageID;
	  Utility.getRejectPackageNumInResponse(XMLDoc);
	  //System.out.println(packageId);
	 
	  //System.out.println("check Isprinted:"+json.get("IsPrinted").toString());
	  
		  
		  try {
			  result1=pkg.GetPackageLabels(packageId, UserInfo.shippingAgentID,boxnumber,token.getAccess_token());
		  }catch(Exception e) {
			  map.put("Exception", e.toString());
			  map.put("Message", "failure");
			  return map;
		  }
	  }else {
		   try{
			   //System.out.println(((JSONObject)json.get("Package")).getString("PackageID"));
			   result1=pkg.GetPackageLabels(((JSONObject)json.get("Package")).getString("PackageID"), UserInfo.shippingAgentID, boxnumber, token.getAccess_token());
		   }catch(Exception e) {
				  map.put("Exception", e.toString());
				  map.put("Message", "failure");
				  return map;
			  }
	  }
    /*-----------------------------------------------------------------------------------*/
    
	  /*
	   * uploadpackagedata end 
	   */
	  
	  /*-----------------------------------------------------------------------------------*/
      
	  
	  byte[][] output = null;
	  String[] stringArray=null;
	  output=result1.getLabel();//label output as byte[] format
	  try{
		  stringArray=Utility.encoder(output);
	   }catch(Exception e) {
			  map.put("Exception", e.toString());
			  map.put("Message", "failure");
			  return map;
		  }
 
      
      String status=output==null?"failure":"success";
	  //System.out.println(stringArray[0]);
	  JSONObject temp=new JSONObject();
	  for(int i=0;i<stringArray.length;i++) {
		  temp.putOpt(Integer.toString(i),stringArray[i] );
	  }
	 if((((JSONObject)json.get("Package")).getBoolean("IsPrinted")==false)) 
	  {map.put("UspsResponse", result.get_any()[0].toString());
	  
	  }
	  map.put("Message", status);
	  map.put("LabelByteArray",temp);
	  map.put("PackageID", ((JSONObject)json.get("Package")).has("PackageID")?((JSONObject)json.get("Package")).getString("PackageID"):packageId);
	  map.put("ImageType", "PNG");
	  return map;
	
}
@POST
@Path("/packageTrack")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public JSONObject packageTrack(JSONObject json) throws Exception {
	 Token token=new Token();
	 int boxNumber=1;
	 JSONObject map=new JSONObject();
	
	 ConsolidatorWebServiceSoapProxy proxy =new ConsolidatorWebServiceSoapProxy();
	 TrackResult  re = new TrackResult();
	try{
		re=proxy.trackPackage(json.getString("PackageID"), UserInfo.shippingAgentID, boxNumber, token.getAccess_token());
	}catch(Exception e){
		map.put("Message", "failure");
		map.put("ExceptionCode", e.toString());
	}
	map.put("TrackingId", re.getTrackingId());
	map.put("TrackingEvent", re.getTrackingEvent());
	map.put("Message", re.getMessage());
	return map;

}
@POST
@Path("/calculatePostage")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public JSONObject calculatePostage(JSONObject json) throws SAXException, IOException, ParserConfigurationException, JSONException {
	  JSONObject map=new JSONObject();
	  Package pkg=new Package();
	  ClassLoader classLoader = getClass().getClassLoader();
	  File templatefile = new File(classLoader.getResource("templateCalculatePostage.xml").getFile());
	  Document xmlDoc;
	  CalculatePostageResult result;
	  try {
		  xmlDoc=XmlMessage.updateCal_PostageXmlValues(json, templatefile);
		  
	  }catch(Exception e) {
		  map.put("Exception", e.toString());
		  map.put("Message", "failure");
		  return map;
	  }
	  
	Token token=new Token();
	//ConsolidatorWebServiceSoapProxy proxy=new ConsolidatorWebServiceSoapProxy();
	try {
	 result=pkg.Calculate_postage(xmlDoc, token.getAccess_token());
	}catch(Exception e) {
		map.put("Exception", e.toString());
		  map.put("Message", "failure");
		  return map;
	}
	if(result.getResponseCode()==0)
	{ 
		map.put("Message", "Success");
	  map.put("CalculatedPostage", result.getCalculatedPostage());
	  map.put("ExtraServiceCodeFee", result.getExtraServiceCodeFee());
	  map.put("CurrencyCode", result.getCurrencyCode());
	  map.put("DestinationLocationName", result.getDestinationLocationName());
	  map.put("DestinationLocationID", result.getDestinationLocationID());
	 
	}else {
		map.put("Message", "failure");
		map.put("UspsRespondCode", result.getResponseCode());
		map.put("UspsMessage", result.getMessage());
	}
	
	return map;
}
	

  
}
