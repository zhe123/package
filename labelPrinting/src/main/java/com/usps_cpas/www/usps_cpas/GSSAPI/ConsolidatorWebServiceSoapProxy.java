package com.usps_cpas.www.usps_cpas.GSSAPI;

public class ConsolidatorWebServiceSoapProxy implements com.usps_cpas.www.usps_cpas.GSSAPI.ConsolidatorWebServiceSoap {
  private String _endpoint = null;
  private com.usps_cpas.www.usps_cpas.GSSAPI.ConsolidatorWebServiceSoap consolidatorWebServiceSoap = null;
  
  public ConsolidatorWebServiceSoapProxy() {
    _initConsolidatorWebServiceSoapProxy();
  }
  
  public ConsolidatorWebServiceSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initConsolidatorWebServiceSoapProxy();
  }
  
  private void _initConsolidatorWebServiceSoapProxy() {
    try {
      consolidatorWebServiceSoap = (new com.usps_cpas.www.usps_cpas.GSSAPI.ConsolidatorWebServiceLocator()).getConsolidatorWebServiceSoap();
      if (consolidatorWebServiceSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)consolidatorWebServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)consolidatorWebServiceSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (consolidatorWebServiceSoap != null)
      ((javax.xml.rpc.Stub)consolidatorWebServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.usps_cpas.www.usps_cpas.GSSAPI.ConsolidatorWebServiceSoap getConsolidatorWebServiceSoap() {
    if (consolidatorWebServiceSoap == null)
      _initConsolidatorWebServiceSoapProxy();
    return consolidatorWebServiceSoap;
  }
  
  public boolean refreshWebComponent(java.lang.String val) throws java.rmi.RemoteException{
    if (consolidatorWebServiceSoap == null)
      _initConsolidatorWebServiceSoapProxy();
    return consolidatorWebServiceSoap.refreshWebComponent(val);
  }
  
  public com.usps_cpas.www.usps_cpas.GSSAPI.AuthenticateResult authenticateUser(java.lang.String userID, java.lang.String password, java.lang.String locationID, java.lang.String workstationID) throws java.rmi.RemoteException{
    if (consolidatorWebServiceSoap == null)
      _initConsolidatorWebServiceSoapProxy();
    return consolidatorWebServiceSoap.authenticateUser(userID, password, locationID, workstationID);
  }
  
  public com.usps_cpas.www.usps_cpas.GSSAPI.LoadAndRecordLabeledPackageResponseLoadAndRecordLabeledPackageResult loadAndRecordLabeledPackage(com.usps_cpas.www.usps_cpas.GSSAPI.LoadAndRecordLabeledPackageXmlDoc xmlDoc, java.lang.String accessToken) throws java.rmi.RemoteException{
    if (consolidatorWebServiceSoap == null)
      _initConsolidatorWebServiceSoapProxy();
    return consolidatorWebServiceSoap.loadAndRecordLabeledPackage(xmlDoc, accessToken);
  }
  
  public com.usps_cpas.www.usps_cpas.GSSAPI.CommonResult determineIfPackageCanBeShipped(java.lang.String rateType, java.lang.String serviceType, java.lang.String destinationCountryCode, java.math.BigDecimal weight, java.lang.String weightUnit, int length, int width, int height, java.lang.String unitOfMeasurement, java.math.BigDecimal packageValueInUSD, java.lang.String accessToken) throws java.rmi.RemoteException{
    if (consolidatorWebServiceSoap == null)
      _initConsolidatorWebServiceSoapProxy();
    return consolidatorWebServiceSoap.determineIfPackageCanBeShipped(rateType, serviceType, destinationCountryCode, weight, weightUnit, length, width, height, unitOfMeasurement, packageValueInUSD, accessToken);
  }
  
  public com.usps_cpas.www.usps_cpas.GSSAPI.LabelResult getPackageLabels(java.lang.String packageID, java.lang.String mailingAgentID, int boxNumber, java.lang.String fileFormat, java.lang.String accessToken) throws java.rmi.RemoteException{
    if (consolidatorWebServiceSoap == null)
      _initConsolidatorWebServiceSoapProxy();
    return consolidatorWebServiceSoap.getPackageLabels(packageID, mailingAgentID, boxNumber, fileFormat, accessToken);
  }
  
  public com.usps_cpas.www.usps_cpas.GSSAPI.SearchForProcessedPackageResponseSearchForProcessedPackageResult searchForProcessedPackage(java.lang.String accessToken, java.lang.String packageID, java.lang.String orderID, java.lang.String recipientLastName, java.lang.String recipientFirstName, java.lang.String recipientBusinessName, java.lang.String recipientCountryCode) throws java.rmi.RemoteException{
    if (consolidatorWebServiceSoap == null)
      _initConsolidatorWebServiceSoapProxy();
    return consolidatorWebServiceSoap.searchForProcessedPackage(accessToken, packageID, orderID, recipientLastName, recipientFirstName, recipientBusinessName, recipientCountryCode);
  }
  
  public com.usps_cpas.www.usps_cpas.GSSAPI.LabelResult regeneratePackageCustomsLabel(java.lang.String packageID, java.lang.String mailingAgentID, int boxNumber, java.lang.String fileFormat, java.lang.String accessToken) throws java.rmi.RemoteException{
    if (consolidatorWebServiceSoap == null)
      _initConsolidatorWebServiceSoapProxy();
    return consolidatorWebServiceSoap.regeneratePackageCustomsLabel(packageID, mailingAgentID, boxNumber, fileFormat, accessToken);
  }
  
  public com.usps_cpas.www.usps_cpas.GSSAPI.CommonResult logoutUser(java.lang.String accessToken) throws java.rmi.RemoteException{
    if (consolidatorWebServiceSoap == null)
      _initConsolidatorWebServiceSoapProxy();
    return consolidatorWebServiceSoap.logoutUser(accessToken);
  }
  
  public com.usps_cpas.www.usps_cpas.GSSAPI.ReceptacleResult createPMODReceptacleByFacilityTypeInCurrentShipment(java.lang.String facilityType, java.lang.String facilityZipCode, java.lang.String receptacleType, java.util.Calendar dateOfMailing, java.lang.String facilityName, java.lang.String accessToken) throws java.rmi.RemoteException{
    if (consolidatorWebServiceSoap == null)
      _initConsolidatorWebServiceSoapProxy();
    return consolidatorWebServiceSoap.createPMODReceptacleByFacilityTypeInCurrentShipment(facilityType, facilityZipCode, receptacleType, dateOfMailing, facilityName, accessToken);
  }
  
  public com.usps_cpas.www.usps_cpas.GSSAPI.ReceptacleResult createPMODReceptacleInCurrentShipment(java.lang.String productCode, java.lang.String pmodDDU, java.lang.String dduCity, java.lang.String dduState, java.lang.String receptacleType, java.util.Calendar dateOfMailing, java.lang.String locationID, java.lang.String userID, java.lang.String workstationID, java.math.BigDecimal weightInLbs, java.lang.String accessToken) throws java.rmi.RemoteException{
    if (consolidatorWebServiceSoap == null)
      _initConsolidatorWebServiceSoapProxy();
    return consolidatorWebServiceSoap.createPMODReceptacleInCurrentShipment(productCode, pmodDDU, dduCity, dduState, receptacleType, dateOfMailing, locationID, userID, workstationID, weightInLbs, accessToken);
  }
  
  public com.usps_cpas.www.usps_cpas.GSSAPI.ReceptacleResult createNewReceptacleInCurrentShipment(java.lang.String productCode, java.lang.String serviceCode, java.lang.String receptacleType, java.lang.String foreignCountryCode, java.lang.String foreignOECode, java.util.Calendar dateOfMailing, java.lang.String accessToken) throws java.rmi.RemoteException{
    if (consolidatorWebServiceSoap == null)
      _initConsolidatorWebServiceSoapProxy();
    return consolidatorWebServiceSoap.createNewReceptacleInCurrentShipment(productCode, serviceCode, receptacleType, foreignCountryCode, foreignOECode, dateOfMailing, accessToken);
  }
  
  public com.usps_cpas.www.usps_cpas.GSSAPI.ReceptacleResult createReceptacleInCurrentShipmentV2(java.lang.String productCode, java.lang.String serviceCode, java.lang.String receptacleType, java.lang.String foreignCountryCode, java.lang.String foreignOECode, java.util.Calendar dateOfMailing, int pieceCount, java.math.BigDecimal weightInLbs, java.lang.String accessToken) throws java.rmi.RemoteException{
    if (consolidatorWebServiceSoap == null)
      _initConsolidatorWebServiceSoapProxy();
    return consolidatorWebServiceSoap.createReceptacleInCurrentShipmentV2(productCode, serviceCode, receptacleType, foreignCountryCode, foreignOECode, dateOfMailing, pieceCount, weightInLbs, accessToken);
  }
  
  public com.usps_cpas.www.usps_cpas.GSSAPI.ReceptacleResult createReceptacleForRateType(java.lang.String rateType, boolean dutiable, java.lang.String receptacleType, java.lang.String foreignOECode, java.util.Calendar dateOfMailing, int pieceCount, java.math.BigDecimal weightInLbs, java.lang.String accessToken) throws java.rmi.RemoteException{
    if (consolidatorWebServiceSoap == null)
      _initConsolidatorWebServiceSoapProxy();
    return consolidatorWebServiceSoap.createReceptacleForRateType(rateType, dutiable, receptacleType, foreignOECode, dateOfMailing, pieceCount, weightInLbs, accessToken);
  }
  
  public com.usps_cpas.www.usps_cpas.GSSAPI.ReceptacleResult createMixedReceptacleInCurrentShipment(java.lang.String rateType, java.lang.String rateGroup, int pieceCount, java.math.BigDecimal weightInLbs, java.lang.String packageShape, java.lang.String accessToken) throws java.rmi.RemoteException{
    if (consolidatorWebServiceSoap == null)
      _initConsolidatorWebServiceSoapProxy();
    return consolidatorWebServiceSoap.createMixedReceptacleInCurrentShipment(rateType, rateGroup, pieceCount, weightInLbs, packageShape, accessToken);
  }
  
  public com.usps_cpas.www.usps_cpas.GSSAPI.ReceptacleResult createMixedReceptacleInCurrentShipmentV2(java.lang.String productCode, java.lang.String rateGroup, int pieceCount, java.math.BigDecimal weightInLbs, java.lang.String packageShape, java.lang.String accessToken) throws java.rmi.RemoteException{
    if (consolidatorWebServiceSoap == null)
      _initConsolidatorWebServiceSoapProxy();
    return consolidatorWebServiceSoap.createMixedReceptacleInCurrentShipmentV2(productCode, rateGroup, pieceCount, weightInLbs, packageShape, accessToken);
  }
  
  public com.usps_cpas.www.usps_cpas.GSSAPI.ReceptacleResult createMixedReceptacleForRateType(java.lang.String rateType, java.lang.String rateGroup, boolean dutiable, java.lang.String receptacleType, java.util.Calendar dateOfMailing, int pieceCount, java.math.BigDecimal weightInLbs, java.lang.String accessToken) throws java.rmi.RemoteException{
    if (consolidatorWebServiceSoap == null)
      _initConsolidatorWebServiceSoapProxy();
    return consolidatorWebServiceSoap.createMixedReceptacleForRateType(rateType, rateGroup, dutiable, receptacleType, dateOfMailing, pieceCount, weightInLbs, accessToken);
  }
  
  public com.usps_cpas.www.usps_cpas.GSSAPI.ReceptacleResult createMixedReceptacleForRateTypeWithTareWeight(java.lang.String rateType, java.lang.String rateGroup, boolean dutiable, java.lang.String receptacleType, java.util.Calendar dateOfMailing, int pieceCount, java.math.BigDecimal weightInLbs, java.math.BigDecimal tareWeight, java.lang.String accessToken) throws java.rmi.RemoteException{
    if (consolidatorWebServiceSoap == null)
      _initConsolidatorWebServiceSoapProxy();
    return consolidatorWebServiceSoap.createMixedReceptacleForRateTypeWithTareWeight(rateType, rateGroup, dutiable, receptacleType, dateOfMailing, pieceCount, weightInLbs, tareWeight, accessToken);
  }
  
  public com.usps_cpas.www.usps_cpas.GSSAPI.LabelResult getReceptacleLabel(java.lang.String receptacleID, java.lang.String fileFormat, java.lang.String accessToken) throws java.rmi.RemoteException{
    if (consolidatorWebServiceSoap == null)
      _initConsolidatorWebServiceSoapProxy();
    return consolidatorWebServiceSoap.getReceptacleLabel(receptacleID, fileFormat, accessToken);
  }
  
  public com.usps_cpas.www.usps_cpas.GSSAPI.CommonResult addReceptacleToCurrentShipment(java.lang.String receptacleID, java.lang.String accessToken) throws java.rmi.RemoteException{
    if (consolidatorWebServiceSoap == null)
      _initConsolidatorWebServiceSoapProxy();
    return consolidatorWebServiceSoap.addReceptacleToCurrentShipment(receptacleID, accessToken);
  }
  
  public com.usps_cpas.www.usps_cpas.GSSAPI.ReceptacleResult setPPMODIReceptacleInCurrentShipment(java.lang.String receptacleID, java.lang.String PPMODIReceptacleID, java.lang.String accessToken) throws java.rmi.RemoteException{
    if (consolidatorWebServiceSoap == null)
      _initConsolidatorWebServiceSoapProxy();
    return consolidatorWebServiceSoap.setPPMODIReceptacleInCurrentShipment(receptacleID, PPMODIReceptacleID, accessToken);
  }
  
  public com.usps_cpas.www.usps_cpas.GSSAPI.ReceptacleResult createPassThroughReceptacleInCurrentShipment(java.lang.String productCode, java.lang.String serviceCode, java.lang.String receptacleType, java.lang.String foreignCountryCode, java.lang.String foreignOECode, java.util.Calendar dateOfMailing, int pieceCount, java.math.BigDecimal weightInLbs, java.lang.String ppmodISC, java.lang.String receptacleTypeName, java.lang.String accessToken) throws java.rmi.RemoteException{
    if (consolidatorWebServiceSoap == null)
      _initConsolidatorWebServiceSoapProxy();
    return consolidatorWebServiceSoap.createPassThroughReceptacleInCurrentShipment(productCode, serviceCode, receptacleType, foreignCountryCode, foreignOECode, dateOfMailing, pieceCount, weightInLbs, ppmodISC, receptacleTypeName, accessToken);
  }
  
  public com.usps_cpas.www.usps_cpas.GSSAPI.AddReceptacleResult addReceptacleToCurrentShipmentV2(java.lang.String receptacleID, int pieceCount, java.math.BigDecimal weightInLbs, java.lang.String destinationCountryCode, java.lang.String accessToken) throws java.rmi.RemoteException{
    if (consolidatorWebServiceSoap == null)
      _initConsolidatorWebServiceSoapProxy();
    return consolidatorWebServiceSoap.addReceptacleToCurrentShipmentV2(receptacleID, pieceCount, weightInLbs, destinationCountryCode, accessToken);
  }
  
  public com.usps_cpas.www.usps_cpas.GSSAPI.CommonResult removePackageFromDefaultShipment(java.lang.String USPSPackageTrackingID, java.lang.String accessToken) throws java.rmi.RemoteException{
    if (consolidatorWebServiceSoap == null)
      _initConsolidatorWebServiceSoapProxy();
    return consolidatorWebServiceSoap.removePackageFromDefaultShipment(USPSPackageTrackingID, accessToken);
  }
  
  public com.usps_cpas.www.usps_cpas.GSSAPI.CommonResult addRemovedPackageToDefaultShipment(java.lang.String USPSPackageTrackingID, java.lang.String accessToken) throws java.rmi.RemoteException{
    if (consolidatorWebServiceSoap == null)
      _initConsolidatorWebServiceSoapProxy();
    return consolidatorWebServiceSoap.addRemovedPackageToDefaultShipment(USPSPackageTrackingID, accessToken);
  }
  
  public com.usps_cpas.www.usps_cpas.GSSAPI.CommonResult removeReceptacleFromDefaultShipment(java.lang.String receptacleID, java.lang.String accessToken) throws java.rmi.RemoteException{
    if (consolidatorWebServiceSoap == null)
      _initConsolidatorWebServiceSoapProxy();
    return consolidatorWebServiceSoap.removeReceptacleFromDefaultShipment(receptacleID, accessToken);
  }
  
  public com.usps_cpas.www.usps_cpas.GSSAPI.CommonResult moveShipmentToOpenDispatch(java.lang.String shipmentID, java.lang.String accessToken) throws java.rmi.RemoteException{
    if (consolidatorWebServiceSoap == null)
      _initConsolidatorWebServiceSoapProxy();
    return consolidatorWebServiceSoap.moveShipmentToOpenDispatch(shipmentID, accessToken);
  }
  
  public com.usps_cpas.www.usps_cpas.GSSAPI.CommonResult moveReceptacleToOpenDispatch(java.lang.String receptacleID, java.lang.String accessToken) throws java.rmi.RemoteException{
    if (consolidatorWebServiceSoap == null)
      _initConsolidatorWebServiceSoapProxy();
    return consolidatorWebServiceSoap.moveReceptacleToOpenDispatch(receptacleID, accessToken);
  }
  
  public com.usps_cpas.www.usps_cpas.GSSAPI.GenerateReportResult generateReportByPermitNumber(java.lang.String dispatchID, java.lang.String reportName, java.lang.String requestFormat, java.lang.String permitNumber, java.lang.String accessToken) throws java.rmi.RemoteException{
    if (consolidatorWebServiceSoap == null)
      _initConsolidatorWebServiceSoapProxy();
    return consolidatorWebServiceSoap.generateReportByPermitNumber(dispatchID, reportName, requestFormat, permitNumber, accessToken);
  }
  
  public com.usps_cpas.www.usps_cpas.GSSAPI.GenerateReportResult getDispatchReport(java.lang.String dispatchID, java.lang.String reportName, java.lang.String requestFormat, java.lang.String accessToken) throws java.rmi.RemoteException{
    if (consolidatorWebServiceSoap == null)
      _initConsolidatorWebServiceSoapProxy();
    return consolidatorWebServiceSoap.getDispatchReport(dispatchID, reportName, requestFormat, accessToken);
  }
  
  public com.usps_cpas.www.usps_cpas.GSSAPI.CommonResult removeReceptacleFromOpenDispatch(java.lang.String receptacleID, java.lang.String accessToken) throws java.rmi.RemoteException{
    if (consolidatorWebServiceSoap == null)
      _initConsolidatorWebServiceSoapProxy();
    return consolidatorWebServiceSoap.removeReceptacleFromOpenDispatch(receptacleID, accessToken);
  }
  
  public com.usps_cpas.www.usps_cpas.GSSAPI.CommonResult removePackageFromOpenDispatch(java.lang.String USPSPackageTrackingID, java.lang.String accessToken) throws java.rmi.RemoteException{
    if (consolidatorWebServiceSoap == null)
      _initConsolidatorWebServiceSoapProxy();
    return consolidatorWebServiceSoap.removePackageFromOpenDispatch(USPSPackageTrackingID, accessToken);
  }
  
  public com.usps_cpas.www.usps_cpas.GSSAPI.CommonResult movePackageToOpenDispatch(java.lang.String USPSPackageTrackingID, java.lang.String accessToken) throws java.rmi.RemoteException{
    if (consolidatorWebServiceSoap == null)
      _initConsolidatorWebServiceSoapProxy();
    return consolidatorWebServiceSoap.movePackageToOpenDispatch(USPSPackageTrackingID, accessToken);
  }
  
  public com.usps_cpas.www.usps_cpas.GSSAPI.ShipmentDetailResult getCurrentShipment(java.lang.String accessToken) throws java.rmi.RemoteException{
    if (consolidatorWebServiceSoap == null)
      _initConsolidatorWebServiceSoapProxy();
    return consolidatorWebServiceSoap.getCurrentShipment(accessToken);
  }
  
  public com.usps_cpas.www.usps_cpas.GSSAPI.ShipmentDetailResult getCurrentDispatch(java.lang.String accessToken) throws java.rmi.RemoteException{
    if (consolidatorWebServiceSoap == null)
      _initConsolidatorWebServiceSoapProxy();
    return consolidatorWebServiceSoap.getCurrentDispatch(accessToken);
  }
  
  public com.usps_cpas.www.usps_cpas.GSSAPI.CloseDispatchResult closeDispatch(java.lang.String vehicleNum, java.lang.String vehicleType, java.lang.String depDateTime, java.lang.String arrDateTime, java.lang.String accessToken) throws java.rmi.RemoteException{
    if (consolidatorWebServiceSoap == null)
      _initConsolidatorWebServiceSoapProxy();
    return consolidatorWebServiceSoap.closeDispatch(vehicleNum, vehicleType, depDateTime, arrDateTime, accessToken);
  }
  
  public com.usps_cpas.www.usps_cpas.GSSAPI.ShipmentQueueResult getShipmentQueue(java.lang.String accessToken) throws java.rmi.RemoteException{
    if (consolidatorWebServiceSoap == null)
      _initConsolidatorWebServiceSoapProxy();
    return consolidatorWebServiceSoap.getShipmentQueue(accessToken);
  }
  
  public com.usps_cpas.www.usps_cpas.GSSAPI.GenerateReportResult getShipmentReport(java.lang.String shipmentID, java.lang.String reportName, java.lang.String requestFormat, java.lang.String accessToken) throws java.rmi.RemoteException{
    if (consolidatorWebServiceSoap == null)
      _initConsolidatorWebServiceSoapProxy();
    return consolidatorWebServiceSoap.getShipmentReport(shipmentID, reportName, requestFormat, accessToken);
  }
  
  public com.usps_cpas.www.usps_cpas.GSSAPI.ShipmentDetailResult getShipmentDetails(java.lang.String shipmentID, java.lang.String accessToken) throws java.rmi.RemoteException{
    if (consolidatorWebServiceSoap == null)
      _initConsolidatorWebServiceSoapProxy();
    return consolidatorWebServiceSoap.getShipmentDetails(shipmentID, accessToken);
  }
  
  public com.usps_cpas.www.usps_cpas.GSSAPI.GetClosedDispatchesListResponseGetClosedDispatchesListResult getClosedDispatchesList(java.lang.String startDate, java.lang.String endDate, java.lang.String accessToken) throws java.rmi.RemoteException{
    if (consolidatorWebServiceSoap == null)
      _initConsolidatorWebServiceSoapProxy();
    return consolidatorWebServiceSoap.getClosedDispatchesList(startDate, endDate, accessToken);
  }
  
  public com.usps_cpas.www.usps_cpas.GSSAPI.LoadPackageDataResponseLoadPackageDataResult loadPackageData(com.usps_cpas.www.usps_cpas.GSSAPI.LoadPackageDataXmlDoc xmlDoc, java.lang.String accessToken) throws java.rmi.RemoteException{
    if (consolidatorWebServiceSoap == null)
      _initConsolidatorWebServiceSoapProxy();
    return consolidatorWebServiceSoap.loadPackageData(xmlDoc, accessToken);
  }
  
  public com.usps_cpas.www.usps_cpas.GSSAPI.VerifyGXGPackageResponseVerifyGXGPackageResult verifyGXGPackage(java.lang.String packageID, java.lang.String mailingAgentID, int boxNumber, com.usps_cpas.www.usps_cpas.GSSAPI.VerifyGXGPackageGXGRequest GXGRequest, java.lang.String accessToken) throws java.rmi.RemoteException{
    if (consolidatorWebServiceSoap == null)
      _initConsolidatorWebServiceSoapProxy();
    return consolidatorWebServiceSoap.verifyGXGPackage(packageID, mailingAgentID, boxNumber, GXGRequest, accessToken);
  }
  
  public com.usps_cpas.www.usps_cpas.GSSAPI.VerifyGXGPackageToDestinationLocationResponseVerifyGXGPackageToDestinationLocationResult verifyGXGPackageToDestinationLocation(java.lang.String packageID, java.lang.String mailingAgentID, int boxNumber, java.lang.String destinationLocationID, com.usps_cpas.www.usps_cpas.GSSAPI.VerifyGXGPackageToDestinationLocationGXGRequest GXGRequest, java.lang.String accessToken) throws java.rmi.RemoteException{
    if (consolidatorWebServiceSoap == null)
      _initConsolidatorWebServiceSoapProxy();
    return consolidatorWebServiceSoap.verifyGXGPackageToDestinationLocation(packageID, mailingAgentID, boxNumber, destinationLocationID, GXGRequest, accessToken);
  }
  
  public com.usps_cpas.www.usps_cpas.GSSAPI.GXGCommodityInfoResult getGXGCommodityInfo(java.lang.String accessToken) throws java.rmi.RemoteException{
    if (consolidatorWebServiceSoap == null)
      _initConsolidatorWebServiceSoapProxy();
    return consolidatorWebServiceSoap.getGXGCommodityInfo(accessToken);
  }
  
  public com.usps_cpas.www.usps_cpas.GSSAPI.CommonResult labelGXGPackage(java.lang.String packageID, java.lang.String mailingAgentID, int boxNumber, java.lang.String accessToken) throws java.rmi.RemoteException{
    if (consolidatorWebServiceSoap == null)
      _initConsolidatorWebServiceSoapProxy();
    return consolidatorWebServiceSoap.labelGXGPackage(packageID, mailingAgentID, boxNumber, accessToken);
  }
  
  public com.usps_cpas.www.usps_cpas.GSSAPI.CommonResult labelGXGPackageToDestinationLocation(java.lang.String packageID, java.lang.String mailingAgentID, int boxNumber, java.lang.String destinationLocationID, java.lang.String accessToken) throws java.rmi.RemoteException{
    if (consolidatorWebServiceSoap == null)
      _initConsolidatorWebServiceSoapProxy();
    return consolidatorWebServiceSoap.labelGXGPackageToDestinationLocation(packageID, mailingAgentID, boxNumber, destinationLocationID, accessToken);
  }
  
  public com.usps_cpas.www.usps_cpas.GSSAPI.GetAvailableReportResult getAvailableReportsForDispatch(java.lang.String dispatchID, java.lang.String accessToken) throws java.rmi.RemoteException{
    if (consolidatorWebServiceSoap == null)
      _initConsolidatorWebServiceSoapProxy();
    return consolidatorWebServiceSoap.getAvailableReportsForDispatch(dispatchID, accessToken);
  }
  
  public com.usps_cpas.www.usps_cpas.GSSAPI.GetAvailableReportResult getRequiredReportsForDispatch(java.lang.String dispatchID, java.lang.String accessToken) throws java.rmi.RemoteException{
    if (consolidatorWebServiceSoap == null)
      _initConsolidatorWebServiceSoapProxy();
    return consolidatorWebServiceSoap.getRequiredReportsForDispatch(dispatchID, accessToken);
  }
  
  public com.usps_cpas.www.usps_cpas.GSSAPI.DestinationLocationsResult getDestinationLocations(java.lang.String accessToken) throws java.rmi.RemoteException{
    if (consolidatorWebServiceSoap == null)
      _initConsolidatorWebServiceSoapProxy();
    return consolidatorWebServiceSoap.getDestinationLocations(accessToken);
  }
  
  public com.usps_cpas.www.usps_cpas.GSSAPI.ExpectedShipResult getExpectedShipDate(java.lang.String destinationLocationID, java.lang.String accessToken) throws java.rmi.RemoteException{
    if (consolidatorWebServiceSoap == null)
      _initConsolidatorWebServiceSoapProxy();
    return consolidatorWebServiceSoap.getExpectedShipDate(destinationLocationID, accessToken);
  }
  
  public com.usps_cpas.www.usps_cpas.GSSAPI.CommonResult setExpectedShipDate(java.lang.String destinationLocationID, java.lang.String expectedShipDate, java.lang.String accessToken) throws java.rmi.RemoteException{
    if (consolidatorWebServiceSoap == null)
      _initConsolidatorWebServiceSoapProxy();
    return consolidatorWebServiceSoap.setExpectedShipDate(destinationLocationID, expectedShipDate, accessToken);
  }
  
  public com.usps_cpas.www.usps_cpas.GSSAPI.CommonResult addPackageInReceptacle(java.lang.String USPSPackageTrackingID, java.lang.String receptacleID, java.lang.String accessToken) throws java.rmi.RemoteException{
    if (consolidatorWebServiceSoap == null)
      _initConsolidatorWebServiceSoapProxy();
    return consolidatorWebServiceSoap.addPackageInReceptacle(USPSPackageTrackingID, receptacleID, accessToken);
  }
  
  public com.usps_cpas.www.usps_cpas.GSSAPI.CommonResult addPackagesToReceptacle(java.lang.String USPSPackageID, java.lang.String receptacleID, java.lang.String accessToken) throws java.rmi.RemoteException{
    if (consolidatorWebServiceSoap == null)
      _initConsolidatorWebServiceSoapProxy();
    return consolidatorWebServiceSoap.addPackagesToReceptacle(USPSPackageID, receptacleID, accessToken);
  }
  
  public com.usps_cpas.www.usps_cpas.GSSAPI.CommonResult removePackageFromReceptacle(java.lang.String USPSPackageTrackingID, java.lang.String receptacleID, java.lang.String accessToken) throws java.rmi.RemoteException{
    if (consolidatorWebServiceSoap == null)
      _initConsolidatorWebServiceSoapProxy();
    return consolidatorWebServiceSoap.removePackageFromReceptacle(USPSPackageTrackingID, receptacleID, accessToken);
  }
  
  public com.usps_cpas.www.usps_cpas.GSSAPI.OpenReceptaclesResult getOpenReceptacles(java.lang.String availableForPackagesOnly, java.lang.String accessToken) throws java.rmi.RemoteException{
    if (consolidatorWebServiceSoap == null)
      _initConsolidatorWebServiceSoapProxy();
    return consolidatorWebServiceSoap.getOpenReceptacles(availableForPackagesOnly, accessToken);
  }
  
  public com.usps_cpas.www.usps_cpas.GSSAPI.TrackingWithPostalCodeResult trackPackageWithPostalCode(java.lang.String packageID, java.lang.String mailingAgentID, int boxNumber, java.lang.String accessToken) throws java.rmi.RemoteException{
    if (consolidatorWebServiceSoap == null)
      _initConsolidatorWebServiceSoapProxy();
    return consolidatorWebServiceSoap.trackPackageWithPostalCode(packageID, mailingAgentID, boxNumber, accessToken);
  }
  
  public com.usps_cpas.www.usps_cpas.GSSAPI.TrackResult trackPackage(java.lang.String packageID, java.lang.String mailingAgentID, int boxNumber, java.lang.String accessToken) throws java.rmi.RemoteException{
    if (consolidatorWebServiceSoap == null)
      _initConsolidatorWebServiceSoapProxy();
    return consolidatorWebServiceSoap.trackPackage(packageID, mailingAgentID, boxNumber, accessToken);
  }
  
  public com.usps_cpas.www.usps_cpas.GSSAPI.RetrieveTrackingEventsSinceDateResponseRetrieveTrackingEventsSinceDateResult retrieveTrackingEventsSinceDate(java.lang.String sinceDate, java.lang.String accessToken) throws java.rmi.RemoteException{
    if (consolidatorWebServiceSoap == null)
      _initConsolidatorWebServiceSoapProxy();
    return consolidatorWebServiceSoap.retrieveTrackingEventsSinceDate(sinceDate, accessToken);
  }
  
  public com.usps_cpas.www.usps_cpas.GSSAPI.RetrieveReceptacleTrackingEventsSinceDateResponseRetrieveReceptacleTrackingEventsSinceDateResult retrieveReceptacleTrackingEventsSinceDate(java.lang.String sinceDate, java.lang.String accessToken) throws java.rmi.RemoteException{
    if (consolidatorWebServiceSoap == null)
      _initConsolidatorWebServiceSoapProxy();
    return consolidatorWebServiceSoap.retrieveReceptacleTrackingEventsSinceDate(sinceDate, accessToken);
  }
  
  public com.usps_cpas.www.usps_cpas.GSSAPI.ReceptacleResult createPassThroughReceptacleForRateType(java.lang.String rateType, boolean dutiable, java.lang.String receptacleType, java.lang.String foreignOECode, java.lang.String countryCode, java.util.Calendar dateOfMailing, int pieceCount, java.math.BigDecimal weightInLbs, java.lang.String ppmodISC, java.lang.String accessToken) throws java.rmi.RemoteException{
    if (consolidatorWebServiceSoap == null)
      _initConsolidatorWebServiceSoapProxy();
    return consolidatorWebServiceSoap.createPassThroughReceptacleForRateType(rateType, dutiable, receptacleType, foreignOECode, countryCode, dateOfMailing, pieceCount, weightInLbs, ppmodISC, accessToken);
  }
  
  public com.usps_cpas.www.usps_cpas.GSSAPI.ReceptacleResult createReceptacleForRateTypeToDestination(java.lang.String rateType, boolean dutiable, java.lang.String receptacleType, java.lang.String foreignOECode, java.lang.String countryCode, java.util.Calendar dateOfMailing, int pieceCount, java.math.BigDecimal weightInLbs, java.lang.String accessToken) throws java.rmi.RemoteException{
    if (consolidatorWebServiceSoap == null)
      _initConsolidatorWebServiceSoapProxy();
    return consolidatorWebServiceSoap.createReceptacleForRateTypeToDestination(rateType, dutiable, receptacleType, foreignOECode, countryCode, dateOfMailing, pieceCount, weightInLbs, accessToken);
  }
  
  public com.usps_cpas.www.usps_cpas.GSSAPI.ReceptacleResult createReceptacleForRateTypeToDestinationWithTareWeight(java.lang.String rateType, boolean dutiable, java.lang.String receptacleType, java.lang.String foreignOECode, java.lang.String countryCode, java.util.Calendar dateOfMailing, int pieceCount, java.math.BigDecimal weightInLbs, java.math.BigDecimal tareWeight, java.lang.String accessToken) throws java.rmi.RemoteException{
    if (consolidatorWebServiceSoap == null)
      _initConsolidatorWebServiceSoapProxy();
    return consolidatorWebServiceSoap.createReceptacleForRateTypeToDestinationWithTareWeight(rateType, dutiable, receptacleType, foreignOECode, countryCode, dateOfMailing, pieceCount, weightInLbs, tareWeight, accessToken);
  }
  
  public com.usps_cpas.www.usps_cpas.GSSAPI.CommonResult USPSPartnerPackageProcessing(java.lang.String USPSPackageID, java.lang.String destinationLocationID, com.usps_cpas.www.usps_cpas.GSSAPI.USPSPartnerPackageProcessingXmlDoc xmlDoc, java.lang.String accessToken) throws java.rmi.RemoteException{
    if (consolidatorWebServiceSoap == null)
      _initConsolidatorWebServiceSoapProxy();
    return consolidatorWebServiceSoap.USPSPartnerPackageProcessing(USPSPackageID, destinationLocationID, xmlDoc, accessToken);
  }
  
  public com.usps_cpas.www.usps_cpas.GSSAPI.LabelResult getZPLLabelsForPackage(java.lang.String packageID, java.lang.String mailingAgentID, int boxNumber, java.lang.String accessToken) throws java.rmi.RemoteException{
    if (consolidatorWebServiceSoap == null)
      _initConsolidatorWebServiceSoapProxy();
    return consolidatorWebServiceSoap.getZPLLabelsForPackage(packageID, mailingAgentID, boxNumber, accessToken);
  }
  
  public com.usps_cpas.www.usps_cpas.GSSAPI.ShipmentDetailResult getCurrentShipmentByRange(java.lang.String accessToken, int startRowNumber, int endRowNumber) throws java.rmi.RemoteException{
    if (consolidatorWebServiceSoap == null)
      _initConsolidatorWebServiceSoapProxy();
    return consolidatorWebServiceSoap.getCurrentShipmentByRange(accessToken, startRowNumber, endRowNumber);
  }
  
  public com.usps_cpas.www.usps_cpas.GSSAPI.CommonResult getPortCodeListForRateTypeAndDestination(java.lang.String rateType, java.lang.String countryCode, java.lang.String accessToken) throws java.rmi.RemoteException{
    if (consolidatorWebServiceSoap == null)
      _initConsolidatorWebServiceSoapProxy();
    return consolidatorWebServiceSoap.getPortCodeListForRateTypeAndDestination(rateType, countryCode, accessToken);
  }
  
  public com.usps_cpas.www.usps_cpas.GSSAPI.CalculatePostageResult calculatePostage(com.usps_cpas.www.usps_cpas.GSSAPI.CalculatePostageXmlDoc xmlDoc, java.lang.String accessToken) throws java.rmi.RemoteException{
    if (consolidatorWebServiceSoap == null)
      _initConsolidatorWebServiceSoapProxy();
    return consolidatorWebServiceSoap.calculatePostage(xmlDoc, accessToken);
  }
  
  public com.usps_cpas.www.usps_cpas.GSSAPI.CommonResult getAvailableCustomInsuredAmountList(java.lang.String rateType, java.lang.String serviceType, java.lang.String accessToken) throws java.rmi.RemoteException{
    if (consolidatorWebServiceSoap == null)
      _initConsolidatorWebServiceSoapProxy();
    return consolidatorWebServiceSoap.getAvailableCustomInsuredAmountList(rateType, serviceType, accessToken);
  }
  
  public com.usps_cpas.www.usps_cpas.GSSAPI.CommonResult uploadPackageFile(byte[] fileData, java.lang.String fileName, java.lang.String accessToken) throws java.rmi.RemoteException{
    if (consolidatorWebServiceSoap == null)
      _initConsolidatorWebServiceSoapProxy();
    return consolidatorWebServiceSoap.uploadPackageFile(fileData, fileName, accessToken);
  }
  
  public com.usps_cpas.www.usps_cpas.GSSAPI.CommonResult updateDomesticPackageWeight(java.lang.String USPSPackageID, java.math.BigDecimal weight, java.lang.String weightUnit, java.lang.String accessToken) throws java.rmi.RemoteException{
    if (consolidatorWebServiceSoap == null)
      _initConsolidatorWebServiceSoapProxy();
    return consolidatorWebServiceSoap.updateDomesticPackageWeight(USPSPackageID, weight, weightUnit, accessToken);
  }
  
  public com.usps_cpas.www.usps_cpas.GSSAPI.CommonResult reopenDispatch(java.lang.String dispatchID, java.lang.String accessToken) throws java.rmi.RemoteException{
    if (consolidatorWebServiceSoap == null)
      _initConsolidatorWebServiceSoapProxy();
    return consolidatorWebServiceSoap.reopenDispatch(dispatchID, accessToken);
  }
  
  public com.usps_cpas.www.usps_cpas.GSSAPI.ValidateAddressResponseValidateAddressResult validateAddress(java.lang.String recipientAddressLine1, java.lang.String recipientAddressLine2, java.lang.String recipientCity, java.lang.String recipientState, java.lang.String recipientPostalCode, java.lang.String recipientCountryCode, java.lang.String accessToken) throws java.rmi.RemoteException{
    if (consolidatorWebServiceSoap == null)
      _initConsolidatorWebServiceSoapProxy();
    return consolidatorWebServiceSoap.validateAddress(recipientAddressLine1, recipientAddressLine2, recipientCity, recipientState, recipientPostalCode, recipientCountryCode, accessToken);
  }
  
  
}