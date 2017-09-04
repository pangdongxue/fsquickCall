/**
 * ResultOfLoginResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.gmcc.fs.nwsc.IAMSSSO.SSO_asmx;

public class ResultOfLoginResult  extends net.gmcc.fs.nwsc.IAMSSSO.SSO_asmx.ResultBase  implements java.io.Serializable {
    private net.gmcc.iamsweb.WS.LoginResult detail;

    public ResultOfLoginResult() {
    }

    public ResultOfLoginResult(
           int code,
           java.lang.String message,
           net.gmcc.iamsweb.WS.LoginResult detail) {
        super(
            code,
            message);
        this.detail = detail;
    }


    /**
     * Gets the detail value for this ResultOfLoginResult.
     * 
     * @return detail
     */
    public net.gmcc.iamsweb.WS.LoginResult getDetail() {
        return detail;
    }


    /**
     * Sets the detail value for this ResultOfLoginResult.
     * 
     * @param detail
     */
    public void setDetail(net.gmcc.iamsweb.WS.LoginResult detail) {
        this.detail = detail;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResultOfLoginResult)) return false;
        ResultOfLoginResult other = (ResultOfLoginResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.detail==null && other.getDetail()==null) || 
             (this.detail!=null &&
              this.detail.equals(other.getDetail())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getDetail() != null) {
            _hashCode += getDetail().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ResultOfLoginResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://nwsc.fs.gmcc.net/IAMSSSO/SSO.asmx", "ResultOfLoginResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("detail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://nwsc.fs.gmcc.net/IAMSSSO/SSO.asmx", "Detail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://iamsweb.gmcc.net/WS/", "LoginResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
