
package services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the services package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _DumpAllCores_QNAME = new QName("http://services/", "dumpAllCores");
    private final static QName _DumpAllCoresResponse_QNAME = new QName("http://services/", "dumpAllCoresResponse");
    private final static QName _GetPlantStatus_QNAME = new QName("http://services/", "getPlantStatus");
    private final static QName _GetPlantStatusResponse_QNAME = new QName("http://services/", "getPlantStatusResponse");
    private final static QName _GetReactorInfo_QNAME = new QName("http://services/", "getReactorInfo");
    private final static QName _GetReactorInfoResponse_QNAME = new QName("http://services/", "getReactorInfoResponse");
    private final static QName _MeltdownAll_QNAME = new QName("http://services/", "meltdownAll");
    private final static QName _MeltdownAllResponse_QNAME = new QName("http://services/", "meltdownAllResponse");
    private final static QName _PullOutControlRods_QNAME = new QName("http://services/", "pullOutControlRods");
    private final static QName _PullOutControlRodsResponse_QNAME = new QName("http://services/", "pullOutControlRodsResponse");
    private final static QName _RestartAll_QNAME = new QName("http://services/", "restartAll");
    private final static QName _RestartAllResponse_QNAME = new QName("http://services/", "restartAllResponse");
    private final static QName _TurnCoreOnOff_QNAME = new QName("http://services/", "turnCoreOnOff");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DumpAllCores }
     * 
     */
    public DumpAllCores createDumpAllCores() {
        return new DumpAllCores();
    }

    /**
     * Create an instance of {@link DumpAllCoresResponse }
     * 
     */
    public DumpAllCoresResponse createDumpAllCoresResponse() {
        return new DumpAllCoresResponse();
    }

    /**
     * Create an instance of {@link GetPlantStatus }
     * 
     */
    public GetPlantStatus createGetPlantStatus() {
        return new GetPlantStatus();
    }

    /**
     * Create an instance of {@link GetPlantStatusResponse }
     * 
     */
    public GetPlantStatusResponse createGetPlantStatusResponse() {
        return new GetPlantStatusResponse();
    }

    /**
     * Create an instance of {@link GetReactorInfo }
     * 
     */
    public GetReactorInfo createGetReactorInfo() {
        return new GetReactorInfo();
    }

    /**
     * Create an instance of {@link GetReactorInfoResponse }
     * 
     */
    public GetReactorInfoResponse createGetReactorInfoResponse() {
        return new GetReactorInfoResponse();
    }

    /**
     * Create an instance of {@link MeltdownAll }
     * 
     */
    public MeltdownAll createMeltdownAll() {
        return new MeltdownAll();
    }

    /**
     * Create an instance of {@link MeltdownAllResponse }
     * 
     */
    public MeltdownAllResponse createMeltdownAllResponse() {
        return new MeltdownAllResponse();
    }

    /**
     * Create an instance of {@link PullOutControlRods }
     * 
     */
    public PullOutControlRods createPullOutControlRods() {
        return new PullOutControlRods();
    }

    /**
     * Create an instance of {@link PullOutControlRodsResponse }
     * 
     */
    public PullOutControlRodsResponse createPullOutControlRodsResponse() {
        return new PullOutControlRodsResponse();
    }

    /**
     * Create an instance of {@link RestartAll }
     * 
     */
    public RestartAll createRestartAll() {
        return new RestartAll();
    }

    /**
     * Create an instance of {@link RestartAllResponse }
     * 
     */
    public RestartAllResponse createRestartAllResponse() {
        return new RestartAllResponse();
    }

    /**
     * Create an instance of {@link TurnCoreOnOff }
     * 
     */
    public TurnCoreOnOff createTurnCoreOnOff() {
        return new TurnCoreOnOff();
    }

    /**
     * Create an instance of {@link Reactor }
     * 
     */
    public Reactor createReactor() {
        return new Reactor();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DumpAllCores }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DumpAllCores }{@code >}
     */
    @XmlElementDecl(namespace = "http://services/", name = "dumpAllCores")
    public JAXBElement<DumpAllCores> createDumpAllCores(DumpAllCores value) {
        return new JAXBElement<DumpAllCores>(_DumpAllCores_QNAME, DumpAllCores.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DumpAllCoresResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DumpAllCoresResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services/", name = "dumpAllCoresResponse")
    public JAXBElement<DumpAllCoresResponse> createDumpAllCoresResponse(DumpAllCoresResponse value) {
        return new JAXBElement<DumpAllCoresResponse>(_DumpAllCoresResponse_QNAME, DumpAllCoresResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPlantStatus }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetPlantStatus }{@code >}
     */
    @XmlElementDecl(namespace = "http://services/", name = "getPlantStatus")
    public JAXBElement<GetPlantStatus> createGetPlantStatus(GetPlantStatus value) {
        return new JAXBElement<GetPlantStatus>(_GetPlantStatus_QNAME, GetPlantStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPlantStatusResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetPlantStatusResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services/", name = "getPlantStatusResponse")
    public JAXBElement<GetPlantStatusResponse> createGetPlantStatusResponse(GetPlantStatusResponse value) {
        return new JAXBElement<GetPlantStatusResponse>(_GetPlantStatusResponse_QNAME, GetPlantStatusResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetReactorInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetReactorInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://services/", name = "getReactorInfo")
    public JAXBElement<GetReactorInfo> createGetReactorInfo(GetReactorInfo value) {
        return new JAXBElement<GetReactorInfo>(_GetReactorInfo_QNAME, GetReactorInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetReactorInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetReactorInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services/", name = "getReactorInfoResponse")
    public JAXBElement<GetReactorInfoResponse> createGetReactorInfoResponse(GetReactorInfoResponse value) {
        return new JAXBElement<GetReactorInfoResponse>(_GetReactorInfoResponse_QNAME, GetReactorInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeltdownAll }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MeltdownAll }{@code >}
     */
    @XmlElementDecl(namespace = "http://services/", name = "meltdownAll")
    public JAXBElement<MeltdownAll> createMeltdownAll(MeltdownAll value) {
        return new JAXBElement<MeltdownAll>(_MeltdownAll_QNAME, MeltdownAll.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeltdownAllResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MeltdownAllResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services/", name = "meltdownAllResponse")
    public JAXBElement<MeltdownAllResponse> createMeltdownAllResponse(MeltdownAllResponse value) {
        return new JAXBElement<MeltdownAllResponse>(_MeltdownAllResponse_QNAME, MeltdownAllResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PullOutControlRods }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PullOutControlRods }{@code >}
     */
    @XmlElementDecl(namespace = "http://services/", name = "pullOutControlRods")
    public JAXBElement<PullOutControlRods> createPullOutControlRods(PullOutControlRods value) {
        return new JAXBElement<PullOutControlRods>(_PullOutControlRods_QNAME, PullOutControlRods.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PullOutControlRodsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PullOutControlRodsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services/", name = "pullOutControlRodsResponse")
    public JAXBElement<PullOutControlRodsResponse> createPullOutControlRodsResponse(PullOutControlRodsResponse value) {
        return new JAXBElement<PullOutControlRodsResponse>(_PullOutControlRodsResponse_QNAME, PullOutControlRodsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RestartAll }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RestartAll }{@code >}
     */
    @XmlElementDecl(namespace = "http://services/", name = "restartAll")
    public JAXBElement<RestartAll> createRestartAll(RestartAll value) {
        return new JAXBElement<RestartAll>(_RestartAll_QNAME, RestartAll.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RestartAllResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RestartAllResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services/", name = "restartAllResponse")
    public JAXBElement<RestartAllResponse> createRestartAllResponse(RestartAllResponse value) {
        return new JAXBElement<RestartAllResponse>(_RestartAllResponse_QNAME, RestartAllResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TurnCoreOnOff }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TurnCoreOnOff }{@code >}
     */
    @XmlElementDecl(namespace = "http://services/", name = "turnCoreOnOff")
    public JAXBElement<TurnCoreOnOff> createTurnCoreOnOff(TurnCoreOnOff value) {
        return new JAXBElement<TurnCoreOnOff>(_TurnCoreOnOff_QNAME, TurnCoreOnOff.class, null, value);
    }

}
