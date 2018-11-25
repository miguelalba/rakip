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
 * <p>Java-Klasse für Study complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Study">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DesignType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AssayMeasurementType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AssayTechnologyType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AssayTechnologyPlatform" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AssayTechnologyTypePlatform" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccreditationProcedureForTheAssayTechnology" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProtocolName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProtocolType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProtocolDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProtocolURI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProtocolVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProtocolParametersName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProtocolComponentsName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProtocolComponentsType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Study", propOrder = {
    "identifier",
    "title",
    "description",
    "designType",
    "assayMeasurementType",
    "assayTechnologyType",
    "assayTechnologyPlatform",
    "assayTechnologyTypePlatform",
    "accreditationProcedureForTheAssayTechnology",
    "protocolName",
    "protocolType",
    "protocolDescription",
    "protocolURI",
    "protocolVersion",
    "protocolParametersName",
    "protocolComponentsName",
    "protocolComponentsType"
})
public class Study {

    @XmlElement(name = "Identifier")
    protected String identifier;
    @XmlElement(name = "Title", required = true)
    protected String title;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "DesignType")
    protected String designType;
    @XmlElement(name = "AssayMeasurementType")
    protected String assayMeasurementType;
    @XmlElement(name = "AssayTechnologyType")
    protected String assayTechnologyType;
    @XmlElement(name = "AssayTechnologyPlatform")
    protected String assayTechnologyPlatform;
    @XmlElement(name = "AssayTechnologyTypePlatform")
    protected String assayTechnologyTypePlatform;
    @XmlElement(name = "AccreditationProcedureForTheAssayTechnology")
    protected String accreditationProcedureForTheAssayTechnology;
    @XmlElement(name = "ProtocolName")
    protected String protocolName;
    @XmlElement(name = "ProtocolType")
    protected String protocolType;
    @XmlElement(name = "ProtocolDescription")
    protected String protocolDescription;
    @XmlElement(name = "ProtocolURI")
    protected String protocolURI;
    @XmlElement(name = "ProtocolVersion")
    protected String protocolVersion;
    @XmlElement(name = "ProtocolParametersName")
    protected String protocolParametersName;
    @XmlElement(name = "ProtocolComponentsName")
    protected String protocolComponentsName;
    @XmlElement(name = "ProtocolComponentsType")
    protected String protocolComponentsType;

    /**
     * Ruft den Wert der identifier-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * Legt den Wert der identifier-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentifier(String value) {
        this.identifier = value;
    }

    /**
     * Ruft den Wert der title-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Legt den Wert der title-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
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
     * Ruft den Wert der designType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesignType() {
        return designType;
    }

    /**
     * Legt den Wert der designType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesignType(String value) {
        this.designType = value;
    }

    /**
     * Ruft den Wert der assayMeasurementType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssayMeasurementType() {
        return assayMeasurementType;
    }

    /**
     * Legt den Wert der assayMeasurementType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssayMeasurementType(String value) {
        this.assayMeasurementType = value;
    }

    /**
     * Ruft den Wert der assayTechnologyType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssayTechnologyType() {
        return assayTechnologyType;
    }

    /**
     * Legt den Wert der assayTechnologyType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssayTechnologyType(String value) {
        this.assayTechnologyType = value;
    }

    /**
     * Ruft den Wert der assayTechnologyPlatform-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssayTechnologyPlatform() {
        return assayTechnologyPlatform;
    }

    /**
     * Legt den Wert der assayTechnologyPlatform-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssayTechnologyPlatform(String value) {
        this.assayTechnologyPlatform = value;
    }

    /**
     * Ruft den Wert der assayTechnologyTypePlatform-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssayTechnologyTypePlatform() {
        return assayTechnologyTypePlatform;
    }

    /**
     * Legt den Wert der assayTechnologyTypePlatform-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssayTechnologyTypePlatform(String value) {
        this.assayTechnologyTypePlatform = value;
    }

    /**
     * Ruft den Wert der accreditationProcedureForTheAssayTechnology-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccreditationProcedureForTheAssayTechnology() {
        return accreditationProcedureForTheAssayTechnology;
    }

    /**
     * Legt den Wert der accreditationProcedureForTheAssayTechnology-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccreditationProcedureForTheAssayTechnology(String value) {
        this.accreditationProcedureForTheAssayTechnology = value;
    }

    /**
     * Ruft den Wert der protocolName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtocolName() {
        return protocolName;
    }

    /**
     * Legt den Wert der protocolName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtocolName(String value) {
        this.protocolName = value;
    }

    /**
     * Ruft den Wert der protocolType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtocolType() {
        return protocolType;
    }

    /**
     * Legt den Wert der protocolType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtocolType(String value) {
        this.protocolType = value;
    }

    /**
     * Ruft den Wert der protocolDescription-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtocolDescription() {
        return protocolDescription;
    }

    /**
     * Legt den Wert der protocolDescription-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtocolDescription(String value) {
        this.protocolDescription = value;
    }

    /**
     * Ruft den Wert der protocolURI-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtocolURI() {
        return protocolURI;
    }

    /**
     * Legt den Wert der protocolURI-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtocolURI(String value) {
        this.protocolURI = value;
    }

    /**
     * Ruft den Wert der protocolVersion-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtocolVersion() {
        return protocolVersion;
    }

    /**
     * Legt den Wert der protocolVersion-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtocolVersion(String value) {
        this.protocolVersion = value;
    }

    /**
     * Ruft den Wert der protocolParametersName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtocolParametersName() {
        return protocolParametersName;
    }

    /**
     * Legt den Wert der protocolParametersName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtocolParametersName(String value) {
        this.protocolParametersName = value;
    }

    /**
     * Ruft den Wert der protocolComponentsName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtocolComponentsName() {
        return protocolComponentsName;
    }

    /**
     * Legt den Wert der protocolComponentsName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtocolComponentsName(String value) {
        this.protocolComponentsName = value;
    }

    /**
     * Ruft den Wert der protocolComponentsType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtocolComponentsType() {
        return protocolComponentsType;
    }

    /**
     * Legt den Wert der protocolComponentsType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtocolComponentsType(String value) {
        this.protocolComponentsType = value;
    }

}
