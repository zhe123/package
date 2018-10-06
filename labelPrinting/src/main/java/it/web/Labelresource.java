package it.web;
import labelPrinting.AuthenticateUser;
import labelPrinting.Package;
import labelPrinting.Token;
import labelPrinting.UserInfo;
import labelPrinting.Utility;
import labelPrinting.XmlMessage;

import java.io.File;
import java.io.IOException;



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

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.glassfish.jersey.server.mvc.Viewable;
import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import com.usps_cpas.www.usps_cpas.GSSAPI.AuthenticateResult;
import com.usps_cpas.www.usps_cpas.GSSAPI.ConsolidatorWebServiceSoapProxy;
import com.usps_cpas.www.usps_cpas.GSSAPI.LabelResult;
import com.usps_cpas.www.usps_cpas.GSSAPI.LoadAndRecordLabeledPackageResponseLoadAndRecordLabeledPackageResult;
@Path("/")
public class Labelresource {
	
	
@POST
@Path("/printLabel")
@Produces(MediaType.APPLICATION_JSON)

public String  printLabel(JSONObject json,@QueryParam("callback") String callback) throws DOMException, SOAPException, IOException, SAXException, ParserConfigurationException, JSONException
  {    
	  //Inialization
	  int boxnumber=1;
	  File file=new File(getClass().getResource("templatePackageData").getFile());
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
	  LoadAndRecordLabeledPackageResponseLoadAndRecordLabeledPackageResult result=pkg.LoadAndRecordLabeledPackage(file,token.getAccess_token().toString());
	 
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
	JSONObject out=new JSONObject();
	//Inialization
	  int boxnumber=1;
	  ClassLoader classLoader = getClass().getClassLoader();
	  File file = new File(classLoader.getResource("templatePackageData.xml").getFile());
	  Token token=new Token();
	  ConsolidatorWebServiceSoapProxy proxy =new ConsolidatorWebServiceSoapProxy();
    /*
     * autheticateuserResponse start
     * @param
     *  
     */
	  
	  AuthenticateResult re=proxy.authenticateUser(UserInfo.userID, UserInfo.password, UserInfo.locationID, UserInfo.workstationID);
      
      token.setAccess_token(re.getAccessToken().toString());
    /*
     * authenticateuserResponse End
     */
    
    Package pkg=new Package();
	  LoadAndRecordLabeledPackageResponseLoadAndRecordLabeledPackageResult result=pkg.LoadAndRecordLabeledPackage(file,token.getAccess_token().toString());
	   System.out.println(result.get_any()[0].toString());
	  Document XMLDoc = result.get_any()[0].getAsDocument();
	  Utility.getPackageIdInResponse(XMLDoc);
	  String packageId=Utility.tempPackageID;
	  System.out.println(packageId);
	  LabelResult result1=new LabelResult();
	  System.out.println("check Isprinted:"+json.get("IsPrinted").toString());
	  if((json.getBoolean("IsPrinted")==false)) {
		  System.out.println("123");
		   result1=pkg.GetPackageLabels(packageId, UserInfo.shippingAgentID,boxnumber,token.getAccess_token());
	  }else {
		   result1=pkg.GetPackageLabels(json.getString("PackageID"), UserInfo.shippingAgentID, boxnumber, token.getAccess_token());
	  }
    /*-----------------------------------------------------------------------------------*/
    
	  /*
	   * uploadpackagedata end 
	   */
	  
	  /*-----------------------------------------------------------------------------------*/
      
	  
	  byte[][] output = null;
	
	  output=result1.getLabel();//label output as byte[] format
//	  String[] stringArray=Utility.encoder(output);

	  JSONObject map=new JSONObject();
	  map.put("LabelDataStringArray",output );
	  map.put("PackageID", json.has("PackageID")?json.getString("PackageID"):packageId);
	  map.put("ImageTyoe", "PNG");
	  return map;
	
}
	

  
}
