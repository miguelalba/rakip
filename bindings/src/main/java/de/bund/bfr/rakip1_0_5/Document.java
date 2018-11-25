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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java-Klasse für anonymous complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="GenericModel">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="GeneralInformation">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Source" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Author" type="{http://www.example.org/GenericModel1.0.3}Contact"/>
 *                             &lt;element name="Creator" type="{http://www.example.org/GenericModel1.0.3}Contact" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="CreationDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                             &lt;element name="ModificationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                             &lt;element name="Rights" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Available" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                             &lt;element name="Format" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Reference" type="{http://www.example.org/GenericModel1.0.3}Reference" maxOccurs="unbounded"/>
 *                             &lt;element name="Language" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Software" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="LanguageWrittenIn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ModelCategory" type="{http://www.example.org/GenericModel1.0.3}ModelCategory" minOccurs="0"/>
 *                             &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Objective" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Scope" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Product" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="Unit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="Method" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="Packaging" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="Treatment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="OriginCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="OriginArea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="FisheriesArea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="ProductionDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                                       &lt;element name="ExpiryDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Hazard" type="{http://www.example.org/GenericModel1.0.3}Hazard" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="PopulationGroup" type="{http://www.example.org/GenericModel1.0.3}PopulationGroup" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="GeneralComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="TemporalInformation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="SpatialInformation" type="{http://www.example.org/GenericModel1.0.3}SpatialInformation" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="DataBackground" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Study" type="{http://www.example.org/GenericModel1.0.3}Study" minOccurs="0"/>
 *                             &lt;element name="StudySample" type="{http://www.example.org/GenericModel1.0.3}StudySample" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="DietaryAssessmentMethod" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="CollectionTool" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="NumberOfNonConsecutiveOneDay" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="SoftwareTool" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="NumberOfFoodItems" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="RecordTypes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="FoodDescriptors" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Laboratory" type="{http://www.example.org/GenericModel1.0.3}Laboratory" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="Assay" type="{http://www.example.org/GenericModel1.0.3}Assay" maxOccurs="unbounded" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="ModelMath" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Parameter" type="{http://www.example.org/GenericModel1.0.3}Parameter" maxOccurs="unbounded"/>
 *                             &lt;element name="QualityMeasures" type="{http://www.example.org/GenericModel1.0.3}QualityMeasures" minOccurs="0"/>
 *                             &lt;element name="ModelEquation" type="{http://www.example.org/GenericModel1.0.3}ModelEquation" minOccurs="0"/>
 *                             &lt;element name="FittingProcedure" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Exposure" type="{http://www.example.org/GenericModel1.0.3}Exposure" minOccurs="0"/>
 *                             &lt;element name="Event" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="DoseResponseModel">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="GeneralInformation">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ModelName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Source" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Author" type="{http://www.example.org/GenericModel1.0.3}Contact" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="Creator" type="{http://www.example.org/GenericModel1.0.3}Contact" maxOccurs="unbounded"/>
 *                             &lt;element name="CreationDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                             &lt;element name="ModificationDate" type="{http://www.w3.org/2001/XMLSchema}date" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="Rights" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Available" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                             &lt;element name="Format" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Reference" type="{http://www.example.org/GenericModel1.0.3}Reference" maxOccurs="unbounded"/>
 *                             &lt;element name="Language" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Software" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="LanguageWrittenIn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="ModelCategory" type="{http://www.example.org/GenericModel1.0.3}ModelCategory" minOccurs="0"/>
 *                             &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Objective" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Scope">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Hazard" type="{http://www.example.org/GenericModel1.0.3}Hazard" maxOccurs="unbounded"/>
 *                             &lt;element name="PopulationGroup" type="{http://www.example.org/GenericModel1.0.3}PopulationGroup" maxOccurs="unbounded"/>
 *                             &lt;element name="GeneralComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="TemporalInformation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="SpatialInformation" type="{http://www.example.org/GenericModel1.0.3}SpatialInformation" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="DataBackground">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Study" type="{http://www.example.org/GenericModel1.0.3}Study"/>
 *                             &lt;element name="StudySample" type="{http://www.example.org/GenericModel1.0.3}StudySample" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="Laboratory" type="{http://www.example.org/GenericModel1.0.3}Laboratory" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="Assay" type="{http://www.example.org/GenericModel1.0.3}Assay" maxOccurs="unbounded" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="ModelMath">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Parameter" type="{http://www.example.org/GenericModel1.0.3}Parameter" maxOccurs="unbounded"/>
 *                             &lt;element name="QualityMeasures" type="{http://www.example.org/GenericModel1.0.3}QualityMeasures" minOccurs="0"/>
 *                             &lt;element name="ModelEquation" type="{http://www.example.org/GenericModel1.0.3}ModelEquation" minOccurs="0"/>
 *                             &lt;element name="FittingProcedure" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Exposure" type="{http://www.example.org/GenericModel1.0.3}Exposure" minOccurs="0"/>
 *                             &lt;element name="Event" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "genericModel",
    "doseResponseModel"
})
@XmlRootElement(name = "Document")
public class Document {

    @XmlElement(name = "GenericModel")
    protected Document.GenericModel genericModel;
    @XmlElement(name = "DoseResponseModel")
    protected Document.DoseResponseModel doseResponseModel;

    /**
     * Ruft den Wert der genericModel-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Document.GenericModel }
     *     
     */
    public Document.GenericModel getGenericModel() {
        return genericModel;
    }

    /**
     * Legt den Wert der genericModel-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Document.GenericModel }
     *     
     */
    public void setGenericModel(Document.GenericModel value) {
        this.genericModel = value;
    }

    /**
     * Ruft den Wert der doseResponseModel-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Document.DoseResponseModel }
     *     
     */
    public Document.DoseResponseModel getDoseResponseModel() {
        return doseResponseModel;
    }

    /**
     * Legt den Wert der doseResponseModel-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Document.DoseResponseModel }
     *     
     */
    public void setDoseResponseModel(Document.DoseResponseModel value) {
        this.doseResponseModel = value;
    }


    /**
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="GeneralInformation">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ModelName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Source" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Author" type="{http://www.example.org/GenericModel1.0.3}Contact" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="Creator" type="{http://www.example.org/GenericModel1.0.3}Contact" maxOccurs="unbounded"/>
     *                   &lt;element name="CreationDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                   &lt;element name="ModificationDate" type="{http://www.w3.org/2001/XMLSchema}date" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="Rights" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Available" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                   &lt;element name="Format" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Reference" type="{http://www.example.org/GenericModel1.0.3}Reference" maxOccurs="unbounded"/>
     *                   &lt;element name="Language" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Software" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="LanguageWrittenIn" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="ModelCategory" type="{http://www.example.org/GenericModel1.0.3}ModelCategory" minOccurs="0"/>
     *                   &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Objective" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Scope">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Hazard" type="{http://www.example.org/GenericModel1.0.3}Hazard" maxOccurs="unbounded"/>
     *                   &lt;element name="PopulationGroup" type="{http://www.example.org/GenericModel1.0.3}PopulationGroup" maxOccurs="unbounded"/>
     *                   &lt;element name="GeneralComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="TemporalInformation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="SpatialInformation" type="{http://www.example.org/GenericModel1.0.3}SpatialInformation" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="DataBackground">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Study" type="{http://www.example.org/GenericModel1.0.3}Study"/>
     *                   &lt;element name="StudySample" type="{http://www.example.org/GenericModel1.0.3}StudySample" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="Laboratory" type="{http://www.example.org/GenericModel1.0.3}Laboratory" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="Assay" type="{http://www.example.org/GenericModel1.0.3}Assay" maxOccurs="unbounded" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="ModelMath">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Parameter" type="{http://www.example.org/GenericModel1.0.3}Parameter" maxOccurs="unbounded"/>
     *                   &lt;element name="QualityMeasures" type="{http://www.example.org/GenericModel1.0.3}QualityMeasures" minOccurs="0"/>
     *                   &lt;element name="ModelEquation" type="{http://www.example.org/GenericModel1.0.3}ModelEquation" minOccurs="0"/>
     *                   &lt;element name="FittingProcedure" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Exposure" type="{http://www.example.org/GenericModel1.0.3}Exposure" minOccurs="0"/>
     *                   &lt;element name="Event" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "generalInformation",
        "scope",
        "dataBackground",
        "modelMath"
    })
    public static class DoseResponseModel {

        @XmlElement(name = "GeneralInformation", required = true)
        protected Document.DoseResponseModel.GeneralInformation generalInformation;
        @XmlElement(name = "Scope", required = true)
        protected Document.DoseResponseModel.Scope scope;
        @XmlElement(name = "DataBackground", required = true)
        protected Document.DoseResponseModel.DataBackground dataBackground;
        @XmlElement(name = "ModelMath", required = true)
        protected Document.DoseResponseModel.ModelMath modelMath;

        /**
         * Ruft den Wert der generalInformation-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Document.DoseResponseModel.GeneralInformation }
         *     
         */
        public Document.DoseResponseModel.GeneralInformation getGeneralInformation() {
            return generalInformation;
        }

        /**
         * Legt den Wert der generalInformation-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Document.DoseResponseModel.GeneralInformation }
         *     
         */
        public void setGeneralInformation(Document.DoseResponseModel.GeneralInformation value) {
            this.generalInformation = value;
        }

        /**
         * Ruft den Wert der scope-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Document.DoseResponseModel.Scope }
         *     
         */
        public Document.DoseResponseModel.Scope getScope() {
            return scope;
        }

        /**
         * Legt den Wert der scope-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Document.DoseResponseModel.Scope }
         *     
         */
        public void setScope(Document.DoseResponseModel.Scope value) {
            this.scope = value;
        }

        /**
         * Ruft den Wert der dataBackground-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Document.DoseResponseModel.DataBackground }
         *     
         */
        public Document.DoseResponseModel.DataBackground getDataBackground() {
            return dataBackground;
        }

        /**
         * Legt den Wert der dataBackground-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Document.DoseResponseModel.DataBackground }
         *     
         */
        public void setDataBackground(Document.DoseResponseModel.DataBackground value) {
            this.dataBackground = value;
        }

        /**
         * Ruft den Wert der modelMath-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Document.DoseResponseModel.ModelMath }
         *     
         */
        public Document.DoseResponseModel.ModelMath getModelMath() {
            return modelMath;
        }

        /**
         * Legt den Wert der modelMath-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Document.DoseResponseModel.ModelMath }
         *     
         */
        public void setModelMath(Document.DoseResponseModel.ModelMath value) {
            this.modelMath = value;
        }


        /**
         * <p>Java-Klasse für anonymous complex type.
         * 
         * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="Study" type="{http://www.example.org/GenericModel1.0.3}Study"/>
         *         &lt;element name="StudySample" type="{http://www.example.org/GenericModel1.0.3}StudySample" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element name="Laboratory" type="{http://www.example.org/GenericModel1.0.3}Laboratory" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element name="Assay" type="{http://www.example.org/GenericModel1.0.3}Assay" maxOccurs="unbounded" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "study",
            "studySample",
            "laboratory",
            "assay"
        })
        public static class DataBackground {

            @XmlElement(name = "Study", required = true)
            protected Study study;
            @XmlElement(name = "StudySample")
            protected List<StudySample> studySample;
            @XmlElement(name = "Laboratory")
            protected List<Laboratory> laboratory;
            @XmlElement(name = "Assay")
            protected List<Assay> assay;

            /**
             * Ruft den Wert der study-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link Study }
             *     
             */
            public Study getStudy() {
                return study;
            }

            /**
             * Legt den Wert der study-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link Study }
             *     
             */
            public void setStudy(Study value) {
                this.study = value;
            }

            /**
             * Gets the value of the studySample property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the studySample property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getStudySample().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link StudySample }
             * 
             * 
             */
            public List<StudySample> getStudySample() {
                if (studySample == null) {
                    studySample = new ArrayList<StudySample>();
                }
                return this.studySample;
            }

            /**
             * Gets the value of the laboratory property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the laboratory property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getLaboratory().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Laboratory }
             * 
             * 
             */
            public List<Laboratory> getLaboratory() {
                if (laboratory == null) {
                    laboratory = new ArrayList<Laboratory>();
                }
                return this.laboratory;
            }

            /**
             * Gets the value of the assay property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the assay property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getAssay().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Assay }
             * 
             * 
             */
            public List<Assay> getAssay() {
                if (assay == null) {
                    assay = new ArrayList<Assay>();
                }
                return this.assay;
            }

        }


        /**
         * <p>Java-Klasse für anonymous complex type.
         * 
         * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="ModelName" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Source" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Author" type="{http://www.example.org/GenericModel1.0.3}Contact" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element name="Creator" type="{http://www.example.org/GenericModel1.0.3}Contact" maxOccurs="unbounded"/>
         *         &lt;element name="CreationDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *         &lt;element name="ModificationDate" type="{http://www.w3.org/2001/XMLSchema}date" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element name="Rights" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Available" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
         *         &lt;element name="Format" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Reference" type="{http://www.example.org/GenericModel1.0.3}Reference" maxOccurs="unbounded"/>
         *         &lt;element name="Language" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Software" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="LanguageWrittenIn" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="ModelCategory" type="{http://www.example.org/GenericModel1.0.3}ModelCategory" minOccurs="0"/>
         *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Objective" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "modelName",
            "source",
            "identifier",
            "author",
            "creator",
            "creationDate",
            "modificationDate",
            "rights",
            "available",
            "format",
            "reference",
            "language",
            "software",
            "languageWrittenIn",
            "modelCategory",
            "status",
            "objective",
            "description"
        })
        public static class GeneralInformation {

            @XmlElement(name = "ModelName", required = true)
            protected String modelName;
            @XmlElement(name = "Source")
            protected String source;
            @XmlElement(name = "Identifier", required = true)
            protected String identifier;
            @XmlElement(name = "Author")
            protected List<Contact> author;
            @XmlElement(name = "Creator", required = true)
            protected List<Contact> creator;
            @XmlElement(name = "CreationDate", required = true)
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar creationDate;
            @XmlElement(name = "ModificationDate")
            @XmlSchemaType(name = "date")
            protected List<XMLGregorianCalendar> modificationDate;
            @XmlElement(name = "Rights", required = true)
            protected String rights;
            @XmlElement(name = "Available")
            protected Boolean available;
            @XmlElement(name = "Format")
            protected String format;
            @XmlElement(name = "Reference", required = true)
            protected List<Reference> reference;
            @XmlElement(name = "Language")
            protected String language;
            @XmlElement(name = "Software")
            protected String software;
            @XmlElement(name = "LanguageWrittenIn", required = true)
            protected String languageWrittenIn;
            @XmlElement(name = "ModelCategory")
            protected ModelCategory modelCategory;
            @XmlElement(name = "Status")
            protected String status;
            @XmlElement(name = "Objective")
            protected String objective;
            @XmlElement(name = "Description")
            protected String description;

            /**
             * Ruft den Wert der modelName-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getModelName() {
                return modelName;
            }

            /**
             * Legt den Wert der modelName-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setModelName(String value) {
                this.modelName = value;
            }

            /**
             * Ruft den Wert der source-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSource() {
                return source;
            }

            /**
             * Legt den Wert der source-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSource(String value) {
                this.source = value;
            }

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
             * Gets the value of the author property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the author property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getAuthor().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Contact }
             * 
             * 
             */
            public List<Contact> getAuthor() {
                if (author == null) {
                    author = new ArrayList<Contact>();
                }
                return this.author;
            }

            /**
             * Gets the value of the creator property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the creator property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getCreator().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Contact }
             * 
             * 
             */
            public List<Contact> getCreator() {
                if (creator == null) {
                    creator = new ArrayList<Contact>();
                }
                return this.creator;
            }

            /**
             * Ruft den Wert der creationDate-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getCreationDate() {
                return creationDate;
            }

            /**
             * Legt den Wert der creationDate-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setCreationDate(XMLGregorianCalendar value) {
                this.creationDate = value;
            }

            /**
             * Gets the value of the modificationDate property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the modificationDate property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getModificationDate().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link XMLGregorianCalendar }
             * 
             * 
             */
            public List<XMLGregorianCalendar> getModificationDate() {
                if (modificationDate == null) {
                    modificationDate = new ArrayList<XMLGregorianCalendar>();
                }
                return this.modificationDate;
            }

            /**
             * Ruft den Wert der rights-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRights() {
                return rights;
            }

            /**
             * Legt den Wert der rights-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRights(String value) {
                this.rights = value;
            }

            /**
             * Ruft den Wert der available-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isAvailable() {
                return available;
            }

            /**
             * Legt den Wert der available-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setAvailable(Boolean value) {
                this.available = value;
            }

            /**
             * Ruft den Wert der format-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFormat() {
                return format;
            }

            /**
             * Legt den Wert der format-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFormat(String value) {
                this.format = value;
            }

            /**
             * Gets the value of the reference property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the reference property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getReference().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Reference }
             * 
             * 
             */
            public List<Reference> getReference() {
                if (reference == null) {
                    reference = new ArrayList<Reference>();
                }
                return this.reference;
            }

            /**
             * Ruft den Wert der language-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLanguage() {
                return language;
            }

            /**
             * Legt den Wert der language-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLanguage(String value) {
                this.language = value;
            }

            /**
             * Ruft den Wert der software-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSoftware() {
                return software;
            }

            /**
             * Legt den Wert der software-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSoftware(String value) {
                this.software = value;
            }

            /**
             * Ruft den Wert der languageWrittenIn-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLanguageWrittenIn() {
                return languageWrittenIn;
            }

            /**
             * Legt den Wert der languageWrittenIn-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLanguageWrittenIn(String value) {
                this.languageWrittenIn = value;
            }

            /**
             * Ruft den Wert der modelCategory-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link ModelCategory }
             *     
             */
            public ModelCategory getModelCategory() {
                return modelCategory;
            }

            /**
             * Legt den Wert der modelCategory-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link ModelCategory }
             *     
             */
            public void setModelCategory(ModelCategory value) {
                this.modelCategory = value;
            }

            /**
             * Ruft den Wert der status-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getStatus() {
                return status;
            }

            /**
             * Legt den Wert der status-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setStatus(String value) {
                this.status = value;
            }

            /**
             * Ruft den Wert der objective-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getObjective() {
                return objective;
            }

            /**
             * Legt den Wert der objective-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setObjective(String value) {
                this.objective = value;
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

        }


        /**
         * <p>Java-Klasse für anonymous complex type.
         * 
         * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="Parameter" type="{http://www.example.org/GenericModel1.0.3}Parameter" maxOccurs="unbounded"/>
         *         &lt;element name="QualityMeasures" type="{http://www.example.org/GenericModel1.0.3}QualityMeasures" minOccurs="0"/>
         *         &lt;element name="ModelEquation" type="{http://www.example.org/GenericModel1.0.3}ModelEquation" minOccurs="0"/>
         *         &lt;element name="FittingProcedure" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Exposure" type="{http://www.example.org/GenericModel1.0.3}Exposure" minOccurs="0"/>
         *         &lt;element name="Event" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "parameter",
            "qualityMeasures",
            "modelEquation",
            "fittingProcedure",
            "exposure",
            "event"
        })
        public static class ModelMath {

            @XmlElement(name = "Parameter", required = true)
            protected List<Parameter> parameter;
            @XmlElement(name = "QualityMeasures")
            protected QualityMeasures qualityMeasures;
            @XmlElement(name = "ModelEquation")
            protected ModelEquation modelEquation;
            @XmlElement(name = "FittingProcedure")
            protected String fittingProcedure;
            @XmlElement(name = "Exposure")
            protected Exposure exposure;
            @XmlElement(name = "Event")
            protected String event;

            /**
             * Gets the value of the parameter property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the parameter property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getParameter().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Parameter }
             * 
             * 
             */
            public List<Parameter> getParameter() {
                if (parameter == null) {
                    parameter = new ArrayList<Parameter>();
                }
                return this.parameter;
            }

            /**
             * Ruft den Wert der qualityMeasures-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link QualityMeasures }
             *     
             */
            public QualityMeasures getQualityMeasures() {
                return qualityMeasures;
            }

            /**
             * Legt den Wert der qualityMeasures-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link QualityMeasures }
             *     
             */
            public void setQualityMeasures(QualityMeasures value) {
                this.qualityMeasures = value;
            }

            /**
             * Ruft den Wert der modelEquation-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link ModelEquation }
             *     
             */
            public ModelEquation getModelEquation() {
                return modelEquation;
            }

            /**
             * Legt den Wert der modelEquation-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link ModelEquation }
             *     
             */
            public void setModelEquation(ModelEquation value) {
                this.modelEquation = value;
            }

            /**
             * Ruft den Wert der fittingProcedure-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFittingProcedure() {
                return fittingProcedure;
            }

            /**
             * Legt den Wert der fittingProcedure-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFittingProcedure(String value) {
                this.fittingProcedure = value;
            }

            /**
             * Ruft den Wert der exposure-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link Exposure }
             *     
             */
            public Exposure getExposure() {
                return exposure;
            }

            /**
             * Legt den Wert der exposure-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link Exposure }
             *     
             */
            public void setExposure(Exposure value) {
                this.exposure = value;
            }

            /**
             * Ruft den Wert der event-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEvent() {
                return event;
            }

            /**
             * Legt den Wert der event-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEvent(String value) {
                this.event = value;
            }

        }


        /**
         * <p>Java-Klasse für anonymous complex type.
         * 
         * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="Hazard" type="{http://www.example.org/GenericModel1.0.3}Hazard" maxOccurs="unbounded"/>
         *         &lt;element name="PopulationGroup" type="{http://www.example.org/GenericModel1.0.3}PopulationGroup" maxOccurs="unbounded"/>
         *         &lt;element name="GeneralComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="TemporalInformation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="SpatialInformation" type="{http://www.example.org/GenericModel1.0.3}SpatialInformation" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "hazard",
            "populationGroup",
            "generalComment",
            "temporalInformation",
            "spatialInformation"
        })
        public static class Scope {

            @XmlElement(name = "Hazard", required = true)
            protected List<Hazard> hazard;
            @XmlElement(name = "PopulationGroup", required = true)
            protected List<PopulationGroup> populationGroup;
            @XmlElement(name = "GeneralComment")
            protected String generalComment;
            @XmlElement(name = "TemporalInformation")
            protected String temporalInformation;
            @XmlElement(name = "SpatialInformation")
            protected SpatialInformation spatialInformation;

            /**
             * Gets the value of the hazard property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the hazard property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getHazard().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Hazard }
             * 
             * 
             */
            public List<Hazard> getHazard() {
                if (hazard == null) {
                    hazard = new ArrayList<Hazard>();
                }
                return this.hazard;
            }

            /**
             * Gets the value of the populationGroup property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the populationGroup property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPopulationGroup().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link PopulationGroup }
             * 
             * 
             */
            public List<PopulationGroup> getPopulationGroup() {
                if (populationGroup == null) {
                    populationGroup = new ArrayList<PopulationGroup>();
                }
                return this.populationGroup;
            }

            /**
             * Ruft den Wert der generalComment-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getGeneralComment() {
                return generalComment;
            }

            /**
             * Legt den Wert der generalComment-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setGeneralComment(String value) {
                this.generalComment = value;
            }

            /**
             * Ruft den Wert der temporalInformation-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTemporalInformation() {
                return temporalInformation;
            }

            /**
             * Legt den Wert der temporalInformation-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTemporalInformation(String value) {
                this.temporalInformation = value;
            }

            /**
             * Ruft den Wert der spatialInformation-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link SpatialInformation }
             *     
             */
            public SpatialInformation getSpatialInformation() {
                return spatialInformation;
            }

            /**
             * Legt den Wert der spatialInformation-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link SpatialInformation }
             *     
             */
            public void setSpatialInformation(SpatialInformation value) {
                this.spatialInformation = value;
            }

        }

    }


    /**
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="GeneralInformation">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Source" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Author" type="{http://www.example.org/GenericModel1.0.3}Contact"/>
     *                   &lt;element name="Creator" type="{http://www.example.org/GenericModel1.0.3}Contact" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="CreationDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                   &lt;element name="ModificationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                   &lt;element name="Rights" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Available" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *                   &lt;element name="Format" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Reference" type="{http://www.example.org/GenericModel1.0.3}Reference" maxOccurs="unbounded"/>
     *                   &lt;element name="Language" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Software" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="LanguageWrittenIn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ModelCategory" type="{http://www.example.org/GenericModel1.0.3}ModelCategory" minOccurs="0"/>
     *                   &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Objective" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Scope" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Product" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="Unit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="Method" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="Packaging" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="Treatment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="OriginCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="OriginArea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="FisheriesArea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="ProductionDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                             &lt;element name="ExpiryDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Hazard" type="{http://www.example.org/GenericModel1.0.3}Hazard" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="PopulationGroup" type="{http://www.example.org/GenericModel1.0.3}PopulationGroup" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="GeneralComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="TemporalInformation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="SpatialInformation" type="{http://www.example.org/GenericModel1.0.3}SpatialInformation" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="DataBackground" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Study" type="{http://www.example.org/GenericModel1.0.3}Study" minOccurs="0"/>
     *                   &lt;element name="StudySample" type="{http://www.example.org/GenericModel1.0.3}StudySample" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="DietaryAssessmentMethod" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="CollectionTool" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="NumberOfNonConsecutiveOneDay" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="SoftwareTool" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="NumberOfFoodItems" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="RecordTypes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="FoodDescriptors" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Laboratory" type="{http://www.example.org/GenericModel1.0.3}Laboratory" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="Assay" type="{http://www.example.org/GenericModel1.0.3}Assay" maxOccurs="unbounded" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="ModelMath" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Parameter" type="{http://www.example.org/GenericModel1.0.3}Parameter" maxOccurs="unbounded"/>
     *                   &lt;element name="QualityMeasures" type="{http://www.example.org/GenericModel1.0.3}QualityMeasures" minOccurs="0"/>
     *                   &lt;element name="ModelEquation" type="{http://www.example.org/GenericModel1.0.3}ModelEquation" minOccurs="0"/>
     *                   &lt;element name="FittingProcedure" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Exposure" type="{http://www.example.org/GenericModel1.0.3}Exposure" minOccurs="0"/>
     *                   &lt;element name="Event" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "generalInformation",
        "scope",
        "dataBackground",
        "modelMath"
    })
    public static class GenericModel {

        @XmlElement(name = "GeneralInformation", required = true)
        protected Document.GenericModel.GeneralInformation generalInformation;
        @XmlElement(name = "Scope")
        protected Document.GenericModel.Scope scope;
        @XmlElement(name = "DataBackground")
        protected Document.GenericModel.DataBackground dataBackground;
        @XmlElement(name = "ModelMath")
        protected Document.GenericModel.ModelMath modelMath;

        /**
         * Ruft den Wert der generalInformation-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Document.GenericModel.GeneralInformation }
         *     
         */
        public Document.GenericModel.GeneralInformation getGeneralInformation() {
            return generalInformation;
        }

        /**
         * Legt den Wert der generalInformation-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Document.GenericModel.GeneralInformation }
         *     
         */
        public void setGeneralInformation(Document.GenericModel.GeneralInformation value) {
            this.generalInformation = value;
        }

        /**
         * Ruft den Wert der scope-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Document.GenericModel.Scope }
         *     
         */
        public Document.GenericModel.Scope getScope() {
            return scope;
        }

        /**
         * Legt den Wert der scope-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Document.GenericModel.Scope }
         *     
         */
        public void setScope(Document.GenericModel.Scope value) {
            this.scope = value;
        }

        /**
         * Ruft den Wert der dataBackground-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Document.GenericModel.DataBackground }
         *     
         */
        public Document.GenericModel.DataBackground getDataBackground() {
            return dataBackground;
        }

        /**
         * Legt den Wert der dataBackground-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Document.GenericModel.DataBackground }
         *     
         */
        public void setDataBackground(Document.GenericModel.DataBackground value) {
            this.dataBackground = value;
        }

        /**
         * Ruft den Wert der modelMath-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Document.GenericModel.ModelMath }
         *     
         */
        public Document.GenericModel.ModelMath getModelMath() {
            return modelMath;
        }

        /**
         * Legt den Wert der modelMath-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Document.GenericModel.ModelMath }
         *     
         */
        public void setModelMath(Document.GenericModel.ModelMath value) {
            this.modelMath = value;
        }


        /**
         * <p>Java-Klasse für anonymous complex type.
         * 
         * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="Study" type="{http://www.example.org/GenericModel1.0.3}Study" minOccurs="0"/>
         *         &lt;element name="StudySample" type="{http://www.example.org/GenericModel1.0.3}StudySample" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element name="DietaryAssessmentMethod" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="CollectionTool" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="NumberOfNonConsecutiveOneDay" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="SoftwareTool" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="NumberOfFoodItems" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="RecordTypes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="FoodDescriptors" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Laboratory" type="{http://www.example.org/GenericModel1.0.3}Laboratory" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element name="Assay" type="{http://www.example.org/GenericModel1.0.3}Assay" maxOccurs="unbounded" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "study",
            "studySample",
            "dietaryAssessmentMethod",
            "laboratory",
            "assay"
        })
        public static class DataBackground {

            @XmlElement(name = "Study")
            protected Study study;
            @XmlElement(name = "StudySample")
            protected List<StudySample> studySample;
            @XmlElement(name = "DietaryAssessmentMethod")
            protected List<Document.GenericModel.DataBackground.DietaryAssessmentMethod> dietaryAssessmentMethod;
            @XmlElement(name = "Laboratory")
            protected List<Laboratory> laboratory;
            @XmlElement(name = "Assay")
            protected List<Assay> assay;

            /**
             * Ruft den Wert der study-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link Study }
             *     
             */
            public Study getStudy() {
                return study;
            }

            /**
             * Legt den Wert der study-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link Study }
             *     
             */
            public void setStudy(Study value) {
                this.study = value;
            }

            /**
             * Gets the value of the studySample property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the studySample property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getStudySample().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link StudySample }
             * 
             * 
             */
            public List<StudySample> getStudySample() {
                if (studySample == null) {
                    studySample = new ArrayList<StudySample>();
                }
                return this.studySample;
            }

            /**
             * Gets the value of the dietaryAssessmentMethod property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the dietaryAssessmentMethod property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getDietaryAssessmentMethod().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Document.GenericModel.DataBackground.DietaryAssessmentMethod }
             * 
             * 
             */
            public List<Document.GenericModel.DataBackground.DietaryAssessmentMethod> getDietaryAssessmentMethod() {
                if (dietaryAssessmentMethod == null) {
                    dietaryAssessmentMethod = new ArrayList<Document.GenericModel.DataBackground.DietaryAssessmentMethod>();
                }
                return this.dietaryAssessmentMethod;
            }

            /**
             * Gets the value of the laboratory property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the laboratory property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getLaboratory().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Laboratory }
             * 
             * 
             */
            public List<Laboratory> getLaboratory() {
                if (laboratory == null) {
                    laboratory = new ArrayList<Laboratory>();
                }
                return this.laboratory;
            }

            /**
             * Gets the value of the assay property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the assay property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getAssay().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Assay }
             * 
             * 
             */
            public List<Assay> getAssay() {
                if (assay == null) {
                    assay = new ArrayList<Assay>();
                }
                return this.assay;
            }


            /**
             * <p>Java-Klasse für anonymous complex type.
             * 
             * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="CollectionTool" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="NumberOfNonConsecutiveOneDay" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="SoftwareTool" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="NumberOfFoodItems" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="RecordTypes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="FoodDescriptors" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "collectionTool",
                "numberOfNonConsecutiveOneDay",
                "softwareTool",
                "numberOfFoodItems",
                "recordTypes",
                "foodDescriptors"
            })
            public static class DietaryAssessmentMethod {

                @XmlElement(name = "CollectionTool")
                protected String collectionTool;
                @XmlElement(name = "NumberOfNonConsecutiveOneDay")
                protected String numberOfNonConsecutiveOneDay;
                @XmlElement(name = "SoftwareTool")
                protected String softwareTool;
                @XmlElement(name = "NumberOfFoodItems")
                protected String numberOfFoodItems;
                @XmlElement(name = "RecordTypes")
                protected String recordTypes;
                @XmlElement(name = "FoodDescriptors")
                protected String foodDescriptors;

                /**
                 * Ruft den Wert der collectionTool-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCollectionTool() {
                    return collectionTool;
                }

                /**
                 * Legt den Wert der collectionTool-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCollectionTool(String value) {
                    this.collectionTool = value;
                }

                /**
                 * Ruft den Wert der numberOfNonConsecutiveOneDay-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNumberOfNonConsecutiveOneDay() {
                    return numberOfNonConsecutiveOneDay;
                }

                /**
                 * Legt den Wert der numberOfNonConsecutiveOneDay-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNumberOfNonConsecutiveOneDay(String value) {
                    this.numberOfNonConsecutiveOneDay = value;
                }

                /**
                 * Ruft den Wert der softwareTool-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSoftwareTool() {
                    return softwareTool;
                }

                /**
                 * Legt den Wert der softwareTool-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSoftwareTool(String value) {
                    this.softwareTool = value;
                }

                /**
                 * Ruft den Wert der numberOfFoodItems-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNumberOfFoodItems() {
                    return numberOfFoodItems;
                }

                /**
                 * Legt den Wert der numberOfFoodItems-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNumberOfFoodItems(String value) {
                    this.numberOfFoodItems = value;
                }

                /**
                 * Ruft den Wert der recordTypes-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getRecordTypes() {
                    return recordTypes;
                }

                /**
                 * Legt den Wert der recordTypes-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setRecordTypes(String value) {
                    this.recordTypes = value;
                }

                /**
                 * Ruft den Wert der foodDescriptors-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFoodDescriptors() {
                    return foodDescriptors;
                }

                /**
                 * Legt den Wert der foodDescriptors-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFoodDescriptors(String value) {
                    this.foodDescriptors = value;
                }

            }

        }


        /**
         * <p>Java-Klasse für anonymous complex type.
         * 
         * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Source" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Author" type="{http://www.example.org/GenericModel1.0.3}Contact"/>
         *         &lt;element name="Creator" type="{http://www.example.org/GenericModel1.0.3}Contact" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element name="CreationDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *         &lt;element name="ModificationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *         &lt;element name="Rights" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Available" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
         *         &lt;element name="Format" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Reference" type="{http://www.example.org/GenericModel1.0.3}Reference" maxOccurs="unbounded"/>
         *         &lt;element name="Language" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Software" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="LanguageWrittenIn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ModelCategory" type="{http://www.example.org/GenericModel1.0.3}ModelCategory" minOccurs="0"/>
         *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Objective" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "name",
            "source",
            "identifier",
            "author",
            "creator",
            "creationDate",
            "modificationDate",
            "rights",
            "available",
            "format",
            "reference",
            "language",
            "software",
            "languageWrittenIn",
            "modelCategory",
            "status",
            "objective",
            "description"
        })
        public static class GeneralInformation {

            @XmlElement(name = "Name", required = true)
            protected String name;
            @XmlElement(name = "Source")
            protected String source;
            @XmlElement(name = "Identifier", required = true)
            protected String identifier;
            @XmlElement(name = "Author", required = true)
            protected Contact author;
            @XmlElement(name = "Creator")
            protected List<Contact> creator;
            @XmlElement(name = "CreationDate", required = true)
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar creationDate;
            @XmlElement(name = "ModificationDate")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar modificationDate;
            @XmlElement(name = "Rights", required = true)
            protected String rights;
            @XmlElement(name = "Available")
            protected Boolean available;
            @XmlElement(name = "Format")
            protected String format;
            @XmlElement(name = "Reference", required = true)
            protected List<Reference> reference;
            @XmlElement(name = "Language")
            protected String language;
            @XmlElement(name = "Software")
            protected String software;
            @XmlElement(name = "LanguageWrittenIn")
            protected String languageWrittenIn;
            @XmlElement(name = "ModelCategory")
            protected ModelCategory modelCategory;
            @XmlElement(name = "Status")
            protected String status;
            @XmlElement(name = "Objective")
            protected String objective;
            @XmlElement(name = "Description")
            protected String description;

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
             * Ruft den Wert der source-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSource() {
                return source;
            }

            /**
             * Legt den Wert der source-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSource(String value) {
                this.source = value;
            }

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
             * Ruft den Wert der author-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link Contact }
             *     
             */
            public Contact getAuthor() {
                return author;
            }

            /**
             * Legt den Wert der author-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link Contact }
             *     
             */
            public void setAuthor(Contact value) {
                this.author = value;
            }

            /**
             * Gets the value of the creator property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the creator property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getCreator().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Contact }
             * 
             * 
             */
            public List<Contact> getCreator() {
                if (creator == null) {
                    creator = new ArrayList<Contact>();
                }
                return this.creator;
            }

            /**
             * Ruft den Wert der creationDate-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getCreationDate() {
                return creationDate;
            }

            /**
             * Legt den Wert der creationDate-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setCreationDate(XMLGregorianCalendar value) {
                this.creationDate = value;
            }

            /**
             * Ruft den Wert der modificationDate-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getModificationDate() {
                return modificationDate;
            }

            /**
             * Legt den Wert der modificationDate-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setModificationDate(XMLGregorianCalendar value) {
                this.modificationDate = value;
            }

            /**
             * Ruft den Wert der rights-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRights() {
                return rights;
            }

            /**
             * Legt den Wert der rights-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRights(String value) {
                this.rights = value;
            }

            /**
             * Ruft den Wert der available-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isAvailable() {
                return available;
            }

            /**
             * Legt den Wert der available-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setAvailable(Boolean value) {
                this.available = value;
            }

            /**
             * Ruft den Wert der format-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFormat() {
                return format;
            }

            /**
             * Legt den Wert der format-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFormat(String value) {
                this.format = value;
            }

            /**
             * Gets the value of the reference property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the reference property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getReference().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Reference }
             * 
             * 
             */
            public List<Reference> getReference() {
                if (reference == null) {
                    reference = new ArrayList<Reference>();
                }
                return this.reference;
            }

            /**
             * Ruft den Wert der language-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLanguage() {
                return language;
            }

            /**
             * Legt den Wert der language-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLanguage(String value) {
                this.language = value;
            }

            /**
             * Ruft den Wert der software-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSoftware() {
                return software;
            }

            /**
             * Legt den Wert der software-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSoftware(String value) {
                this.software = value;
            }

            /**
             * Ruft den Wert der languageWrittenIn-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLanguageWrittenIn() {
                return languageWrittenIn;
            }

            /**
             * Legt den Wert der languageWrittenIn-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLanguageWrittenIn(String value) {
                this.languageWrittenIn = value;
            }

            /**
             * Ruft den Wert der modelCategory-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link ModelCategory }
             *     
             */
            public ModelCategory getModelCategory() {
                return modelCategory;
            }

            /**
             * Legt den Wert der modelCategory-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link ModelCategory }
             *     
             */
            public void setModelCategory(ModelCategory value) {
                this.modelCategory = value;
            }

            /**
             * Ruft den Wert der status-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getStatus() {
                return status;
            }

            /**
             * Legt den Wert der status-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setStatus(String value) {
                this.status = value;
            }

            /**
             * Ruft den Wert der objective-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getObjective() {
                return objective;
            }

            /**
             * Legt den Wert der objective-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setObjective(String value) {
                this.objective = value;
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

        }


        /**
         * <p>Java-Klasse für anonymous complex type.
         * 
         * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="Parameter" type="{http://www.example.org/GenericModel1.0.3}Parameter" maxOccurs="unbounded"/>
         *         &lt;element name="QualityMeasures" type="{http://www.example.org/GenericModel1.0.3}QualityMeasures" minOccurs="0"/>
         *         &lt;element name="ModelEquation" type="{http://www.example.org/GenericModel1.0.3}ModelEquation" minOccurs="0"/>
         *         &lt;element name="FittingProcedure" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Exposure" type="{http://www.example.org/GenericModel1.0.3}Exposure" minOccurs="0"/>
         *         &lt;element name="Event" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "parameter",
            "qualityMeasures",
            "modelEquation",
            "fittingProcedure",
            "exposure",
            "event"
        })
        public static class ModelMath {

            @XmlElement(name = "Parameter", required = true)
            protected List<Parameter> parameter;
            @XmlElement(name = "QualityMeasures")
            protected QualityMeasures qualityMeasures;
            @XmlElement(name = "ModelEquation")
            protected ModelEquation modelEquation;
            @XmlElement(name = "FittingProcedure")
            protected String fittingProcedure;
            @XmlElement(name = "Exposure")
            protected Exposure exposure;
            @XmlElement(name = "Event")
            protected String event;

            /**
             * Gets the value of the parameter property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the parameter property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getParameter().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Parameter }
             * 
             * 
             */
            public List<Parameter> getParameter() {
                if (parameter == null) {
                    parameter = new ArrayList<Parameter>();
                }
                return this.parameter;
            }

            /**
             * Ruft den Wert der qualityMeasures-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link QualityMeasures }
             *     
             */
            public QualityMeasures getQualityMeasures() {
                return qualityMeasures;
            }

            /**
             * Legt den Wert der qualityMeasures-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link QualityMeasures }
             *     
             */
            public void setQualityMeasures(QualityMeasures value) {
                this.qualityMeasures = value;
            }

            /**
             * Ruft den Wert der modelEquation-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link ModelEquation }
             *     
             */
            public ModelEquation getModelEquation() {
                return modelEquation;
            }

            /**
             * Legt den Wert der modelEquation-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link ModelEquation }
             *     
             */
            public void setModelEquation(ModelEquation value) {
                this.modelEquation = value;
            }

            /**
             * Ruft den Wert der fittingProcedure-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFittingProcedure() {
                return fittingProcedure;
            }

            /**
             * Legt den Wert der fittingProcedure-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFittingProcedure(String value) {
                this.fittingProcedure = value;
            }

            /**
             * Ruft den Wert der exposure-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link Exposure }
             *     
             */
            public Exposure getExposure() {
                return exposure;
            }

            /**
             * Legt den Wert der exposure-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link Exposure }
             *     
             */
            public void setExposure(Exposure value) {
                this.exposure = value;
            }

            /**
             * Ruft den Wert der event-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEvent() {
                return event;
            }

            /**
             * Legt den Wert der event-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEvent(String value) {
                this.event = value;
            }

        }


        /**
         * <p>Java-Klasse für anonymous complex type.
         * 
         * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="Product" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="Unit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="Method" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="Packaging" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="Treatment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="OriginCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="OriginArea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="FisheriesArea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="ProductionDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *                   &lt;element name="ExpiryDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Hazard" type="{http://www.example.org/GenericModel1.0.3}Hazard" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element name="PopulationGroup" type="{http://www.example.org/GenericModel1.0.3}PopulationGroup" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element name="GeneralComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="TemporalInformation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="SpatialInformation" type="{http://www.example.org/GenericModel1.0.3}SpatialInformation" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "product",
            "hazard",
            "populationGroup",
            "generalComment",
            "temporalInformation",
            "spatialInformation"
        })
        public static class Scope {

            @XmlElement(name = "Product")
            protected List<Document.GenericModel.Scope.Product> product;
            @XmlElement(name = "Hazard")
            protected List<Hazard> hazard;
            @XmlElement(name = "PopulationGroup")
            protected List<PopulationGroup> populationGroup;
            @XmlElement(name = "GeneralComment")
            protected String generalComment;
            @XmlElement(name = "TemporalInformation")
            protected String temporalInformation;
            @XmlElement(name = "SpatialInformation")
            protected SpatialInformation spatialInformation;

            /**
             * Gets the value of the product property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the product property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getProduct().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Document.GenericModel.Scope.Product }
             * 
             * 
             */
            public List<Document.GenericModel.Scope.Product> getProduct() {
                if (product == null) {
                    product = new ArrayList<Document.GenericModel.Scope.Product>();
                }
                return this.product;
            }

            /**
             * Gets the value of the hazard property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the hazard property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getHazard().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Hazard }
             * 
             * 
             */
            public List<Hazard> getHazard() {
                if (hazard == null) {
                    hazard = new ArrayList<Hazard>();
                }
                return this.hazard;
            }

            /**
             * Gets the value of the populationGroup property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the populationGroup property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPopulationGroup().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link PopulationGroup }
             * 
             * 
             */
            public List<PopulationGroup> getPopulationGroup() {
                if (populationGroup == null) {
                    populationGroup = new ArrayList<PopulationGroup>();
                }
                return this.populationGroup;
            }

            /**
             * Ruft den Wert der generalComment-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getGeneralComment() {
                return generalComment;
            }

            /**
             * Legt den Wert der generalComment-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setGeneralComment(String value) {
                this.generalComment = value;
            }

            /**
             * Ruft den Wert der temporalInformation-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTemporalInformation() {
                return temporalInformation;
            }

            /**
             * Legt den Wert der temporalInformation-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTemporalInformation(String value) {
                this.temporalInformation = value;
            }

            /**
             * Ruft den Wert der spatialInformation-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link SpatialInformation }
             *     
             */
            public SpatialInformation getSpatialInformation() {
                return spatialInformation;
            }

            /**
             * Legt den Wert der spatialInformation-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link SpatialInformation }
             *     
             */
            public void setSpatialInformation(SpatialInformation value) {
                this.spatialInformation = value;
            }


            /**
             * <p>Java-Klasse für anonymous complex type.
             * 
             * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="Unit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="Method" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="Packaging" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="Treatment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="OriginCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="OriginArea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="FisheriesArea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="ProductionDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
             *         &lt;element name="ExpiryDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "name",
                "description",
                "unit",
                "method",
                "packaging",
                "treatment",
                "originCountry",
                "originArea",
                "fisheriesArea",
                "productionDate",
                "expiryDate"
            })
            public static class Product {

                @XmlElement(name = "Name", required = true)
                protected String name;
                @XmlElement(name = "Description")
                protected String description;
                @XmlElement(name = "Unit")
                protected String unit;
                @XmlElement(name = "Method")
                protected String method;
                @XmlElement(name = "Packaging")
                protected String packaging;
                @XmlElement(name = "Treatment")
                protected String treatment;
                @XmlElement(name = "OriginCountry")
                protected String originCountry;
                @XmlElement(name = "OriginArea")
                protected String originArea;
                @XmlElement(name = "FisheriesArea")
                protected String fisheriesArea;
                @XmlElement(name = "ProductionDate")
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar productionDate;
                @XmlElement(name = "ExpiryDate")
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar expiryDate;

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
                 * Ruft den Wert der method-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getMethod() {
                    return method;
                }

                /**
                 * Legt den Wert der method-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setMethod(String value) {
                    this.method = value;
                }

                /**
                 * Ruft den Wert der packaging-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPackaging() {
                    return packaging;
                }

                /**
                 * Legt den Wert der packaging-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPackaging(String value) {
                    this.packaging = value;
                }

                /**
                 * Ruft den Wert der treatment-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTreatment() {
                    return treatment;
                }

                /**
                 * Legt den Wert der treatment-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTreatment(String value) {
                    this.treatment = value;
                }

                /**
                 * Ruft den Wert der originCountry-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getOriginCountry() {
                    return originCountry;
                }

                /**
                 * Legt den Wert der originCountry-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setOriginCountry(String value) {
                    this.originCountry = value;
                }

                /**
                 * Ruft den Wert der originArea-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getOriginArea() {
                    return originArea;
                }

                /**
                 * Legt den Wert der originArea-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setOriginArea(String value) {
                    this.originArea = value;
                }

                /**
                 * Ruft den Wert der fisheriesArea-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFisheriesArea() {
                    return fisheriesArea;
                }

                /**
                 * Legt den Wert der fisheriesArea-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFisheriesArea(String value) {
                    this.fisheriesArea = value;
                }

                /**
                 * Ruft den Wert der productionDate-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getProductionDate() {
                    return productionDate;
                }

                /**
                 * Legt den Wert der productionDate-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setProductionDate(XMLGregorianCalendar value) {
                    this.productionDate = value;
                }

                /**
                 * Ruft den Wert der expiryDate-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getExpiryDate() {
                    return expiryDate;
                }

                /**
                 * Legt den Wert der expiryDate-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setExpiryDate(XMLGregorianCalendar value) {
                    this.expiryDate = value;
                }

            }

        }

    }

}
