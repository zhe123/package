package labelPrinting;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.rmi.RemoteException;
import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;

import javax.xml.soap.MessageFactory;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;

import org.apache.axis.message.MessageElement;

import com.usps_cpas.www.usps_cpas.GSSAPI.CommonResult;
import com.usps_cpas.www.usps_cpas.GSSAPI.ConsolidatorWebServiceSoapProxy;
import com.usps_cpas.www.usps_cpas.GSSAPI.LabelResult;
import com.usps_cpas.www.usps_cpas.GSSAPI.LoadAndRecordLabeledPackageXmlDoc;
import com.usps_cpas.www.usps_cpas.GSSAPI.ReceptacleResult;

public class Receptacle {
	private String rateType;
	private String dutiable;
	private String receptacleType;
	private String foreignOECode;
	private String countryCode;
	private String dateOfMailing;
	private String pieceCount;
	private String weightInLbs;

	public Receptacle(HashMap map) {
		
		this.rateType=(String)map.get("RateType");
		this.dutiable=(String) map.get("Dutiable");
		this.receptacleType=(String) map.get("ReceptacleType");
		this.foreignOECode=(String) map.get("ForeignOECode");
		this.countryCode=(String)map.get("CountryCode");
		this.dateOfMailing=(String)map.get("DateofMailing");
		this.pieceCount=(String) map.get("PieceCount");
		this.weightInLbs=(String) map.get("WeightInLbs");
		
		
		
		
	}
	
public ReceptacleResult CreateReceptacleForRateTypeToDestination(String rateType, boolean dutiable,String receptacleType,String foreignOECode,String countryCode,Calendar dateOfMailing,int pieceCount,BigDecimal weightInLbs,String accessToken) throws IOException {
	
	ConsolidatorWebServiceSoapProxy proxy=new ConsolidatorWebServiceSoapProxy();
	
	ReceptacleResult result=proxy.createReceptacleForRateTypeToDestination(rateType, dutiable, receptacleType, foreignOECode, countryCode, dateOfMailing, pieceCount, weightInLbs, accessToken);
	
	
	
	return result;
	
	
	
}
public static LabelResult GetReceptacleLabel(String receptacleID,String fileFormat,String accessToken) throws SOAPException, IOException {
	
	ConsolidatorWebServiceSoapProxy proxy=new ConsolidatorWebServiceSoapProxy();
	LabelResult result=proxy.getReceptacleLabel(receptacleID, fileFormat, accessToken);
	return result;
	
	
	
	
}
public static CommonResult AddPackageToReceptacle(String USPSPackageID,String receptacleID,String accessToken) throws RemoteException  {
    ConsolidatorWebServiceSoapProxy proxy=new ConsolidatorWebServiceSoapProxy();
	
    CommonResult result=proxy.addPackagesToReceptacle(USPSPackageID, receptacleID, accessToken);
	return result;
}
public CommonResult MoveReceptacleToOpenDispatch(String  receptacleID,String accessToken) throws SOAPException, IOException{
	
ConsolidatorWebServiceSoapProxy proxy=new ConsolidatorWebServiceSoapProxy();
	
    CommonResult result=proxy.moveReceptacleToOpenDispatch(receptacleID, accessToken);
	return result;
}
	
	
	

}
