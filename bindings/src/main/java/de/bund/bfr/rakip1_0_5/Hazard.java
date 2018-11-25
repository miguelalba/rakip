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
 * <p>Java-Klasse für Hazard complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Hazard">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Unit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AdverseEffect" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SourceOfContamination" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BenchmarkDose" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MaximumResidueLimit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NoObservedAdverseAffectLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LowestObservedAdverseAffectLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AcceptableOperatorExposureLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AcuteReferenceDose" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AcceptableDailyIntake" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IndSum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Hazard", propOrder = {
    "type",
    "name",
    "description",
    "unit",
    "adverseEffect",
    "sourceOfContamination",
    "benchmarkDose",
    "maximumResidueLimit",
    "noObservedAdverseAffectLevel",
    "lowestObservedAdverseAffectLevel",
    "acceptableOperatorExposureLevel",
    "acuteReferenceDose",
    "acceptableDailyIntake",
    "indSum"
})
public class Hazard {

    @XmlElement(name = "Type")
    protected String type;
    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "Unit")
    protected String unit;
    @XmlElement(name = "AdverseEffect")
    protected String adverseEffect;
    @XmlElement(name = "SourceOfContamination")
    protected String sourceOfContamination;
    @XmlElement(name = "BenchmarkDose")
    protected String benchmarkDose;
    @XmlElement(name = "MaximumResidueLimit")
    protected String maximumResidueLimit;
    @XmlElement(name = "NoObservedAdverseAffectLevel")
    protected String noObservedAdverseAffectLevel;
    @XmlElement(name = "LowestObservedAdverseAffectLevel")
    protected String lowestObservedAdverseAffectLevel;
    @XmlElement(name = "AcceptableOperatorExposureLevel")
    protected String acceptableOperatorExposureLevel;
    @XmlElement(name = "AcuteReferenceDose")
    protected String acuteReferenceDose;
    @XmlElement(name = "AcceptableDailyIntake")
    protected String acceptableDailyIntake;
    @XmlElement(name = "IndSum")
    protected String indSum;

    /**
     * Ruft den Wert der type-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Legt den Wert der type-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

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
     * Ruft den Wert der unit-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnit() {
        return unit;
    }

    /**
     * Legt den Wert der unit-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnit(String value) {
        this.unit = value;
    }

    /**
     * Ruft den Wert der adverseEffect-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdverseEffect() {
        return adverseEffect;
    }

    /**
     * Legt den Wert der adverseEffect-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdverseEffect(String value) {
        this.adverseEffect = value;
    }

    /**
     * Ruft den Wert der sourceOfContamination-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceOfContamination() {
        return sourceOfContamination;
    }

    /**
     * Legt den Wert der sourceOfContamination-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceOfContamination(String value) {
        this.sourceOfContamination = value;
    }

    /**
     * Ruft den Wert der benchmarkDose-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBenchmarkDose() {
        return benchmarkDose;
    }

    /**
     * Legt den Wert der benchmarkDose-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBenchmarkDose(String value) {
        this.benchmarkDose = value;
    }

    /**
     * Ruft den Wert der maximumResidueLimit-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumResidueLimit() {
        return maximumResidueLimit;
    }

    /**
     * Legt den Wert der maximumResidueLimit-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumResidueLimit(String value) {
        this.maximumResidueLimit = value;
    }

    /**
     * Ruft den Wert der noObservedAdverseAffectLevel-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoObservedAdverseAffectLevel() {
        return noObservedAdverseAffectLevel;
    }

    /**
     * Legt den Wert der noObservedAdverseAffectLevel-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoObservedAdverseAffectLevel(String value) {
        this.noObservedAdverseAffectLevel = value;
    }

    /**
     * Ruft den Wert der lowestObservedAdverseAffectLevel-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLowestObservedAdverseAffectLevel() {
        return lowestObservedAdverseAffectLevel;
    }

    /**
     * Legt den Wert der lowestObservedAdverseAffectLevel-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLowestObservedAdverseAffectLevel(String value) {
        this.lowestObservedAdverseAffectLevel = value;
    }

    /**
     * Ruft den Wert der acceptableOperatorExposureLevel-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcceptableOperatorExposureLevel() {
        return acceptableOperatorExposureLevel;
    }

    /**
     * Legt den Wert der acceptableOperatorExposureLevel-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcceptableOperatorExposureLevel(String value) {
        this.acceptableOperatorExposureLevel = value;
    }

    /**
     * Ruft den Wert der acuteReferenceDose-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcuteReferenceDose() {
        return acuteReferenceDose;
    }

    /**
     * Legt den Wert der acuteReferenceDose-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcuteReferenceDose(String value) {
        this.acuteReferenceDose = value;
    }

    /**
     * Ruft den Wert der acceptableDailyIntake-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcceptableDailyIntake() {
        return acceptableDailyIntake;
    }

    /**
     * Legt den Wert der acceptableDailyIntake-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcceptableDailyIntake(String value) {
        this.acceptableDailyIntake = value;
    }

    /**
     * Ruft den Wert der indSum-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndSum() {
        return indSum;
    }

    /**
     * Legt den Wert der indSum-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndSum(String value) {
        this.indSum = value;
    }

}
