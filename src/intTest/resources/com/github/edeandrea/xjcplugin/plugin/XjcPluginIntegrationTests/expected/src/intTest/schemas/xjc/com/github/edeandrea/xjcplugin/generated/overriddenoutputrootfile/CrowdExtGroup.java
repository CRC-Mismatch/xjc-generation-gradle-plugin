//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.02.04 at 02:26:25 PM EST 
//


package com.github.edeandrea.xjcplugin.generated.overriddenoutputrootfile;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for crowdExtGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="crowdExtGroup"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="existsInArtifactory" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="groupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="importIntoArtifactory" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "crowdExtGroup", propOrder = {
    "description",
    "existsInArtifactory",
    "groupName",
    "importIntoArtifactory"
})
@XmlSeeAlso({
    CrowdGroupModel.class
})
public class CrowdExtGroup
    implements Serializable
{

    protected String description;
    protected boolean existsInArtifactory;
    protected String groupName;
    protected boolean importIntoArtifactory;

    /**
     * Gets the value of the description property.
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
     * Sets the value of the description property.
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
     * Gets the value of the existsInArtifactory property.
     * 
     */
    public boolean isExistsInArtifactory() {
        return existsInArtifactory;
    }

    /**
     * Sets the value of the existsInArtifactory property.
     * 
     */
    public void setExistsInArtifactory(boolean value) {
        this.existsInArtifactory = value;
    }

    /**
     * Gets the value of the groupName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * Sets the value of the groupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupName(String value) {
        this.groupName = value;
    }

    /**
     * Gets the value of the importIntoArtifactory property.
     * 
     */
    public boolean isImportIntoArtifactory() {
        return importIntoArtifactory;
    }

    /**
     * Sets the value of the importIntoArtifactory property.
     * 
     */
    public void setImportIntoArtifactory(boolean value) {
        this.importIntoArtifactory = value;
    }

}
