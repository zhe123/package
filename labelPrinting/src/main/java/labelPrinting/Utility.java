package labelPrinting;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Base64;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.soap.*;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;

public class Utility {
	public static String tempPackageID;
	private static String tempRejectCount;
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
	 public static void getPackageIdInResponse(Document doc) {
		
		 Node temp=null;
		 NodeList node=doc.getElementsByTagName("Manifest");
		 for(int i=0;i<node.getLength();i++) {
		  if(node.item(i).getNodeType()==Node.ELEMENT_NODE) {
			Node subnode=node.item(i);
		  
		    iterate(subnode);
		    //System.out.printf(temp.getNodeName());
		    if(temp!=null&&temp.getNodeName()=="PackageID") {
		    	break;
		    }
		   
		  }
		  
		 }
		 
        
	 }
	 public static void getRejectPackageNumInResponse(Document doc) {
			
		 Node temp=null;
		 NodeList node=doc.getElementsByTagName("Manifest");
		 for(int i=0;i<node.getLength();i++) {
		  if(node.item(i).getNodeType()==Node.ELEMENT_NODE) {
			Node subnode=node.item(i);
		  
		    iterate(subnode);
		    //System.out.printf(temp.getNodeName());
		    if(temp!=null&&temp.getNodeName()=="Reject_Package_Count") {
		    	break;
		    }
		   
		  }
		  
		 }
		 
        
	 }
	 private static void iterate(Node node) {
		  
		   
		    NodeList temp=node.getChildNodes();
        	
        	for(int i=0;i<temp.getLength();i++) {
        	
			 //System.out.println(temp.item(i).getNodeName());
			if(temp.item(i).getNodeType()==Node.ELEMENT_NODE)
			{
				if(temp.item(i).getNodeName()=="PackageID") 
				
			     {
				 Utility.tempPackageID=temp.item(i).getTextContent();
				break;
			     }
				
			else {
				 iterate(temp.item(i));
			     }
				if(temp.item(i).getNodeName()=="Reject_Package_Count") 
					
			     {
				 Utility.tempRejectCount=temp.item(i).getTextContent();
				break;
			     }
				
			else {
				 iterate(temp.item(i));
			     }
        	}
			  
			
		   }
     
        
          
		 
	 }
	 
	 @SuppressWarnings("null")
	public static String[] encoder(byte[][] bytearray) throws UnsupportedEncodingException {
//		for(int j=0;j<bytearray.length;j++) {      
//		 for(int m=0;m<bytearray[j].length;m++)
//			 {System.out.println(bytearray[j][m]);
//			 
//			 }
//		}
		        // Reading a Image file from file system
		    	String[] base64Image =new String[bytearray.length];
		        
		       for(int i=0;i<bytearray.length;i++)
		       {  
		          
		         String temp = new String(Base64.getEncoder().encode(bytearray[i]), "UTF-8");
		          
		    	  base64Image[i]=temp;
		        }
		       
		  
		    
		    return base64Image;
		}
		
		public static void decoder(String base64Image, String pathFile) {
		    try (FileOutputStream imageOutFile = new FileOutputStream(pathFile)) {
		        // Converting a Base64 String into Image byte array
		        byte[] imageByteArray = Base64.getDecoder().decode(base64Image);
		        imageOutFile.write(imageByteArray);
		    } catch (FileNotFoundException e) {
		        System.out.println("Image not found" + e);
		    } catch (IOException ioe) {
		        System.out.println("Exception while reading the Image " + ioe);
		    }
		} 
	 public static void main(String[] args) throws Exception {
		 File file=new File("/Users/lizhe/test.xml");
		 Document XMLDoc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(file);
	        Element element = XMLDoc.getDocumentElement();
	 }
}
