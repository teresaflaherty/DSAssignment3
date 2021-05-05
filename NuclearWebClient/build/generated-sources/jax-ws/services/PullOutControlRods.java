
package services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for pullOutControlRods complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pullOutControlRods"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="reactorID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="amountToPullOut" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pullOutControlRods", propOrder = {
    "reactorID",
    "amountToPullOut"
})
public class PullOutControlRods {

    protected int reactorID;
    protected int amountToPullOut;

    /**
     * Gets the value of the reactorID property.
     * 
     */
    public int getReactorID() {
        return reactorID;
    }

    /**
     * Sets the value of the reactorID property.
     * 
     */
    public void setReactorID(int value) {
        this.reactorID = value;
    }

    /**
     * Gets the value of the amountToPullOut property.
     * 
     */
    public int getAmountToPullOut() {
        return amountToPullOut;
    }

    /**
     * Sets the value of the amountToPullOut property.
     * 
     */
    public void setAmountToPullOut(int value) {
        this.amountToPullOut = value;
    }

}
