package labelPrinting;

import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.soap.*;

import org.apache.axis.message.MessageElement;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
public class XmlMessage {
	
  public static MessageElement[]  convertXMLStringtoMessageElement(File xml) throws SAXException, IOException, ParserConfigurationException {
	  {		
	        MessageElement[] m = new MessageElement[1];
	        Document XMLDoc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(xml);
	        Element element = XMLDoc.getDocumentElement();
	        m[0] = new MessageElement(element);
	        return m;
	    }
	  
	    // write the content into xml file
//
	  
		
	  
	  
	  
  }
  private static Element getSingleElement(Document doc,String name,String value) {
	  Element node=doc.createElement(name);
	  node.appendChild(doc.createTextNode(value==null?"":value ));
	  return node;
	  
  }
  private static void getElements(Document doc,Element element,LinkedHashMap map){
     LinkedHashMap tempMap=map;
     Iterator it=tempMap.entrySet().iterator();
        while(it.hasNext()) {
        	Map.Entry entries=(Map.Entry)it.next();
        	Element temp=XmlMessage.getSingleElement(doc,entries.getKey().toString(),entries.getValue().toString());
        	element.appendChild(temp);
        	
        		
        }


  }
  public static boolean isSuccess(SOAPMessage soapResponse,String name) throws SOAPException {
	 boolean isSuccess = false;
	 SOAPBody body=soapResponse.getSOAPBody();
	 
	 NodeList list=body.getElementsByTagName(name+"Result");
	 for(int i=0;i<list.getLength();i++)
 {      NodeList innerList=list.item(i).getChildNodes();
		for(int j=0;j<innerList.getLength();j++) {
			
	//System.out.println(innerList.item(j).getTextContent().toString());		
	if(innerList.item(j).getNodeName().equalsIgnoreCase("Message")) {
		   isSuccess=innerList.item(j).getTextContent().toString()=="Success"?false:true;
		      
	 if(!isSuccess) {System.out.println("response failed");}
	 }
   }
  }
	 
	  
	  
	  
	  return isSuccess;
	 
	  
  }
  
  // public static void main(String argv[]) {
	  
	 //  XmlDocument xml=new XmlDocument();
	 //  HashMap map=new HashMap();
	  
	 //  xml.writePackageDataToFile(map);
	  
	  
  // }
  
}
