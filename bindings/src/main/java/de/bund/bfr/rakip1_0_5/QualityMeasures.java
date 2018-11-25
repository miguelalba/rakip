//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.11.25 um 01:28:08 PM CET 
//


package de.bund.bfr.rakip1_0_5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für QualityMeasures complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="QualityMeasures">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SSE" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="MSE" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="RMSE" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="RSquared" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="AIC" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="BIC" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QualityMeasures", propOrder = {
    "sse",
    "mse",
    "rmse",
    "rSquared",
    "aic",
    "bic"
})
public class QualityMeasures {

    @XmlElement(name = "SSE")
    protected Double sse;
    @XmlElement(name = "MSE")
    protected Double mse;
    @XmlElement(name = "RMSE")
    protected Double rmse;
    @XmlElement(name = "RSquared")
    protected Double rSquared;
    @XmlElement(name = "AIC")
    protected Double aic;
    @XmlElement(name = "BIC")
    protected Double bic;

    /**
     * Ruft den Wert der sse-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSSE() {
        return sse;
    }

    /**
     * Legt den Wert der sse-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSSE(Double value) {
        this.sse = value;
    }

    /**
     * Ruft den Wert der mse-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMSE() {
        return mse;
    }

    /**
     * Legt den Wert der mse-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMSE(Double value) {
        this.mse = value;
    }

    /**
     * Ruft den Wert der rmse-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRMSE() {
        return rmse;
    }

    /**
     * Legt den Wert der rmse-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRMSE(Double value) {
        this.rmse = value;
    }

    /**
     * Ruft den Wert der rSquared-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRSquared() {
        return rSquared;
    }

    /**
     * Legt den Wert der rSquared-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRSquared(Double value) {
        this.rSquared = value;
    }

    /**
     * Ruft den Wert der aic-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAIC() {
        return aic;
    }

    /**
     * Legt den Wert der aic-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAIC(Double value) {
        this.aic = value;
    }

    /**
     * Ruft den Wert der bic-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBIC() {
        return bic;
    }

    /**
     * Legt den Wert der bic-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBIC(Double value) {
        this.bic = value;
    }

}
