
package services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for turnCoreOnOff complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="turnCoreOnOff"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="coreID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="onOff" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "turnCoreOnOff", propOrder = {
    "coreID",
    "onOff"
})
public class TurnCoreOnOff {

    protected int coreID;
    protected int onOff;

    /**
     * Gets the value of the coreID property.
     * 
     */
    public int getCoreID() {
        return coreID;
    }

    /**
     * Sets the value of the coreID property.
     * 
     */
    public void setCoreID(int value) {
        this.coreID = value;
    }

    /**
     * Gets the value of the onOff property.
     * 
     */
    public int getOnOff() {
        return onOff;
    }

    /**
     * Sets the value of the onOff property.
     * 
     */
    public void setOnOff(int value) {
        this.onOff = value;
    }

}
