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
 * <p>Java-Klasse für ModelCategory complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ModelCategory">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ModelClass" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ModelSubClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ModelClassComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BasicProcess" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModelCategory", propOrder = {
    "modelClass",
    "modelSubClass",
    "modelClassComment",
    "basicProcess"
})
public class ModelCategory {

    @XmlElement(name = "ModelClass", required = true)
    protected String modelClass;
    @XmlElement(name = "ModelSubClass")
    protected String modelSubClass;
    @XmlElement(name = "ModelClassComment")
    protected String modelClassComment;
    @XmlElement(name = "BasicProcess")
    protected String basicProcess;

    /**
     * Ruft den Wert der modelClass-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelClass() {
        return modelClass;
    }

    /**
     * Legt den Wert der modelClass-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelClass(String value) {
        this.modelClass = value;
    }

    /**
     * Ruft den Wert der modelSubClass-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelSubClass() {
        return modelSubClass;
    }

    /**
     * Legt den Wert der modelSubClass-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelSubClass(String value) {
        this.modelSubClass = value;
    }

    /**
     * Ruft den Wert der modelClassComment-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelClassComment() {
        return modelClassComment;
    }

    /**
     * Legt den Wert der modelClassComment-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelClassComment(String value) {
        this.modelClassComment = value;
    }

    /**
     * Ruft den Wert der basicProcess-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBasicProcess() {
        return basicProcess;
    }

    /**
     * Legt den Wert der basicProcess-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBasicProcess(String value) {
        this.basicProcess = value;
    }

}
