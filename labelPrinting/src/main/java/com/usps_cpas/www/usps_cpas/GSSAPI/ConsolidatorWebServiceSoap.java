/**
 * ConsolidatorWebServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.usps_cpas.www.usps_cpas.GSSAPI;

public interface ConsolidatorWebServiceSoap extends java.rmi.Remote {

    /**
     * For GSS support use only. Refreshes the Web Component.
     */
    public boolean refreshWebComponent(java.lang.String val) throws java.rmi.RemoteException;

    /**
     * This method is called first to consume GSS Mailer Web Services.
     * Use the returned access token for each subsequent request.  The token
     * has a session timeout of 20 minutes.
     */
    public com.usps_cpas.www.usps_cpas.GSSAPI.AuthenticateResult authenticateUser(java.lang.String userID, java.lang.String password, java.lang.String locationID, java.lang.String workstationID) throws java.rmi.RemoteException;

    /**
     * Accepts package data from an originating mailer in the predefined
     * XML format. Used by labeling locations only.
     */
    public com.usps_cpas.www.usps_cpas.GSSAPI.LoadAndRecordLabeledPackageResponseLoadAndRecordLabeledPackageResult loadAndRecordLabeledPackage(com.usps_cpas.www.usps_cpas.GSSAPI.LoadAndRecordLabeledPackageXmlDoc xmlDoc, java.lang.String accessToken) throws java.rmi.RemoteException;
    public com.usps_cpas.www.usps_cpas.GSSAPI.CommonResult determineIfPackageCanBeShipped(java.lang.String rateType, java.lang.String serviceType, java.lang.String destinationCountryCode, java.math.BigDecimal weight, java.lang.String weightUnit, int length, int width, int height, java.lang.String unitOfMeasurement, java.math.BigDecimal packageValueInUSD, java.lang.String accessToken) throws java.rmi.RemoteException;

    /**
     * Retrieves labels for a specified package in JPG or PNG image
     * format.
     */
    public com.usps_cpas.www.usps_cpas.GSSAPI.LabelResult getPackageLabels(java.lang.String packageID, java.lang.String mailingAgentID, int boxNumber, java.lang.String fileFormat, java.lang.String accessToken) throws java.rmi.RemoteException;

    /**
     * Search for a processed package.
     */
    public com.usps_cpas.www.usps_cpas.GSSAPI.SearchForProcessedPackageResponseSearchForProcessedPackageResult searchForProcessedPackage(java.lang.String accessToken, java.lang.String packageID, java.lang.String orderID, java.lang.String recipientLastName, java.lang.String recipientFirstName, java.lang.String recipientBusinessName, java.lang.String recipientCountryCode) throws java.rmi.RemoteException;

    /**
     * Retrieves customs label for a specified package ID processed
     * up to 6 months.
     */
    public com.usps_cpas.www.usps_cpas.GSSAPI.LabelResult regeneratePackageCustomsLabel(java.lang.String packageID, java.lang.String mailingAgentID, int boxNumber, java.lang.String fileFormat, java.lang.String accessToken) throws java.rmi.RemoteException;

    /**
     * Logs out the user.
     */
    public com.usps_cpas.www.usps_cpas.GSSAPI.CommonResult logoutUser(java.lang.String accessToken) throws java.rmi.RemoteException;

    /**
     * Creates a PMOD receptacle by facility type in the current shipment
     */
    public com.usps_cpas.www.usps_cpas.GSSAPI.ReceptacleResult createPMODReceptacleByFacilityTypeInCurrentShipment(java.lang.String facilityType, java.lang.String facilityZipCode, java.lang.String receptacleType, java.util.Calendar dateOfMailing, java.lang.String facilityName, java.lang.String accessToken) throws java.rmi.RemoteException;

    /**
     * Creates a PMOD receptacle the current shipment
     */
    public com.usps_cpas.www.usps_cpas.GSSAPI.ReceptacleResult createPMODReceptacleInCurrentShipment(java.lang.String productCode, java.lang.String pmodDDU, java.lang.String dduCity, java.lang.String dduState, java.lang.String receptacleType, java.util.Calendar dateOfMailing, java.lang.String locationID, java.lang.String userID, java.lang.String workstationID, java.math.BigDecimal weightInLbs, java.lang.String accessToken) throws java.rmi.RemoteException;

    /**
     * Creates a new receptacle and adds it to the current shipment
     */
    public com.usps_cpas.www.usps_cpas.GSSAPI.ReceptacleResult createNewReceptacleInCurrentShipment(java.lang.String productCode, java.lang.String serviceCode, java.lang.String receptacleType, java.lang.String foreignCountryCode, java.lang.String foreignOECode, java.util.Calendar dateOfMailing, java.lang.String accessToken) throws java.rmi.RemoteException;

    /**
     * Creates a receptacle and adds it to the current shipment. Version
     * 2.0
     */
    public com.usps_cpas.www.usps_cpas.GSSAPI.ReceptacleResult createReceptacleInCurrentShipmentV2(java.lang.String productCode, java.lang.String serviceCode, java.lang.String receptacleType, java.lang.String foreignCountryCode, java.lang.String foreignOECode, java.util.Calendar dateOfMailing, int pieceCount, java.math.BigDecimal weightInLbs, java.lang.String accessToken) throws java.rmi.RemoteException;

    /**
     * Creates a receptacle for a rate type
     */
    public com.usps_cpas.www.usps_cpas.GSSAPI.ReceptacleResult createReceptacleForRateType(java.lang.String rateType, boolean dutiable, java.lang.String receptacleType, java.lang.String foreignOECode, java.util.Calendar dateOfMailing, int pieceCount, java.math.BigDecimal weightInLbs, java.lang.String accessToken) throws java.rmi.RemoteException;

    /**
     * Creates a mixed receptacle and adds it to the current shipment.
     * Version 2.0
     */
    public com.usps_cpas.www.usps_cpas.GSSAPI.ReceptacleResult createMixedReceptacleInCurrentShipment(java.lang.String rateType, java.lang.String rateGroup, int pieceCount, java.math.BigDecimal weightInLbs, java.lang.String packageShape, java.lang.String accessToken) throws java.rmi.RemoteException;

    /**
     * Creates a mixed receptacle and adds it to the current shipment.
     * Version 2.1
     */
    public com.usps_cpas.www.usps_cpas.GSSAPI.ReceptacleResult createMixedReceptacleInCurrentShipmentV2(java.lang.String productCode, java.lang.String rateGroup, int pieceCount, java.math.BigDecimal weightInLbs, java.lang.String packageShape, java.lang.String accessToken) throws java.rmi.RemoteException;

    /**
     * Creates a mixed receptacle for rate type and adds it to the
     * current shipment.
     */
    public com.usps_cpas.www.usps_cpas.GSSAPI.ReceptacleResult createMixedReceptacleForRateType(java.lang.String rateType, java.lang.String rateGroup, boolean dutiable, java.lang.String receptacleType, java.util.Calendar dateOfMailing, int pieceCount, java.math.BigDecimal weightInLbs, java.lang.String accessToken) throws java.rmi.RemoteException;

    /**
     * Creates a mixed receptacle for rate type with Tare Weight and
     * adds it to the current shipment.
     */
    public com.usps_cpas.www.usps_cpas.GSSAPI.ReceptacleResult createMixedReceptacleForRateTypeWithTareWeight(java.lang.String rateType, java.lang.String rateGroup, boolean dutiable, java.lang.String receptacleType, java.util.Calendar dateOfMailing, int pieceCount, java.math.BigDecimal weightInLbs, java.math.BigDecimal tareWeight, java.lang.String accessToken) throws java.rmi.RemoteException;

    /**
     * Retrieves labels for a specified Receptacle in JPG or PNG image
     * format.
     */
    public com.usps_cpas.www.usps_cpas.GSSAPI.LabelResult getReceptacleLabel(java.lang.String receptacleID, java.lang.String fileFormat, java.lang.String accessToken) throws java.rmi.RemoteException;

    /**
     * Add a receptacle to the current shipment
     */
    public com.usps_cpas.www.usps_cpas.GSSAPI.CommonResult addReceptacleToCurrentShipment(java.lang.String receptacleID, java.lang.String accessToken) throws java.rmi.RemoteException;

    /**
     * Sets PPMODI receptacle as a Parent Receptacle in the current
     * shipment.
     */
    public com.usps_cpas.www.usps_cpas.GSSAPI.ReceptacleResult setPPMODIReceptacleInCurrentShipment(java.lang.String receptacleID, java.lang.String PPMODIReceptacleID, java.lang.String accessToken) throws java.rmi.RemoteException;

    /**
     * Creates a Pass-Through receptacle in the current shipment.
     */
    public com.usps_cpas.www.usps_cpas.GSSAPI.ReceptacleResult createPassThroughReceptacleInCurrentShipment(java.lang.String productCode, java.lang.String serviceCode, java.lang.String receptacleType, java.lang.String foreignCountryCode, java.lang.String foreignOECode, java.util.Calendar dateOfMailing, int pieceCount, java.math.BigDecimal weightInLbs, java.lang.String ppmodISC, java.lang.String receptacleTypeName, java.lang.String accessToken) throws java.rmi.RemoteException;

    /**
     * Adds a receptacle to a current shipment. Version 2.0
     */
    public com.usps_cpas.www.usps_cpas.GSSAPI.AddReceptacleResult addReceptacleToCurrentShipmentV2(java.lang.String receptacleID, int pieceCount, java.math.BigDecimal weightInLbs, java.lang.String destinationCountryCode, java.lang.String accessToken) throws java.rmi.RemoteException;

    /**
     * Removes package from default shipment.
     */
    public com.usps_cpas.www.usps_cpas.GSSAPI.CommonResult removePackageFromDefaultShipment(java.lang.String USPSPackageTrackingID, java.lang.String accessToken) throws java.rmi.RemoteException;

    /**
     * Re-add a removed package to the default shipment listing.
     */
    public com.usps_cpas.www.usps_cpas.GSSAPI.CommonResult addRemovedPackageToDefaultShipment(java.lang.String USPSPackageTrackingID, java.lang.String accessToken) throws java.rmi.RemoteException;

    /**
     * Removes a receptacle from the default shipment listing
     */
    public com.usps_cpas.www.usps_cpas.GSSAPI.CommonResult removeReceptacleFromDefaultShipment(java.lang.String receptacleID, java.lang.String accessToken) throws java.rmi.RemoteException;

    /**
     * Moves a shipment to open dispatch
     */
    public com.usps_cpas.www.usps_cpas.GSSAPI.CommonResult moveShipmentToOpenDispatch(java.lang.String shipmentID, java.lang.String accessToken) throws java.rmi.RemoteException;

    /**
     * Moves a shipment to open dispatch
     */
    public com.usps_cpas.www.usps_cpas.GSSAPI.CommonResult moveReceptacleToOpenDispatch(java.lang.String receptacleID, java.lang.String accessToken) throws java.rmi.RemoteException;

    /**
     * Generates the requested report per permit number for a closed
     * dispatch.
     */
    public com.usps_cpas.www.usps_cpas.GSSAPI.GenerateReportResult generateReportByPermitNumber(java.lang.String dispatchID, java.lang.String reportName, java.lang.String requestFormat, java.lang.String permitNumber, java.lang.String accessToken) throws java.rmi.RemoteException;

    /**
     * Generates the requested report for a closed dispatch.
     */
    public com.usps_cpas.www.usps_cpas.GSSAPI.GenerateReportResult getDispatchReport(java.lang.String dispatchID, java.lang.String reportName, java.lang.String requestFormat, java.lang.String accessToken) throws java.rmi.RemoteException;

    /**
     * Moves a shipment to open dispatch
     */
    public com.usps_cpas.www.usps_cpas.GSSAPI.CommonResult removeReceptacleFromOpenDispatch(java.lang.String receptacleID, java.lang.String accessToken) throws java.rmi.RemoteException;

    /**
     * Moves a shipment to open dispatch
     */
    public com.usps_cpas.www.usps_cpas.GSSAPI.CommonResult removePackageFromOpenDispatch(java.lang.String USPSPackageTrackingID, java.lang.String accessToken) throws java.rmi.RemoteException;

    /**
     * Moves a shipment to open dispatch
     */
    public com.usps_cpas.www.usps_cpas.GSSAPI.CommonResult movePackageToOpenDispatch(java.lang.String USPSPackageTrackingID, java.lang.String accessToken) throws java.rmi.RemoteException;

    /**
     * Retrieves current shipment for a location
     */
    public com.usps_cpas.www.usps_cpas.GSSAPI.ShipmentDetailResult getCurrentShipment(java.lang.String accessToken) throws java.rmi.RemoteException;

    /**
     * Retrieves current dispatch for a location
     */
    public com.usps_cpas.www.usps_cpas.GSSAPI.ShipmentDetailResult getCurrentDispatch(java.lang.String accessToken) throws java.rmi.RemoteException;

    /**
     * Closes a currently open dispatch
     */
    public com.usps_cpas.www.usps_cpas.GSSAPI.CloseDispatchResult closeDispatch(java.lang.String vehicleNum, java.lang.String vehicleType, java.lang.String depDateTime, java.lang.String arrDateTime, java.lang.String accessToken) throws java.rmi.RemoteException;

    /**
     * Returns the list of shipments in the queue including the default
     * Shipment
     */
    public com.usps_cpas.www.usps_cpas.GSSAPI.ShipmentQueueResult getShipmentQueue(java.lang.String accessToken) throws java.rmi.RemoteException;

    /**
     * Generates the requested report for a closed shipment
     */
    public com.usps_cpas.www.usps_cpas.GSSAPI.GenerateReportResult getShipmentReport(java.lang.String shipmentID, java.lang.String reportName, java.lang.String requestFormat, java.lang.String accessToken) throws java.rmi.RemoteException;

    /**
     * Retrieves shipment details for a location.
     */
    public com.usps_cpas.www.usps_cpas.GSSAPI.ShipmentDetailResult getShipmentDetails(java.lang.String shipmentID, java.lang.String accessToken) throws java.rmi.RemoteException;

    /**
     * Retrieves shipment history for the location.
     */
    public com.usps_cpas.www.usps_cpas.GSSAPI.GetClosedDispatchesListResponseGetClosedDispatchesListResult getClosedDispatchesList(java.lang.String startDate, java.lang.String endDate, java.lang.String accessToken) throws java.rmi.RemoteException;

    /**
     * Accepts package data from a mailer in the predefined XML format.
     * Overwrites previous version if reloaded.
     */
    public com.usps_cpas.www.usps_cpas.GSSAPI.LoadPackageDataResponseLoadPackageDataResult loadPackageData(com.usps_cpas.www.usps_cpas.GSSAPI.LoadPackageDataXmlDoc xmlDoc, java.lang.String accessToken) throws java.rmi.RemoteException;

    /**
     * Verifies the GXG package for processing.
     */
    public com.usps_cpas.www.usps_cpas.GSSAPI.VerifyGXGPackageResponseVerifyGXGPackageResult verifyGXGPackage(java.lang.String packageID, java.lang.String mailingAgentID, int boxNumber, com.usps_cpas.www.usps_cpas.GSSAPI.VerifyGXGPackageGXGRequest GXGRequest, java.lang.String accessToken) throws java.rmi.RemoteException;

    /**
     * Verifies the GXG package for processing, with destination location
     * ID as an additional parameter.
     */
    public com.usps_cpas.www.usps_cpas.GSSAPI.VerifyGXGPackageToDestinationLocationResponseVerifyGXGPackageToDestinationLocationResult verifyGXGPackageToDestinationLocation(java.lang.String packageID, java.lang.String mailingAgentID, int boxNumber, java.lang.String destinationLocationID, com.usps_cpas.www.usps_cpas.GSSAPI.VerifyGXGPackageToDestinationLocationGXGRequest GXGRequest, java.lang.String accessToken) throws java.rmi.RemoteException;

    /**
     * Returns a list of commodity names used for GXG.
     */
    public com.usps_cpas.www.usps_cpas.GSSAPI.GXGCommodityInfoResult getGXGCommodityInfo(java.lang.String accessToken) throws java.rmi.RemoteException;

    /**
     * Processes a removed/re-entered or new GXG package.
     */
    public com.usps_cpas.www.usps_cpas.GSSAPI.CommonResult labelGXGPackage(java.lang.String packageID, java.lang.String mailingAgentID, int boxNumber, java.lang.String accessToken) throws java.rmi.RemoteException;

    /**
     * Processes a GXG package to a destination location. Used by
     * mailers who use multiple destination locations.
     */
    public com.usps_cpas.www.usps_cpas.GSSAPI.CommonResult labelGXGPackageToDestinationLocation(java.lang.String packageID, java.lang.String mailingAgentID, int boxNumber, java.lang.String destinationLocationID, java.lang.String accessToken) throws java.rmi.RemoteException;

    /**
     * Returns a list of all reports that are available for a dispatch.
     */
    public com.usps_cpas.www.usps_cpas.GSSAPI.GetAvailableReportResult getAvailableReportsForDispatch(java.lang.String dispatchID, java.lang.String accessToken) throws java.rmi.RemoteException;

    /**
     * Returns a list of all required reports that are available for
     * a dispatch.
     */
    public com.usps_cpas.www.usps_cpas.GSSAPI.GetAvailableReportResult getRequiredReportsForDispatch(java.lang.String dispatchID, java.lang.String accessToken) throws java.rmi.RemoteException;

    /**
     * Returns a list of all destination locations that are available
     * for a mailer.
     */
    public com.usps_cpas.www.usps_cpas.GSSAPI.DestinationLocationsResult getDestinationLocations(java.lang.String accessToken) throws java.rmi.RemoteException;

    /**
     * Get Expected Ship Date
     */
    public com.usps_cpas.www.usps_cpas.GSSAPI.ExpectedShipResult getExpectedShipDate(java.lang.String destinationLocationID, java.lang.String accessToken) throws java.rmi.RemoteException;

    /**
     * Set Expected Ship Date
     */
    public com.usps_cpas.www.usps_cpas.GSSAPI.CommonResult setExpectedShipDate(java.lang.String destinationLocationID, java.lang.String expectedShipDate, java.lang.String accessToken) throws java.rmi.RemoteException;

    /**
     * Add package to receptacle
     */
    public com.usps_cpas.www.usps_cpas.GSSAPI.CommonResult addPackageInReceptacle(java.lang.String USPSPackageTrackingID, java.lang.String receptacleID, java.lang.String accessToken) throws java.rmi.RemoteException;

    /**
     * Add package to receptacle
     */
    public com.usps_cpas.www.usps_cpas.GSSAPI.CommonResult addPackagesToReceptacle(java.lang.String USPSPackageID, java.lang.String receptacleID, java.lang.String accessToken) throws java.rmi.RemoteException;

    /**
     * Remove package from receptacle
     */
    public com.usps_cpas.www.usps_cpas.GSSAPI.CommonResult removePackageFromReceptacle(java.lang.String USPSPackageTrackingID, java.lang.String receptacleID, java.lang.String accessToken) throws java.rmi.RemoteException;

    /**
     * List receptacle allow to add packages or all receptacle
     */
    public com.usps_cpas.www.usps_cpas.GSSAPI.OpenReceptaclesResult getOpenReceptacles(java.lang.String availableForPackagesOnly, java.lang.String accessToken) throws java.rmi.RemoteException;

    /**
     * Retrieves the history of tracking events with the Postal Code
     * for a package.
     */
    public com.usps_cpas.www.usps_cpas.GSSAPI.TrackingWithPostalCodeResult trackPackageWithPostalCode(java.lang.String packageID, java.lang.String mailingAgentID, int boxNumber, java.lang.String accessToken) throws java.rmi.RemoteException;

    /**
     * Retrieves the history of tracking events for a package.
     */
    public com.usps_cpas.www.usps_cpas.GSSAPI.TrackResult trackPackage(java.lang.String packageID, java.lang.String mailingAgentID, int boxNumber, java.lang.String accessToken) throws java.rmi.RemoteException;

    /**
     * Retrieves the history of tracking events for an agent.
     */
    public com.usps_cpas.www.usps_cpas.GSSAPI.RetrieveTrackingEventsSinceDateResponseRetrieveTrackingEventsSinceDateResult retrieveTrackingEventsSinceDate(java.lang.String sinceDate, java.lang.String accessToken) throws java.rmi.RemoteException;

    /**
     * Retrieves Receptacle tracking events for an agent.
     */
    public com.usps_cpas.www.usps_cpas.GSSAPI.RetrieveReceptacleTrackingEventsSinceDateResponseRetrieveReceptacleTrackingEventsSinceDateResult retrieveReceptacleTrackingEventsSinceDate(java.lang.String sinceDate, java.lang.String accessToken) throws java.rmi.RemoteException;

    /**
     * Creates a Pass-Through receptacle for a rate type
     */
    public com.usps_cpas.www.usps_cpas.GSSAPI.ReceptacleResult createPassThroughReceptacleForRateType(java.lang.String rateType, boolean dutiable, java.lang.String receptacleType, java.lang.String foreignOECode, java.lang.String countryCode, java.util.Calendar dateOfMailing, int pieceCount, java.math.BigDecimal weightInLbs, java.lang.String ppmodISC, java.lang.String accessToken) throws java.rmi.RemoteException;

    /**
     * Creates a receptacle for a rate type
     */
    public com.usps_cpas.www.usps_cpas.GSSAPI.ReceptacleResult createReceptacleForRateTypeToDestination(java.lang.String rateType, boolean dutiable, java.lang.String receptacleType, java.lang.String foreignOECode, java.lang.String countryCode, java.util.Calendar dateOfMailing, int pieceCount, java.math.BigDecimal weightInLbs, java.lang.String accessToken) throws java.rmi.RemoteException;

    /**
     * Creates a receptacle for a rate type
     */
    public com.usps_cpas.www.usps_cpas.GSSAPI.ReceptacleResult createReceptacleForRateTypeToDestinationWithTareWeight(java.lang.String rateType, boolean dutiable, java.lang.String receptacleType, java.lang.String foreignOECode, java.lang.String countryCode, java.util.Calendar dateOfMailing, int pieceCount, java.math.BigDecimal weightInLbs, java.math.BigDecimal tareWeight, java.lang.String accessToken) throws java.rmi.RemoteException;

    /**
     * Process USPS Partner Mailer package
     */
    public com.usps_cpas.www.usps_cpas.GSSAPI.CommonResult USPSPartnerPackageProcessing(java.lang.String USPSPackageID, java.lang.String destinationLocationID, com.usps_cpas.www.usps_cpas.GSSAPI.USPSPartnerPackageProcessingXmlDoc xmlDoc, java.lang.String accessToken) throws java.rmi.RemoteException;

    /**
     * Retrieves labels for a specified package in ZPL image format.
     */
    public com.usps_cpas.www.usps_cpas.GSSAPI.LabelResult getZPLLabelsForPackage(java.lang.String packageID, java.lang.String mailingAgentID, int boxNumber, java.lang.String accessToken) throws java.rmi.RemoteException;

    /**
     * Retrieves current shipment for a location Version 2.0
     */
    public com.usps_cpas.www.usps_cpas.GSSAPI.ShipmentDetailResult getCurrentShipmentByRange(java.lang.String accessToken, int startRowNumber, int endRowNumber) throws java.rmi.RemoteException;

    /**
     * Retrieves Port Code list for a particular service level and
     * destination.
     */
    public com.usps_cpas.www.usps_cpas.GSSAPI.CommonResult getPortCodeListForRateTypeAndDestination(java.lang.String rateType, java.lang.String countryCode, java.lang.String accessToken) throws java.rmi.RemoteException;

    /**
     * Allow a mailer to query for the postage amount, prior to processing
     * a package.
     */
    public com.usps_cpas.www.usps_cpas.GSSAPI.CalculatePostageResult calculatePostage(com.usps_cpas.www.usps_cpas.GSSAPI.CalculatePostageXmlDoc xmlDoc, java.lang.String accessToken) throws java.rmi.RemoteException;

    /**
     * Retrieves available custom insured amount list for a service
     * type.
     */
    public com.usps_cpas.www.usps_cpas.GSSAPI.CommonResult getAvailableCustomInsuredAmountList(java.lang.String rateType, java.lang.String serviceType, java.lang.String accessToken) throws java.rmi.RemoteException;

    /**
     * Uploads a package file to the GSS server.
     */
    public com.usps_cpas.www.usps_cpas.GSSAPI.CommonResult uploadPackageFile(byte[] fileData, java.lang.String fileName, java.lang.String accessToken) throws java.rmi.RemoteException;

    /**
     * Update Domestic Package Weight.
     */
    public com.usps_cpas.www.usps_cpas.GSSAPI.CommonResult updateDomesticPackageWeight(java.lang.String USPSPackageID, java.math.BigDecimal weight, java.lang.String weightUnit, java.lang.String accessToken) throws java.rmi.RemoteException;

    /**
     * Reopen Dispatch
     */
    public com.usps_cpas.www.usps_cpas.GSSAPI.CommonResult reopenDispatch(java.lang.String dispatchID, java.lang.String accessToken) throws java.rmi.RemoteException;

    /**
     * Validate Recipient Address
     */
    public com.usps_cpas.www.usps_cpas.GSSAPI.ValidateAddressResponseValidateAddressResult validateAddress(java.lang.String recipientAddressLine1, java.lang.String recipientAddressLine2, java.lang.String recipientCity, java.lang.String recipientState, java.lang.String recipientPostalCode, java.lang.String recipientCountryCode, java.lang.String accessToken) throws java.rmi.RemoteException;
}
