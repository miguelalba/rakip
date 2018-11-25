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
 * <p>Java-Klasse für Reference complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Reference">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IsReferenceDescription" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Type" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="ABST"/>
 *               &lt;enumeration value="ADVS"/>
 *               &lt;enumeration value="AGGR"/>
 *               &lt;enumeration value="ANCIENT"/>
 *               &lt;enumeration value="ART"/>
 *               &lt;enumeration value="BILL"/>
 *               &lt;enumeration value="BLOG"/>
 *               &lt;enumeration value="BOOK"/>
 *               &lt;enumeration value="CASE"/>
 *               &lt;enumeration value="CHAP"/>
 *               &lt;enumeration value="CHART"/>
 *               &lt;enumeration value="CLSWK"/>
 *               &lt;enumeration value="COMP"/>
 *               &lt;enumeration value="CONF"/>
 *               &lt;enumeration value="CPAPER"/>
 *               &lt;enumeration value="CTLG"/>
 *               &lt;enumeration value="DATA"/>
 *               &lt;enumeration value="DBASE"/>
 *               &lt;enumeration value="DICT"/>
 *               &lt;enumeration value="EBOOK"/>
 *               &lt;enumeration value="ECHAP"/>
 *               &lt;enumeration value="EDBOOK"/>
 *               &lt;enumeration value="EJOUR"/>
 *               &lt;enumeration value="ELECT"/>
 *               &lt;enumeration value="ENCYC"/>
 *               &lt;enumeration value="EQUA"/>
 *               &lt;enumeration value="FIGURE"/>
 *               &lt;enumeration value="GEN"/>
 *               &lt;enumeration value="GOVDOC"/>
 *               &lt;enumeration value="GRANT"/>
 *               &lt;enumeration value="HEAR"/>
 *               &lt;enumeration value="ICOMM"/>
 *               &lt;enumeration value="INPR"/>
 *               &lt;enumeration value="JOUR"/>
 *               &lt;enumeration value="JFULL"/>
 *               &lt;enumeration value="LEGAL"/>
 *               &lt;enumeration value="MANSCPT"/>
 *               &lt;enumeration value="MAP"/>
 *               &lt;enumeration value="MGZN"/>
 *               &lt;enumeration value="MPCT"/>
 *               &lt;enumeration value="MULTI"/>
 *               &lt;enumeration value="MUSIC"/>
 *               &lt;enumeration value="NEW"/>
 *               &lt;enumeration value="PAMP"/>
 *               &lt;enumeration value="PAT"/>
 *               &lt;enumeration value="PCOMM"/>
 *               &lt;enumeration value="RPRT"/>
 *               &lt;enumeration value="SER"/>
 *               &lt;enumeration value="SLIDE"/>
 *               &lt;enumeration value="SOUND"/>
 *               &lt;enumeration value="STAND"/>
 *               &lt;enumeration value="STAT"/>
 *               &lt;enumeration value="THES"/>
 *               &lt;enumeration value="UNPB"/>
 *               &lt;enumeration value="VIDEO"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Pmid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Doi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AuthorList" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Abstract" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Journal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Volume" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Issue" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Website" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Reference", propOrder = {
    "isReferenceDescription",
    "type",
    "date",
    "pmid",
    "doi",
    "authorList",
    "title",
    "_abstract",
    "journal",
    "volume",
    "issue",
    "status",
    "website",
    "comment"
})
public class Reference {

    @XmlElement(name = "IsReferenceDescription")
    protected boolean isReferenceDescription;
    @XmlElement(name = "Type")
    protected String type;
    @XmlElement(name = "Date")
    protected String date;
    @XmlElement(name = "Pmid")
    protected String pmid;
    @XmlElement(name = "Doi")
    protected String doi;
    @XmlElement(name = "AuthorList")
    protected String authorList;
    @XmlElement(name = "Title", required = true)
    protected String title;
    @XmlElement(name = "Abstract")
    protected String _abstract;
    @XmlElement(name = "Journal")
    protected String journal;
    @XmlElement(name = "Volume")
    protected Integer volume;
    @XmlElement(name = "Issue")
    protected Integer issue;
    @XmlElement(name = "Status")
    protected String status;
    @XmlElement(name = "Website")
    protected String website;
    @XmlElement(name = "Comment")
    protected String comment;

    /**
     * Ruft den Wert der isReferenceDescription-Eigenschaft ab.
     * 
     */
    public boolean isIsReferenceDescription() {
        return isReferenceDescription;
    }

    /**
     * Legt den Wert der isReferenceDescription-Eigenschaft fest.
     * 
     */
    public void setIsReferenceDescription(boolean value) {
        this.isReferenceDescription = value;
    }

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
     * Ruft den Wert der date-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDate() {
        return date;
    }

    /**
     * Legt den Wert der date-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDate(String value) {
        this.date = value;
    }

    /**
     * Ruft den Wert der pmid-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPmid() {
        return pmid;
    }

    /**
     * Legt den Wert der pmid-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPmid(String value) {
        this.pmid = value;
    }

    /**
     * Ruft den Wert der doi-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDoi() {
        return doi;
    }

    /**
     * Legt den Wert der doi-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDoi(String value) {
        this.doi = value;
    }

    /**
     * Ruft den Wert der authorList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorList() {
        return authorList;
    }

    /**
     * Legt den Wert der authorList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorList(String value) {
        this.authorList = value;
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
     * Ruft den Wert der abstract-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAbstract() {
        return _abstract;
    }

    /**
     * Legt den Wert der abstract-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAbstract(String value) {
        this._abstract = value;
    }

    /**
     * Ruft den Wert der journal-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJournal() {
        return journal;
    }

    /**
     * Legt den Wert der journal-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJournal(String value) {
        this.journal = value;
    }

    /**
     * Ruft den Wert der volume-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVolume() {
        return volume;
    }

    /**
     * Legt den Wert der volume-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVolume(Integer value) {
        this.volume = value;
    }

    /**
     * Ruft den Wert der issue-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIssue() {
        return issue;
    }

    /**
     * Legt den Wert der issue-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIssue(Integer value) {
        this.issue = value;
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
     * Ruft den Wert der website-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebsite() {
        return website;
    }

    /**
     * Legt den Wert der website-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebsite(String value) {
        this.website = value;
    }

    /**
     * Ruft den Wert der comment-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Legt den Wert der comment-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

}
