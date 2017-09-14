package com.fsquickCall.util;

import java.io.ByteArrayInputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.apache.axis.message.SOAPHeaderElement;
import org.apache.commons.lang.StringUtils;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;


import net.gmcc.fs.nwsc.ECOP.ECOPWebServiceLocator;
import net.gmcc.fs.nwsc.ECOP.ECOPWebServiceSoapStub;
import net.gmcc.fs.nwsc.ECOP.Result;



public class ECOPUtils {

	public final static String systemId = "__FSMobile-ABOSS__" ;
	public final static String userName="ABOSS" ;
	public final static String password="ABOSS123" ;
	public final static String secretKey="Yy#77x#9";
	
	public static String gettokenValue()throws Exception{
		String gettokenvalue="";
		String now=new SimpleDateFormat("yyyyMMddHHmmssSSSS").format(new Date());		
		String value=String.format("%s|%s|%s|%s",systemId,userName, password, now);		
		gettokenvalue=DESUtil.encrypt(value,secretKey);		
		return gettokenvalue;
		
	}
	
	public static String gettoken() throws Exception{
		String token="";
		try {
			URL url=new URL("http://nwsc.fs.gmcc.net/ECOPService/ECOPWebService.asmx?wsdl");		  
			ECOPWebServiceLocator Locator = new ECOPWebServiceLocator(); 
			ECOPWebServiceSoapStub stub = new ECOPWebServiceSoapStub(url,Locator);				
			Result result;		
			result=stub.getToken(systemId, gettokenValue());
			if(result.getCode()==-1){
				//System.out.println(result.getMessage());
				return null;
			}
			token=result.getMessage();
		} catch (MalformedURLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		return token;
		
	}
	
	public static String getInvokeValue () throws Exception{				
		String getinvokevalue="";
		String token=gettoken();
		String value=String.format("%s%s%s",token,systemId,secretKey);
		MD5 m = new MD5();
		String md5 = m.getMD5ofStr(value);
		String value2=String.format("%s|%s|%s",token,systemId,md5);
		getinvokevalue = DESUtil.encrypt(value2,secretKey);	
		//System.out.println(getinvokevalue);
		return getinvokevalue;
	}
	
	public static ECOPWebServiceSoapStub getEcopService() throws Exception {
				
		String invokeValue = getInvokeValue();
		URL url=new URL("http://nwsc.fs.gmcc.net/ECOPService/ECOPWebService.asmx?wsdl");
		ECOPWebServiceSoapStub service=new ECOPWebServiceSoapStub(url,null);
		SOAPHeaderElement header=new SOAPHeaderElement("http://nwsc.fs.gmcc.net/ECOP/","SecurityAPI");
		header.addChildElement("InvokeValue").setValue(invokeValue);
		service.setHeader(header);
		return service;
	}
	
	
	public static HashMap UnPackageXml(String xmlStr) {
		HashMap rst = new HashMap();
		try {
			DocumentBuilderFactory factory = DocumentBuilderFactory
					.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			ByteArrayInputStream stream = new ByteArrayInputStream(
					xmlStr.getBytes("UTF-8"));
			Document doc = builder.parse(stream);
			Element root = doc.getDocumentElement();
			NodeList children = root.getChildNodes();
			getAllLeafNode(null, children, rst);

		} catch (Exception e) {
			e.printStackTrace();
			rst = null;
		}
		if (rst.isEmpty())
			rst = null;
		return rst;

	}

	private static void getAllLeafNode(String parentNodeName,
			NodeList nodeList, HashMap<String, String> rst) {

		for (int i = 0; i < nodeList.getLength(); i++) {
			Node child = nodeList.item(i);

			if (child.getNodeType() == Node.ELEMENT_NODE) {
				Element childElement = (Element) child;
				String name = childElement.getTagName().trim();
				String pathName = name;
				if (StringUtils.isNotEmpty(parentNodeName)) {
					pathName = parentNodeName + "." + name;
				}
				pathName = getPathNodeNameFromList(rst, pathName, 0);
				if (isLeaf(childElement)) {
					Text textnode = (Text) childElement.getFirstChild();
					if (textnode != null) {
						String text = textnode.getData().trim();
						if (StringUtils.isNotEmpty(text)) {
							// System.out.println(pathName+"="+text);
							rst.put(pathName, text);
						}
					} else {
						rst.put(pathName, "");
					}
				} else {
					NodeList childList = childElement.getChildNodes();
					getAllLeafNode(pathName, childList, rst);
				}
			}
		}
	}

	private static String getPathNodeNameFromList(HashMap<String, String> rst,
			String name, int count) {
		if (rst.containsKey(name)) {
			String nn = name;
			if (nn.indexOf("[") > 0) {
				nn = nn.substring(0, nn.indexOf("["));
			}
			nn = nn + "[" + count + "]";
			return getPathNodeNameFromList(rst, nn, ++count);
		} else {
			return name;
		}
	}

	
	private static boolean isLeaf(Element ele) {
		if (ele.getChildNodes().getLength() == 0) {
			return true;
		}
		if (ele.getChildNodes().getLength() == 1) {
			Node child = ele.getChildNodes().item(0);
			if (child.getNodeType() != Node.ELEMENT_NODE) {
				return true;
			}
		}
		return false;
	}	
	
}