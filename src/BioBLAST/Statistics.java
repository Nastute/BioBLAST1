//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.10.14 at 05:31:45 PM EEST 
//


package BioBLAST;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "statisticsDbNum",
    "statisticsDbLen",
    "statisticsHspLen",
    "statisticsEffSpace",
    "statisticsKappa",
    "statisticsLambda",
    "statisticsEntropy"
})
@XmlRootElement(name = "Statistics")
public class Statistics {

    @XmlElement(name = "Statistics_db-num", required = true)
    protected String statisticsDbNum;
    @XmlElement(name = "Statistics_db-len", required = true)
    protected String statisticsDbLen;
    @XmlElement(name = "Statistics_hsp-len", required = true)
    protected String statisticsHspLen;
    @XmlElement(name = "Statistics_eff-space", required = true)
    protected String statisticsEffSpace;
    @XmlElement(name = "Statistics_kappa", required = true)
    protected String statisticsKappa;
    @XmlElement(name = "Statistics_lambda", required = true)
    protected String statisticsLambda;
    @XmlElement(name = "Statistics_entropy", required = true)
    protected String statisticsEntropy;

    /**
     * Gets the value of the statisticsDbNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatisticsDbNum() {
        return statisticsDbNum;
    }

    /**
     * Sets the value of the statisticsDbNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatisticsDbNum(String value) {
        this.statisticsDbNum = value;
    }

    /**
     * Gets the value of the statisticsDbLen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatisticsDbLen() {
        return statisticsDbLen;
    }

    /**
     * Sets the value of the statisticsDbLen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatisticsDbLen(String value) {
        this.statisticsDbLen = value;
    }

    /**
     * Gets the value of the statisticsHspLen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatisticsHspLen() {
        return statisticsHspLen;
    }

    /**
     * Sets the value of the statisticsHspLen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatisticsHspLen(String value) {
        this.statisticsHspLen = value;
    }

    /**
     * Gets the value of the statisticsEffSpace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatisticsEffSpace() {
        return statisticsEffSpace;
    }

    /**
     * Sets the value of the statisticsEffSpace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatisticsEffSpace(String value) {
        this.statisticsEffSpace = value;
    }

    /**
     * Gets the value of the statisticsKappa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatisticsKappa() {
        return statisticsKappa;
    }

    /**
     * Sets the value of the statisticsKappa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatisticsKappa(String value) {
        this.statisticsKappa = value;
    }

    /**
     * Gets the value of the statisticsLambda property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatisticsLambda() {
        return statisticsLambda;
    }

    /**
     * Sets the value of the statisticsLambda property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatisticsLambda(String value) {
        this.statisticsLambda = value;
    }

    /**
     * Gets the value of the statisticsEntropy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatisticsEntropy() {
        return statisticsEntropy;
    }

    /**
     * Sets the value of the statisticsEntropy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatisticsEntropy(String value) {
        this.statisticsEntropy = value;
    }

}
