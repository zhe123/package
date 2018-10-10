package labelPrinting;

import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.soap.*;
import javax.xml.soap.SOAPBody;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.apache.axis.message.MessageElement;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import com.usps_cpas.www.usps_cpas.GSSAPI.*;
import org.w3c.dom.*;


public class Test {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
     //authenticateUser
	     File xmlfile=new File("/Users/lizhe/inputfile.xml");
	     
		Token token=new Token();
		ConsolidatorWebServiceSoapProxy proxy =new ConsolidatorWebServiceSoapProxy();
		proxy.authenticateUser(UserInfo.userID, UserInfo.password, UserInfo.locationID, UserInfo.workstationID);proxy.authenticateUser(UserInfo.userID, UserInfo.password, UserInfo.locationID, UserInfo.workstationID); proxy.authenticateUser(UserInfo.userID, UserInfo.password, UserInfo.locationID, UserInfo.workstationID);
     //autheticateuserResponse
    
    	 
    	
     

  //   LinkedHashMap<String,LinkedHashMap> map=new LinkedHashMap<String,LinkedHashMap>();
     
     DocumentBuilderFactory dbFactory=DocumentBuilderFactory.newInstance();
     DocumentBuilder dBuilder =dbFactory.newDocumentBuilder();
     Document doc=dBuilder.parse(xmlfile);
     doc.setXmlStandalone(true);

     TransformerFactory tf = TransformerFactory.newInstance();
     Transformer transformer = tf.newTransformer();
     transformer.setOutputProperty(OutputKeys.METHOD, "xml");
     transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");

     transformer.setOutputProperty(OutputKeys.INDENT, "yes");
     transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
     StringWriter writer = new StringWriter();
     transformer.transform(new DOMSource(doc), new StreamResult(writer));
     String output = writer.getBuffer().toString();	 
     
  
     Package package1=new Package();
     //SOAPMessage soapResponse1=package1.LoadAndRecordLabeledPackage("<![CDATA["+output+"]]>",token.getAccess_token());
   //Print the SOAP Response
	 System.out.println("Response SOAP Message:");
     //soapResponse1.writeTo(System.out);
     System.out.println();
     
     MessageElement[] message=convertXMLStringtoMessageElement(xmlfile);
     LoadAndRecordLabeledPackageXmlDoc xmldoc=new LoadAndRecordLabeledPackageXmlDoc();
     xmldoc.set_any(message);
         
     LoadAndRecordLabeledPackageResponseLoadAndRecordLabeledPackageResult re=proxy.loadAndRecordLabeledPackage(xmldoc, token.getAccess_token());
     System.out.println(re.get_any()[0].getAsString());
    
     Document XMLDoc = re.get_any()[0].getAsDocument();
//     File test=new File("/Users/lizhe/test.xml");
//     
//     Document testDoc=DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(test);
	 Utility.getPackageIdInResponse(XMLDoc);
	 String packageId=Utility.tempPackageID;
	 int a =1;
     LabelResult result=proxy.getPackageLabels(packageId, UserInfo.shippingAgentID, a, "PNG", token.getAccess_token());
     byte[][] bt=result.getLabel();
     for(int i=0;i<bt.length;i++) {
    	 for(int j=0;j<bt[i].length;j++) {
    		 
    		 System.out.println(bt[i][j]);
    	 }
     }
     
     
	}
	
	public static MessageElement[] convertXMLStringtoMessageElement(File xml) throws SAXException, IOException, ParserConfigurationException{		
        MessageElement[] m = new MessageElement[1];
        Document XMLDoc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(xml);
        Element element = XMLDoc.getDocumentElement();
        m[0] = new MessageElement(element);
        return m;
    }

}
