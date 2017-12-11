package com.fsquickCall.common;

import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;


public class HttpRequestWapper extends HttpServletRequestWrapper {
	private Map<String, Object> xssMap;

	public HttpRequestWapper(HttpServletRequest request) {
		super(request);
		
	}

	public HttpRequestWapper(HttpServletRequest request,
			Map<String, Object> xssMap) {
		super(request);
		
		this.xssMap=xssMap ;
	}

	@Override
	public String getHeader(String name) {
		String value = super.getHeader(name);
		if (value == null) {
			return null;
		}
		value = cleanXss(value);
		return value;
	}

	@Override
	public String getParameter(String name) {
		String value = super.getParameter(name);
		if (value == null) {
			return null;
		}
		value = cleanXss(value);
		return value;
	}

	@Override
	public String[] getParameterValues(String name) {
		String values[] = super.getParameterValues(name);
		if (values == null) {
			return null;
		}
		int count = values.length;
		String encodeValues[] = new String[count];
		for (int i = 0; i < count; i++) {
			encodeValues[i] = cleanXss(values[i]);
		}
		return encodeValues;
	}

	private String cleanXss(String value) {
		Set<String> keySet = xssMap.keySet();
		for (String key : keySet) {
			String v = xssMap.get(key).toString();
			value = value.replaceAll(key, v);
		}
		return value;
	}
}
