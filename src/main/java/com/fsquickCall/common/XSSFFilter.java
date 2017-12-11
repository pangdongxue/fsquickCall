package com.fsquickCall.common;

import java.io.IOException;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class XSSFFilter implements Filter {

	private Map<String, Object> xssMap = new HashMap<String, Object>();

	
	public XSSFFilter() {
		
	}

	
	public void destroy() {
		
	}

	
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		
		HttpServletRequest req = (HttpServletRequest) request;
		
		HttpRequestWapper reqWapper = new HttpRequestWapper(req, xssMap);
		chain.doFilter(reqWapper, response);
	}

	
	public void init(FilterConfig fConfig) throws ServletException {
		
		xssMap.put("[s|S][c|C][r|R][i|C][p|P][t|T]", "");
		
		xssMap.put(
				"[\\\"\\\'][\\s]*[j|J][a|A][v|V][a|A][s|S][c|C][r|R][i|I][p|P][t|T]:(.*)[\\\"\\\']",
				"\"\"");
		
		xssMap.put("[e|E][v|V][a|A][l|L]\\((.*)\\)", "");
		
		xssMap.put("<", "&lt;");
		
		xssMap.put(">", "&gt;");
		
		xssMap.put("\\(", "(");
		
		xssMap.put("\\)", ")");
		
		xssMap.put("'", "");
		
		xssMap.put("\"", "");
	}

}
