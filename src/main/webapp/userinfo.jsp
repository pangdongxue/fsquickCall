<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	<title>套餐推荐查询</title>
	<%
	// 权限验证
	if(session.getAttribute("currentStaff")==null){
		response.sendRedirect("index.jsp");
		return;
	}
	%>
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/jquery-easyui-1.3.3/themes/default/easyui.css">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/jquery-easyui-1.3.3/themes/icon.css">
	<script type="text/javascript" src="${pageContext.request.contextPath }/jquery-easyui-1.3.3/jquery.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath }/jquery-easyui-1.3.3/jquery.easyui.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath }/jquery-easyui-1.3.3/locale/easyui-lang-zh_CN.js"></script>
	<script>
		var url;
		
		//打开新增用户对话框
		function openUserAddDialog(){
			//在勾选情况下点击新增要先清除数据
			resetValue();
			$("#dlg").dialog("open").dialog("setTitle","添加客户信息");
			url="${pageContext.request.contextPath}/user/userSave.do";
		}
		//重置对话框内数据
		function resetValue(){
			$("#loginid").val("");
			$("#name").val("");
			$("#phone").val("");
			$("#planid").val("");
			$("#plan").val("");
			$("#note").val("");
		}
		//关闭对话框
		function closeUserDialog(){
			$("#dlg").dialog("close");
			resetValue();
		}
		//提交新增用户数据
		function saveUser(){
			$("#fm").form("submit",{
				url:url,
				contentType: 'application/json',
				success:function(result){					
					var res = eval('('+result+')');	                    
	                if (res.success){
	                    $.messager.alert("系统提示","保存成功");
						resetValue();
	                    $('#dlg').dialog('close');
	                    $('#dg').datagrid('reload');
	                } else{
	                	$.messager.alert("系统提示",res.errorMsg);
	                }	                    	               					
				}
			});
		}
		//删除选中的用户数据
		function deleteUser(){
			//获得选中数据对象
			var selectedRows=$("#dg").datagrid('getSelections');
			if(selectedRows.length==0){
				$.messager.alert("系统提示","请选择要删除的数据！");
				return;
			}
			var strIds=[];//要删除的序号组合
			for(var i=0;i<selectedRows.length;i++){
				strIds.push(selectedRows[i].id);
			}
			var ids=strIds.join(",");
			$.messager.confirm("系统提示","您确认要删掉这<font color=red>"+selectedRows.length+"</font>条数据吗？",function(r){
				if(r){
					//ajax提交 delIds
					$.post("${pageContext.request.contextPath}/user/userDelete.do",{delIds:ids},function(result){
						if(result.success){
							$.messager.alert("系统提示","您已成功删除<font color=red>"+result.delNums+"</font>条数据！");
							$("#dg").datagrid("reload");
						}else{
							$.messager.alert('系统提示',"数据删除失败！");
						}
					},"json");
				}
			});
		}
		//修改用户资料
		function openUserModifyDialog(){
			var selectedRows=$("#dg").datagrid('getSelections');
			if(selectedRows.length!=1){
				$.messager.alert("系统提示","请选择一条要编辑的数据！");
				return;
			}
			var row=selectedRows[0];
			$("#dlg").dialog("open").dialog("setTitle","编辑用户信息");
			$("#loginid").val(row.loginid);
			$("#name").val(row.name);
			$("#phone").val(row.phone);
			$("#planid").val(row.planid);
			$("#plan").val(row.plan);
			$("#note").val(row.note);
			url="${pageContext.request.contextPath}/user/userSave.do?id=" + row.id;
		}
		//查询符合条件的用户
		function searchUser(){
			$('#dg').datagrid('load',{
				name:$('#username').val(),
				phone:$('#userphone').val(),
			});
		}
		
		function exportUser2(){
			window.open('${pageContext.request.contextPath}/user/exportExcel.do');
		}
		
		function downloadTemplate(){
			window.open('${pageContext.request.contextPath}/template/userExporTemplate.xls');
		}
		
		function uploadFile(){
			var uploadFile = $("#uploadFile").val();
		    if(uploadFile=='') {
		    	alert("请选择需上传的文件!");
		    	return false;
		    }else if(uploadFile.indexOf('.xls')==-1){
		    	alert("文件格式不正确，请选择正确的Excel文件(后缀名.xls)！");
		    	return false;
		    }
			$("#uploadForm").form("submit",{
				success:function(result){
					var result=eval('('+result+')');
					if(result.errorMsg){
						$.messager.alert("系统提示",result.errorMsg);
					}else{
						$.messager.alert("系统提示","上传成功");	
					}
				}
			});
		}
		
	</script>
</head>
<body class="easyui-layout">
	<div region="north" style="height: 70px; background-color: #ffffff">
		<div align="left" style="float: left; height:65px; "><img src="../images/title.png"></div>
		<div style="padding-top: 40px;padding-right: 20px; float:right">当前用户：&nbsp;<font color="red" >${currentStaff.staffName}</font><a href="${pageContext.request.contextPath}/index.jsp" style="margin-left:20px;text-decoration:none">注销登录</a></div>
	</div>
	<div region="center">
		<table id="dg" title="产品推荐" class="easyui-datagrid" 
	            url="${pageContext.request.contextPath}/user/userList.do"
	            toolbar="#toolbar" pagination="true"
	            rownumbers="true" fitColumns="true" singleSelect="false" nowrap="false" word-wrap="break-word"
	            fitColumns="true" fit="true" >
	        <thead>
	            <tr>
	            	<th field="cb" checkbox="true"></th>
	            	<th field="id" width="50" hidden="true">编号</th>
	            	<th field="loginid" width="15" >员工账号</th>
	                <th field="name" width="15">客户姓名</th>
	                <th field="phone" width="20">电话号码</th>
	                <th field="planid" width="20">产品id</th>
	                <th field="plan" width="30">推荐产品</th>
	                <th field="note" width="50" >备注</th>
	            </tr>
	        </thead>
	    </table>
	    <div id="toolbar">
		    <div>
		    <form id="uploadForm" action="${pageContext.request.contextPath}/user/uploadExcel.do" method="post" enctype="multipart/form-data">
		    	<a href="javascript:openUserAddDialog()" class="easyui-linkbutton" iconCls="icon-add" plain="true">添加</a>
				<a href="javascript:openUserModifyDialog()" class="easyui-linkbutton" iconCls="icon-edit" plain="true">修改</a>
				<a href="javascript:deleteUser()" class="easyui-linkbutton" iconCls="icon-remove" plain="true">移除</a>
		    			 			    		    											
					<a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-import" plain="true" onclick="uploadFile()">上传excel文件</a>
					<input type="file" id="uploadFile" name="userUploadFile">				
			    			   
		    	
		    	<a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-export" plain="true" onclick="exportUser2()">导出excel文件</a>
			    	<a href="javascript:void(0)" class="easyui-linkbutton"  iconCls="icon-import" plain="true" onclick="downloadTemplate()">下载excel模版</a>
		    </form>
		    </div> 
			<div>
				<label>客户姓名</label> 
	            <input id="username" class="easyui-textbox" label="Search:" labelPosition="left">&nbsp;
	            <label>手机号码</label>
	            <input id="userphone" class="easyui-textbox" label="Search:" labelPosition="left">&nbsp;		   
				<a href="javascript:searchUser()" class="easyui-linkbutton" iconCls="icon-search" plain="true">搜索</a>
			</div>            
	    </div>
	    
	    <div id="dlg" class="easyui-dialog" style="width:280px;height:350px;padding:10px 20px"
            closed="true" buttons="#dlg-buttons">
	        <form id="fm" method="post">
	            <div style="height:35px">
	                <label>员工账号:</label>
	                <input value="${user.loginid }" name="loginid" id="loginid" class="easyui-validatebox" required="true">
	            </div>	           
	            <div style="height:35px">
	                <label>客户姓名:</label>
	                <input value="${user.name }" name="name" id="name" class="easyui-validatebox" required="true">
	            </div>
	            <div style="height:35px">
	                <label>电话号码:</label>
	                <input value="${user.phone }" name="phone" id="phone" class="easyui-validatebox" required="true">
	            </div>
	            <div style="height:35px">
	                <label>产&nbsp;品&nbsp;id&nbsp;:</label>
	                <input value="${user.planid }" name="planid" id="planid" class="easyui-validatebox" required="true">
	            </div>
	            <div style="height:35px">
	                <label>推荐产品:</label>
	                <input value="${user.plan }" name="plan" id="plan" class="easyui-validatebox" required="true">
	            </div>
	            <div style="height:35px">
	                <label>备注:</label>
	                <div>
	                	<textarea rows="2" cols="25" value="${user.note }" name="note" id="note"></textarea>
	                </div>
	                
	            </div>
	        </form>
    	</div>
    	
    	<div id="dlg-buttons">
			<a href="javascript:saveUser()" class="easyui-linkbutton" iconCls="icon-ok">保存</a>
			<a href="javascript:closeUserDialog()" class="easyui-linkbutton" iconCls="icon-cancel">关闭</a>
		</div>
    	   	
    </div>
	      
</body>
</html>
