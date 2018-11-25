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
 * <p>Java-Klasse für Assay complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Assay">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MoisturePercentage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FatPercentage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DetectionLimit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QuantificationLimit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LeftCensoredData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContaminationRange" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UncertaintyValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Assay", propOrder = {
    "name",
    "description",
    "moisturePercentage",
    "fatPercentage",
    "detectionLimit",
    "quantificationLimit",
    "leftCensoredData",
    "contaminationRange",
    "uncertaintyValue"
})
public class Assay {

    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "MoisturePercentage")
    protected String moisturePercentage;
    @XmlElement(name = "FatPercentage")
    protected String fatPercentage;
    @XmlElement(name = "DetectionLimit")
    protected String detectionLimit;
    @XmlElement(name = "QuantificationLimit")
    protected String quantificationLimit;
    @XmlElement(name = "LeftCensoredData")
    protected String leftCensoredData;
    @XmlElement(name = "ContaminationRange")
    protected String contaminationRange;
    @XmlElement(name = "UncertaintyValue")
    protected String uncertaintyValue;

    /**
     * Ruft den Wert der name-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Legt den Wert der name-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Ruft den Wert der description-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Legt den Wert der description-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Ruft den Wert der moisturePercentage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMoisturePercentage() {
        return moisturePercentage;
    }

    /**
     * Legt den Wert der moisturePercentage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMoisturePercentage(String value) {
        this.moisturePercentage = value;
    }

    /**
     * Ruft den Wert der fatPercentage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFatPercentage() {
        return fatPercentage;
    }

    /**
     * Legt den Wert der fatPercentage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFatPercentage(String value) {
        this.fatPercentage = value;
    }

    /**
     * Ruft den Wert der detectionLimit-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetectionLimit() {
        return detectionLimit;
    }

    /**
     * Legt den Wert der detectionLimit-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetectionLimit(String value) {
        this.detectionLimit = value;
    }

    /**
     * Ruft den Wert der quantificationLimit-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuantificationLimit() {
        return quantificationLimit;
    }

    /**
     * Legt den Wert der quantificationLimit-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuantificationLimit(String value) {
        this.quantificationLimit = value;
    }

    /**
     * Ruft den Wert der leftCensoredData-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeftCensoredData() {
        return leftCensoredData;
    }

    /**
     * Legt den Wert der leftCensoredData-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeftCensoredData(String value) {
        this.leftCensoredData = value;
    }

    /**
     * Ruft den Wert der contaminationRange-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContaminationRange() {
        return contaminationRange;
    }

    /**
     * Legt den Wert der contaminationRange-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContaminationRange(String value) {
        this.contaminationRange = value;
    }

    /**
     * Ruft den Wert der uncertaintyValue-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUncertaintyValue() {
        return uncertaintyValue;
    }

    /**
     * Legt den Wert der uncertaintyValue-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUncertaintyValue(String value) {
        this.uncertaintyValue = value;
    }

}
