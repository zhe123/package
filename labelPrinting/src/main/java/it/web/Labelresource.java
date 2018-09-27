package it.web;
import labelPrinting.AuthenticateUser;
import labelPrinting.Package;
import labelPrinting.Token;
import labelPrinting.UserInfo;
import labelPrinting.XmlMessage;

import java.io.File;
import java.io.IOException;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;

import org.codehaus.jettison.json.JSONObject;
import org.w3c.dom.DOMException;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import com.usps_cpas.www.usps_cpas.GSSAPI.LabelResult;
import com.usps_cpas.www.usps_cpas.GSSAPI.LoadAndRecordLabeledPackageResponseLoadAndRecordLabeledPackageResult;

public class Labelresource {
	
	
@POST
@Path("printLabel")
@Produces("application/json")
public byte[][]  printLabel(JSONObject json) throws DOMException, SOAPException, IOException, SAXException, ParserConfigurationException
  {   int boxnumber=1;
	  File file=new File(getClass().getResource("templatePackageData").getFile());
	  Token token=new Token();
      SOAPMessage soapResponse=AuthenticateUser.authenticateUser();
//autheticateuserResponse
      if(XmlMessage.isSuccess(soapResponse, "AuthenticateUser")) {
 
      SOAPBody body= soapResponse.getSOAPBody();
      NodeList list=body.getElementsByTagName("AccessToken");
      System.out.println("haha "+list.item(0).getTextContent().toString());
      token.setAccess_token(list.item(0).getTextContent().toString());
      }
 
	  Package pkg=new Package();
	  //LoadAndRecordLabeledPackageResponseLoadAndRecordLabeledPackageResult result=pkg.LoadAndRecordLabeledPackage(file,token.getAccess_token().toString());
	 // String packageID=result.get_any()[0].getElementsByTagName("PackageID").item(0).getTextContent().toString();
	  LabelResult result1=pkg.GetPackageLabels("CY000114100US", UserInfo.shippingAgentID,boxnumber,token.getAccess_token());
	return null;
  }
	
	
	
	
	

  
}
