package labelPrinting;

import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.sql.Date;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;


import org.apache.axis.message.MessageElement;
import org.codehaus.jettison.json.JSONObject;
import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONException;
import org.w3c.dom.Attr;
import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
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
	
  public static MessageElement[]  convertXMLStringtoMessageElement(Document xmlDoc) throws SAXException, IOException, ParserConfigurationException {
	  {		
	        MessageElement[] m = new MessageElement[1];
	        //Document XMLDoc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(xml);
	        Element element = xmlDoc.getDocumentElement();
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
//  public static boolean isSuccess(SOAPMessage soapResponse,String name) throws SOAPException {
//	 boolean isSuccess = false;
//	 SOAPBody body=soapResponse.getSOAPBody();
//	 
//	 NodeList list=body.getElementsByTagName(name+"Result");
//	 for(int i=0;i<list.getLength();i++)
// {      NodeList innerList=list.item(i).getChildNodes();
//		for(int j=0;j<innerList.getLength();j++) {
//			
//	//System.out.println(innerList.item(j).getTextContent().toString());		
//	if(innerList.item(j).getNodeName().equalsIgnoreCase("Message")) {
//		   isSuccess=innerList.item(j).getTextContent().toString()=="Success"?false:true;
//		      
//	 if(!isSuccess) {System.out.println("response failed");}
//	 }
//   }
//  }
//	 
//	  
//	  
//	  
//	  return isSuccess;
//	 
//	  
//  }
  public static Document updateCal_PostageXmlValues(JSONObject json,File file) throws SAXException, IOException, ParserConfigurationException, DOMException, JSONException {
	  
	   
	  
	  
	  Document XMLDoc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(file);
      NodeList Cal_nodes=XMLDoc.getElementsByTagName("CalculatePostage");
      
      NodeList nodes=Cal_nodes.item(0).getChildNodes();
            	for(int m=0;m<nodes.getLength();m++) {
            		Node node=(Node)nodes.item(m);
            		if(node.getNodeType()== node.ELEMENT_NODE)
            		 {   String name=node.getNodeName();
            			switch(name)
            		     {
            		       case "CountryCode":node.setTextContent(((JSONObject)json.get("CalculatePostage")).getString("CountryCode"));break;
            		       case "PostalCode":node.setTextContent(((JSONObject)json.get("PostalCode")).getString("CountryCode"));break;
            		       case "PackageWeight":node.setTextContent(((JSONObject)json.get("PackageWeight")).getString("CountryCode"));break;
            		       case "UnitOfWeight":node.setTextContent(((JSONObject)json.get("UnitOfWeight")).getString("CountryCode"));break;
            		       case "PackageLength":node.setTextContent(((JSONObject)json.get("PackageLength")).getString("CountryCode"));break;
            		       case "PackageWidth":node.setTextContent(((JSONObject)json.get("PackageWidth")).getString("CountryCode"));break;
            		       case "PackageHeight":node.setTextContent(((JSONObject)json.get("PackageHeight")).getString("CountryCode"));break;
            		       case "UnitOfMeasurement":node.setTextContent(((JSONObject)json.get("UnitOfMeasurement")).getString("CountryCode"));break;
            		       case "NonRectangular":node.setTextContent(((JSONObject)json.get("NonRectangular")).getString("CountryCode"));break;
            		       case "DestinationLocationID":node.setTextContent(((JSONObject)json.get("DestinationLocationID")).getString("CountryCode"));break;
            		      
            		       
            		     }
            		 }
            		
            	}
				return XMLDoc;
            	
            
            
  }
  public static Document updatePkgXmlvalues(JSONObject json,File file) throws SAXException, IOException, ParserConfigurationException, JSONException {
	  JSONArray array=new JSONArray();
	  if(json.has("Package")) {
		  JSONObject PkgJson =json.getJSONObject("Package");
		  if(PkgJson.has("Item")) {
			  array=PkgJson.getJSONArray("Item");
		  
		  }
		  
		  
	  }
	  JSONObject itemJson=array.getJSONObject(0);
	   
	  
	  
	  Document XMLDoc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(file);
      NodeList Manifestnodes=XMLDoc.getElementsByTagName("Manifest");
      
      NodeList nodes=Manifestnodes.item(0).getChildNodes();
      for (int i = 0; i < nodes.getLength(); i++) {     
      Node node = (Node) nodes.item(i); 
      System.out.println(node.getNodeName());
        if (node.getNodeType() == Node.ELEMENT_NODE) 
        {     
            if(node.getNodeName()=="Dispatch") 
            {
            	NodeList dispatchNodes=node.getChildNodes();
            	for(int m=0;m<dispatchNodes.getLength();m++) {
            		Node dispatchNode=(Node) dispatchNodes.item(m);
            		if(dispatchNode.getNodeType()== dispatchNode.ELEMENT_NODE)
            		 {   String name=dispatchNode.getNodeName();
            			switch(name)
            		     {
            		       case "DispatchDateTime":dispatchNode.setTextContent(java.time.LocalDateTime.now().toString());break;
            		       case "TimeZone":dispatchNode.setTextContent("PDT");break;
            		     }
            		 }
            		
            	}
            	
            }
            
            
            if(node.getNodeName()=="Package") 
            {   node.getAttributes().item(0).getChildNodes().item(0).setTextContent(((JSONObject)json.get("Package")).getString("PackageID"));
            	NodeList packageNodes=node.getChildNodes();
            	for(int m=0;m<packageNodes.getLength();m++) {
            		Node packageNode=(Node) packageNodes.item(m);
            		if(packageNode.getNodeType()== packageNode.ELEMENT_NODE)
            		 {   String packagename=packageNode.getNodeName();
            			switch(packagename)
            		     { case "OrderID":packageNode.setTextContent(((JSONObject)json.get("Package")).getString("OrderID"));break;
            		       case "SenderSignature":packageNode.setTextContent(Utility.randomName(UserInfo.signatureName));break;
            		       case "RecipientFirstName":packageNode.setTextContent(((JSONObject)json.get("Package")).getString("RecipientFirstName"));break;
            		       case "RecipientMiddleInitial":packageNode.setTextContent(((JSONObject)json.get("Package")).getString("RecipientMiddleInitial"));break;
            		       case "RecipientLastName":packageNode.setTextContent(((JSONObject)json.get("Package")).getString("RecipientLastName"));break;
            		       case "RecipientBusinessName":packageNode.setTextContent(((JSONObject)json.get("Package")).getString("RecipientBusinessName"));break;
            		       case "RecipientAddress_Line_1":packageNode.setTextContent(((JSONObject)json.get("Package")).getString("RecipientAddress_Line_1"));break;
            		       case "RecipientAddress_Line_2":packageNode.setTextContent(((JSONObject)json.get("Package")).getString("RecipientAddress_Line_2"));break;
            		       case "RecipientAddress_Line_3":packageNode.setTextContent(((JSONObject)json.get("Package")).getString("RecipientAddress_Line_3"));break;
            		       case "RecipientInLineTranslationAddressLine1":packageNode.setTextContent(((JSONObject)json.get("Package")).getString("RecipientInLineTranslationAddressLine1"));break;
            		       case "RecipientInLineTranslationAddressLine2":packageNode.setTextContent(((JSONObject)json.get("Package")).getString("RecipientInLineTranslationAddressLine2"));break;
            		       case "RecipientAddress_IsPOBox":packageNode.setTextContent(((JSONObject)json.get("Package")).getString("RecipientAddress_IsPOBox"));break;
            		       case "RecipientPostal_Code":packageNode.setTextContent(((JSONObject)json.get("Package")).getString("RecipientPostal_Code"));break;
            		       case "RecipientCountry_Code":packageNode.setTextContent(((JSONObject)json.get("Package")).getString("RecipientCountry_Code"));break;
            		       case "RecipientPhone":packageNode.setTextContent(((JSONObject)json.get("Package")).getString("RecipientPhone"));break;
            		       case "RecipientEmail":packageNode.setTextContent(((JSONObject)json.get("Package")).getString("RecipientEmail"));break;
            		       case "RecipientCity":packageNode.setTextContent(((JSONObject)json.get("Package")).getString("RecipientCity"));break;
            		       case "RecipientProvince":packageNode.setTextContent(((JSONObject)json.get("Package")).getString("RecipientProvince"));break;
            		       case "PackageType":packageNode.setTextContent(((JSONObject)json.get("Package")).getString("PackageType"));break;
            		       case "PackageWeight":packageNode.setTextContent(((JSONObject)json.get("Package")).getString("PackageWeight"));break;
            		       case "PackageID":packageNode.setTextContent(((JSONObject)json.get("Package")).getString("PackageID"));break;
            		       case "Item":
            		    	   {
            		    NodeList itemNodes= packageNode.getChildNodes();
            		    for(int n=0;n<itemNodes.getLength();n++) {
                       		Node itemNode=(Node)itemNodes.item(n);
                    		if(itemNode.getNodeType()== itemNode.ELEMENT_NODE)
                    		 {   String itemname=itemNode.getNodeName();
                    			switch(itemname)
                    		     {
                    		       case "ItemID":itemNode.setTextContent(itemJson.getString("ItemID"));break;
                    		       case "CommodityName":itemNode.setTextContent(itemJson.getString("CommodityName"));break;
                    		       case "ItemDescription":itemNode.setTextContent(itemJson.getString("ItemDescription"));break;
                    		       case "CustomsDescription":itemNode.setTextContent(itemJson.getString("CustomsDescription"));break;
                    		       case "UnitValue":itemNode.setTextContent(itemJson.getString("UnitValue"));break;
                    		       case "ItemWeight":itemNode.setTextContent(itemJson.getString("ItemWeight"));break;
                    		       case "UnitOfItemWeight":itemNode.setTextContent(itemJson.getString("UnitOfItemWeight"));break;
                    		       case "Quantity":itemNode.setTextContent(itemJson.getString("Quantity"));break;
                    		       case "CountryOfOrigin":itemNode.setTextContent(itemJson.getString("CountryOfOrigin"));break;
                    		       
            		             }
            		         }
            		
            	                  };break;
            		    	   }
            	
                          }
                       }
                   }
            }

	  
         }
      }

      return XMLDoc;
  
    }
}
