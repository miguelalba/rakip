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
 * <p>Java-Klasse für StudySample complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="StudySample">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SampleName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ProtocolOfSampleCollection" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SamplingStrategy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TypeOfSamplingProgram" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SamplingMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SamplingPlan" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SamplingWeight" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SamplingSize" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="LotSizeUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SamplingPoint" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StudySample", propOrder = {
    "sampleName",
    "protocolOfSampleCollection",
    "samplingStrategy",
    "typeOfSamplingProgram",
    "samplingMethod",
    "samplingPlan",
    "samplingWeight",
    "samplingSize",
    "lotSizeUnit",
    "samplingPoint"
})
public class StudySample {

    @XmlElement(name = "SampleName", required = true)
    protected String sampleName;
    @XmlElement(name = "ProtocolOfSampleCollection", required = true)
    protected String protocolOfSampleCollection;
    @XmlElement(name = "SamplingStrategy")
    protected String samplingStrategy;
    @XmlElement(name = "TypeOfSamplingProgram")
    protected String typeOfSamplingProgram;
    @XmlElement(name = "SamplingMethod")
    protected String samplingMethod;
    @XmlElement(name = "SamplingPlan", required = true)
    protected String samplingPlan;
    @XmlElement(name = "SamplingWeight", required = true)
    protected String samplingWeight;
    @XmlElement(name = "SamplingSize", required = true)
    protected String samplingSize;
    @XmlElement(name = "LotSizeUnit")
    protected String lotSizeUnit;
    @XmlElement(name = "SamplingPoint", required = true)
    protected String samplingPoint;

    /**
     * Ruft den Wert der sampleName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSampleName() {
        return sampleName;
    }

    /**
     * Legt den Wert der sampleName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSampleName(String value) {
        this.sampleName = value;
    }

    /**
     * Ruft den Wert der protocolOfSampleCollection-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtocolOfSampleCollection() {
        return protocolOfSampleCollection;
    }

    /**
     * Legt den Wert der protocolOfSampleCollection-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtocolOfSampleCollection(String value) {
        this.protocolOfSampleCollection = value;
    }

    /**
     * Ruft den Wert der samplingStrategy-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSamplingStrategy() {
        return samplingStrategy;
    }

    /**
     * Legt den Wert der samplingStrategy-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSamplingStrategy(String value) {
        this.samplingStrategy = value;
    }

    /**
     * Ruft den Wert der typeOfSamplingProgram-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeOfSamplingProgram() {
        return typeOfSamplingProgram;
    }

    /**
     * Legt den Wert der typeOfSamplingProgram-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeOfSamplingProgram(String value) {
        this.typeOfSamplingProgram = value;
    }

    /**
     * Ruft den Wert der samplingMethod-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSamplingMethod() {
        return samplingMethod;
    }

    /**
     * Legt den Wert der samplingMethod-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSamplingMethod(String value) {
        this.samplingMethod = value;
    }

    /**
     * Ruft den Wert der samplingPlan-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSamplingPlan() {
        return samplingPlan;
    }

    /**
     * Legt den Wert der samplingPlan-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSamplingPlan(String value) {
        this.samplingPlan = value;
    }

    /**
     * Ruft den Wert der samplingWeight-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSamplingWeight() {
        return samplingWeight;
    }

    /**
     * Legt den Wert der samplingWeight-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSamplingWeight(String value) {
        this.samplingWeight = value;
    }

    /**
     * Ruft den Wert der samplingSize-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSamplingSize() {
        return samplingSize;
    }

    /**
     * Legt den Wert der samplingSize-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSamplingSize(String value) {
        this.samplingSize = value;
    }

    /**
     * Ruft den Wert der lotSizeUnit-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLotSizeUnit() {
        return lotSizeUnit;
    }

    /**
     * Legt den Wert der lotSizeUnit-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLotSizeUnit(String value) {
        this.lotSizeUnit = value;
    }

    /**
     * Ruft den Wert der samplingPoint-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSamplingPoint() {
        return samplingPoint;
    }

    /**
     * Legt den Wert der samplingPoint-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSamplingPoint(String value) {
        this.samplingPoint = value;
    }

}
