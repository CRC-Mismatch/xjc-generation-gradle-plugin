//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.10.10 at 03:44:48 PM EDT 
//


package com.github.edeandrea.xjcplugin.generated.maven2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This element describes all of the classpath resources associated with a project
 *         or unit tests.
 * 
 * <p>Java class for Resource complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Resource"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="targetPath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="filtering" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="directory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="includes" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="include" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="excludes" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="exclude" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Resource", propOrder = {

})
public class Resource
    implements Serializable
{

    protected String targetPath;
    protected String filtering;
    protected String directory;
    protected Resource.Includes includes;
    protected Resource.Excludes excludes;

    /**
     * Gets the value of the targetPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetPath() {
        return targetPath;
    }

    /**
     * Sets the value of the targetPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetPath(String value) {
        this.targetPath = value;
    }

    /**
     * Gets the value of the filtering property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFiltering() {
        return filtering;
    }

    /**
     * Sets the value of the filtering property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFiltering(String value) {
        this.filtering = value;
    }

    /**
     * Gets the value of the directory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirectory() {
        return directory;
    }

    /**
     * Sets the value of the directory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirectory(String value) {
        this.directory = value;
    }

    /**
     * Gets the value of the includes property.
     * 
     * @return
     *     possible object is
     *     {@link Resource.Includes }
     *     
     */
    public Resource.Includes getIncludes() {
        return includes;
    }

    /**
     * Sets the value of the includes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Resource.Includes }
     *     
     */
    public void setIncludes(Resource.Includes value) {
        this.includes = value;
    }

    /**
     * Gets the value of the excludes property.
     * 
     * @return
     *     possible object is
     *     {@link Resource.Excludes }
     *     
     */
    public Resource.Excludes getExcludes() {
        return excludes;
    }

    /**
     * Sets the value of the excludes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Resource.Excludes }
     *     
     */
    public void setExcludes(Resource.Excludes value) {
        this.excludes = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="exclude" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "excludes"
    })
    public static class Excludes
        implements Serializable
    {

        @XmlElement(name = "exclude")
        protected List<String> excludes;

        /**
         * Gets the value of the excludes property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the excludes property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getExcludes().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getExcludes() {
            if (excludes == null) {
                excludes = new ArrayList<String>();
            }
            return this.excludes;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="include" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "includes"
    })
    public static class Includes
        implements Serializable
    {

        @XmlElement(name = "include")
        protected List<String> includes;

        /**
         * Gets the value of the includes property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the includes property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getIncludes().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getIncludes() {
            if (includes == null) {
                includes = new ArrayList<String>();
            }
            return this.includes;
        }

    }

}
