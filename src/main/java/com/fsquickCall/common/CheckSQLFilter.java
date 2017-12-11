package com.fsquickCall.common;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class CheckSQLFilter implements Filter {

	public CheckSQLFilter() {
		
	}
	
	public void destroy() {
		
	}

	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse resp = (HttpServletResponse) response;
		String url = req.getRequestURL().toString();
		//System.out.println("port:" + req.getLocalPort());

		Enumeration params = req.getParameterNames();
		
		String sql = "";
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset=UTF-8");
		while (params.hasMoreElements()) {
			String name = params.nextElement().toString();
			System.out.println("params:" + name);
			String[] value = req.getParameterValues(name);
			System.out.println("params:" + value);
			for (int i = 0; i < value.length; i++) {				
				sql = sql + value[i];
			}
		}

		if (sqlValidate(sql)) {
			resp.getWriter()
			.print("<!DOTYPE html>"
					+ "<html>"
					+ "<body style=\"text-align:center;\">"
					+ "<font style='color:#FF0000;'>url不能带有非法字符,请重新输入！</font>"
					+ "<p><input type='button' name='back' value='返回' onclick='javascript:history.go(-1);'/>"
					+ "</body></html>");
			try {
				throw new IOException("您发送请求中的参数中含有非法字符,请检查！");
			} catch (Exception e) {				
				e.printStackTrace();
				return;
			}
		}else{
			chain.doFilter(request,response);
		}
	}
	
	private static boolean sqlValidate(String str) {
		str = str.toLowerCase();
		String[] badStrs = { "'", "and", "exec", "execute", "insert", "create",
				"drop", "table", "from", "grant", "use", "group_concat",
				"column_name", "information_schema.columns", "table_schema",
				"union", "where", "select", "delete", "update", "order", "by",
				"count", "*", "chr", "mid", "master", "truncate", "char",
				"declare", "or", "-", "--", "+", "like", "%", "#" };
		
		for (int i = 0; i < badStrs.length; i++) {			
			if (str.indexOf(badStrs[i]) != -1) {
				return true;
			}
		}
		return false;
	}

	public void init(FilterConfig fConfig) throws ServletException {
		
	}
}
