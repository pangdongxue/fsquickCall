<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>系统登录</title>
<script type="text/javascript">
	function resetValue(){
		document.getElementById("staffName").value="";
		document.getElementById("password").value="";
	}
</script>
</head>
<body>
	<div align="center" style="background:url(${pageContext.request.contextPath }/images/login.png) no-repeat center ; padding-top: 50px;">
		<form action="${pageContext.request.contextPath }/user/login.do" method="post">
		<table  width="740" height="500"  >
			<tr height="200">
				<td colspan="4"></td>
			</tr>
			<tr height="10">
				<td width="70%"></td>
				<td width="10%">用户名   </td>
				<td><input type="text" style="background:url(${pageContext.request.contextPath }/images/txt.gif); border: none" placeholder="请使用portal账号登录" value="${staff.staffName }" name="staffName" id="staffName"/></td>
				<td width="30%"></td>
			</tr>
			<tr height="10">
				<td colspan="4"></td>
			</tr>
			<tr height="10">
				<td width="70%"></td>
				<td width="10%">密&nbsp;&nbsp;码   </td>
				<td><input type="password" style="background:url(${pageContext.request.contextPath }/images/txt.gif); border: none" placeholder="请输入portal账号密码" value="${staff.password }" name="password" id="password"/></td>
				<td width="30%"></td>
			</tr>
			<tr height="15">
				<td colspan="4"></td>
			</tr>
			<tr height="10">
				<td width="70%"></td>
				<td width="10%"><input type="submit" style="background-color:#E40177; border: 10; font-size: 15px; color: white;" value="登录"/></td>
				<td style="text-align:center;"><input type="button" align="center"; style=" background-color:#E40177; border: 10; font-size: 15px; color: white;" value="重置" onclick="resetValue()"/></td>
				<td width="30%"></td>
			</tr>
			<tr height="10">
				<td width="70%"></td>
				<td colspan="3">
					<font color="red">${errorMsg }</font>
				</td>
			</tr>
			<tr >
				<td></td>
			</tr>
		</table>
		</form>
	</div>
</body>
</html>