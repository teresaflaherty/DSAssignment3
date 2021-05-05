
package services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getReactorInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getReactorInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="reactorInfo" type="{http://services/}reactor" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getReactorInfo", propOrder = {
    "reactorInfo"
})
public class GetReactorInfo {

    protected Reactor reactorInfo;

    /**
     * Gets the value of the reactorInfo property.
     * 
     * @return
     *     possible object is
     *     {@link Reactor }
     *     
     */
    public Reactor getReactorInfo() {
        return reactorInfo;
    }

    /**
     * Sets the value of the reactorInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reactor }
     *     
     */
    public void setReactorInfo(Reactor value) {
        this.reactorInfo = value;
    }

}
