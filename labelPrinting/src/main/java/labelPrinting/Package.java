  package labelPrinting;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.rmi.RemoteException;
import java.util.HashMap;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.soap.*;

import org.apache.axis.message.MessageElement;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import com.usps_cpas.www.usps_cpas.GSSAPI.CalculatePostageResult;
import com.usps_cpas.www.usps_cpas.GSSAPI.CalculatePostageXmlDoc;
import com.usps_cpas.www.usps_cpas.GSSAPI.CommonResult;
import com.usps_cpas.www.usps_cpas.GSSAPI.ConsolidatorWebServiceSoapProxy;
import com.usps_cpas.www.usps_cpas.GSSAPI.GetPackageLabelsResponse;
import com.usps_cpas.www.usps_cpas.GSSAPI.LabelResult;
import com.usps_cpas.www.usps_cpas.GSSAPI.LoadAndRecordLabeledPackageResponseLoadAndRecordLabeledPackageResult;
import com.usps_cpas.www.usps_cpas.GSSAPI.LoadAndRecordLabeledPackageXmlDoc;
import com.usps_cpas.www.usps_cpas.GSSAPI.ReceptacleResult;
import com.usps_cpas.www.usps_cpas.GSSAPI._package;
public class Package extends _package{
   
	
	
    private String packageWeightUnit;
	private String packageGUID;
	private String recipientCountryCode;
	private String recipientCountryName;
	private String USPSPackageID;
	private String mailerPackageID;
	private BigDecimal packageWeight;
	private String recipientName;
	private boolean inshipmentQueue;
	private String shipmentID;
	private String receptacleID;
	private boolean isPackageBlocked;
	private String foreignPortCode;
	public Package(java.lang.String packageWeightUnit,
	           java.lang.String packageGUID,
	           java.lang.String recipientCountryCode,
	           java.lang.String recipientCountryName,
	           java.lang.String USPSPackageID,
	           java.lang.String mailerPackageID,
	           java.math.BigDecimal packageWeight,
	           java.lang.String recipientName,
	           boolean inshipmentQueue,
	           java.lang.String shipmentID,
	           java.lang.String receptacleID,
	           boolean isPackageBlocked,
	           java.lang.String foreignPortCode) {
    
         this.packageWeightUnit = packageWeightUnit;
         this.packageGUID = packageGUID;
         this.recipientCountryCode = recipientCountryCode;
         this.recipientCountryName = recipientCountryName;
         this.USPSPackageID = USPSPackageID;
         this.mailerPackageID = mailerPackageID;
         this.packageWeight = packageWeight;
         this.recipientName = recipientName;
         this.inshipmentQueue = inshipmentQueue;
         this.shipmentID = shipmentID;
         this.receptacleID = receptacleID;
         this.isPackageBlocked = isPackageBlocked;
         this.foreignPortCode = foreignPortCode;
    }
public Package() {super();
		// TODO Auto-generated constructor stub
	}
	//    public XmlDocument LoadPackageData(XmlDocument xmlDoc, String AccessToken)
//    public static class Builder {
//    	private Package instance;
//    	public Builder() {
//    		this.instance = new  Package();
//    	}
//    	public Builder setPackageId(String packageid) {
//    		instance.PackageId=packageid;
//    		return this;
//    	}
//    	public Builder setOderI(String orderid) {
//    		instance.OrderId=orderid;
//    		return this;
//    	}
//    	public Builder setPackageType(String packagetype) {
//    		instance.PackageType=packagetype;
//    		return this;
//    	}
//    	public Builder setPackageWeight(double packageweight) {
//    		instance.PackageWeight=packageweight;
//    		return this;
//    	}
//    	public Builder set
//    }
    public LabelResult GetPackageLabels(String packageID,String mailingAgentID,int boxNumber,String token) throws SOAPException, IOException {
       
        ConsolidatorWebServiceSoapProxy proxy =new ConsolidatorWebServiceSoapProxy();
        
		LabelResult result=proxy.getPackageLabels(packageID, mailingAgentID, boxNumber, "PNG", token);
	    
		return result;
    }
   
    public CalculatePostageResult Calculate_postage(Document xmlDoc,String accessToken) throws SAXException, IOException, ParserConfigurationException {
    	
    	
        MessageElement[] element=XmlMessage.convertXMLStringtoMessageElement(xmlDoc);
 	   CalculatePostageXmlDoc calculatexmlDoc=new CalculatePostageXmlDoc();
 	    calculatexmlDoc.set_any(element);
 	   
    	ConsolidatorWebServiceSoapProxy proxy=new ConsolidatorWebServiceSoapProxy();
    	
    	CalculatePostageResult result=proxy.calculatePostage(calculatexmlDoc, accessToken);
    	return result;
    	
    }
    public  LoadAndRecordLabeledPackageResponseLoadAndRecordLabeledPackageResult  LoadAndRecordLabeledPackage(Document xmlDoc,String token) throws IOException, SAXException, ParserConfigurationException {
    	
    	
       MessageElement[] element=XmlMessage.convertXMLStringtoMessageElement(xmlDoc);
       
	   LoadAndRecordLabeledPackageXmlDoc LabelxmlDoc=new LoadAndRecordLabeledPackageXmlDoc();
	    LabelxmlDoc.set_any(element);
	    ConsolidatorWebServiceSoapProxy proxy=new ConsolidatorWebServiceSoapProxy();
	    LoadAndRecordLabeledPackageResponseLoadAndRecordLabeledPackageResult result=proxy.loadAndRecordLabeledPackage(LabelxmlDoc,token);
	   
	    return result;
	    
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
