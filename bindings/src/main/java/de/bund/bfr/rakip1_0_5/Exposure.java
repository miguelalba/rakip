//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2018.11.25 um 01:28:08 PM CET 
//


package de.bund.bfr.rakip1_0_5;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für Exposure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Exposure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="UncertaintyEstimation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MethodologicalTreatmentOfLeftCensoredData" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="LevelOfContaminationAfterLeftCensoredDataTreatment" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Scenario" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Exposure", propOrder = {
    "type",
    "uncertaintyEstimation",
    "methodologicalTreatmentOfLeftCensoredData",
    "levelOfContaminationAfterLeftCensoredDataTreatment",
    "scenario"
})
public class Exposure {

    @XmlElement(name = "Type", required = true)
    protected String type;
    @XmlElement(name = "UncertaintyEstimation")
    protected String uncertaintyEstimation;
    @XmlElement(name = "MethodologicalTreatmentOfLeftCensoredData")
    protected List<String> methodologicalTreatmentOfLeftCensoredData;
    @XmlElement(name = "LevelOfContaminationAfterLeftCensoredDataTreatment")
    protected List<String> levelOfContaminationAfterLeftCensoredDataTreatment;
    @XmlElement(name = "Scenario")
    protected List<String> scenario;

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
     * Ruft den Wert der uncertaintyEstimation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUncertaintyEstimation() {
        return uncertaintyEstimation;
    }

    /**
     * Legt den Wert der uncertaintyEstimation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUncertaintyEstimation(String value) {
        this.uncertaintyEstimation = value;
    }

    /**
     * Gets the value of the methodologicalTreatmentOfLeftCensoredData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the methodologicalTreatmentOfLeftCensoredData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMethodologicalTreatmentOfLeftCensoredData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getMethodologicalTreatmentOfLeftCensoredData() {
        if (methodologicalTreatmentOfLeftCensoredData == null) {
            methodologicalTreatmentOfLeftCensoredData = new ArrayList<String>();
        }
        return this.methodologicalTreatmentOfLeftCensoredData;
    }

    /**
     * Gets the value of the levelOfContaminationAfterLeftCensoredDataTreatment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the levelOfContaminationAfterLeftCensoredDataTreatment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLevelOfContaminationAfterLeftCensoredDataTreatment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLevelOfContaminationAfterLeftCensoredDataTreatment() {
        if (levelOfContaminationAfterLeftCensoredDataTreatment == null) {
            levelOfContaminationAfterLeftCensoredDataTreatment = new ArrayList<String>();
        }
        return this.levelOfContaminationAfterLeftCensoredDataTreatment;
    }

    /**
     * Gets the value of the scenario property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scenario property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScenario().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getScenario() {
        if (scenario == null) {
            scenario = new ArrayList<String>();
        }
        return this.scenario;
    }

}
