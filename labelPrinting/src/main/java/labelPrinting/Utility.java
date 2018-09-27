package labelPrinting;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.soap.*;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;


public class Utility {
	public static final String soapEndPointUrl="http://gss.usps.com/usps-cpas/TestGSSAPI/ConsolidatorWebService.asmx";
    public static final String NamespaceUrl="http://www.usps-cpas.com/usps-cpas/GSSAPI/";
    
	 public static SOAPEnvelope createSoapEnvelope(SOAPMessage soapMessage) throws SOAPException{
	    	SOAPPart soapPart=soapMessage.getSOAPPart();
	    	String Namespace3 ="soap";
	    	String Namespace2 ="xsd";
	    	String Namespace1="xsi";
	    	
	    	//String NamespaceUrl="http://www.usps-cpas.com/usps-cpas/GSSAPI/";//the url of usps-gss api
	    	String NamespaceUrl1="http://www.w3.org/2001/XMLSchema-instance";
	    	String NamespaceUrl2="http://www.w3.org/2001/XMLSchema";
	    	String NamespaceUrl3="http://schemas.xmlsoap.org/soap/envelope/";
	    	SOAPEnvelope envelope=soapPart.getEnvelope();
	    	envelope.addNamespaceDeclaration(Namespace1, NamespaceUrl1);
	    	envelope.addNamespaceDeclaration(Namespace2, NamespaceUrl2);
	    	//envelope.addNamespaceDeclaration(Namespace3, NamespaceUrl3);
	    	
	    	/*
	    	 * Constructed SOAP Request Message:
	    	 *          <SOAP-ENV:Envelope xmlns:SOAP-ENV="http://schemas.xmlsoap.org/soap/envelope/">
	                <SOAP-ENV:Header/>
	                <SOAP-ENV:Body>
	                    
	                </SOAP-ENV:Body>
	            </SOAP-ENV:Envelope>
	    	 */
	    	//SOAP Body
	      return envelope;
	    	
	    	
	    	
	    }
	 public static SOAPMessage createSOAPRequest(String soapAction,SOAPMessage soapMessage ) throws SOAPException, IOException {
//			MessageFactory messageFactory=MessageFactory.newInstance();
//			SOAPMessage soapMessage=messageFactory.createMessage();
//			createSoapEnvelope(soapMessage);
			MimeHeaders headers=soapMessage.getMimeHeaders();
			headers.addHeader("SOAPAction", soapAction);
			headers.addHeader("Content-Type", "text/xml; charset=utf-8");
			headers.addHeader("Content-Length", "length");
			headers.addHeader("Host", "gss.usps.com");
			soapMessage.saveChanges();
			/* Print the request message, just for debugging purposes */
	        System.out.println("Request SOAP Message:");
	       ByteArrayOutputStream out = new ByteArrayOutputStream();
	       soapMessage.writeTo(out);
	        String xmlObject=new String(out.toByteArray());
	        soapMessage.writeTo(System.out);
	        System.out.println("\n");

	        return soapMessage;
			
		} 
	 public static SOAPMessage callUspsApiService(String soapApiUrl,String soapAction,SOAPMessage soapMessage) throws SOAPException, IOException {
		 
				SOAPConnectionFactory soapConnectionFactory =SOAPConnectionFactory.newInstance();
				SOAPConnection soapConnection=soapConnectionFactory.createConnection();
				SOAPMessage soapResponse=soapConnection.call(createSOAPRequest(soapAction,soapMessage), soapApiUrl);
				// Print the SOAP Response
//				  System.out.println("Response_first SOAP Message:");
//		            soapResponse.writeTo(System.out);
//		            System.out.println();
		            
	            soapConnection.close();
	            return soapResponse;
	
	 }
	 public static String getPackageIdInResponse(Document doc) {
		 NodeList node=doc.getElementsByTagName("Manifest");
		 NodeList subnode=node.item(0).getChildNodes();
		 String result=iterate(subnode);
		 

		 return result;
	 }
	 private static String iterate(NodeList node) {
		 String result=null;
		 NodeList temp=node.item(0).getChildNodes();
          for(int i=0;i<temp.getLength();i++) {
			 
			if(temp.item(i).getNodeName()=="PackageID") {
				result=temp.item(i).getTextContent();
				break;
			}
			else {return iterate(temp);}
		 }
          return result;
		 
	 }
	 public static void main(String[] args) throws Exception {
		 File file=new File("/Users/lizhe/test.xml");
		 Document XMLDoc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(file);
	        Element element = XMLDoc.getDocumentElement();
	 }
}
