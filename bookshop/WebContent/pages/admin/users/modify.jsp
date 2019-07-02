<%@page import="cn.edu.nsu.bookshop.db.last.users.Users"%>
<%@page import="cn.edu.nsu.bookshop.db.last.users.UsersDAO"%>
<%@page import="com.sun.org.apache.xerces.internal.parsers.IntegratedParserConfiguration"%>
<%@page contentType="text/html; charset=utf-8" %>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="C" %>
<!DOCTYPE html>
<html lang="en">
<head>
<title>修改人员-网上书店</title>
<meta charset="utf-8">
<!--全局CSS-->
<link rel="stylesheet" type="text/css" href="/bookshop/css/admin/share/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="/bookshop/css/font-awesome/css/font-awesome.min.css">
<link rel="stylesheet" type="text/css" href="/bookshop/css/admin/share/myStyle.css">
<!--私有CSS-->
<link href="/bookshop/plugins/datetimePicker/css/bootstrap-datetimepicker.min.css" rel="stylesheet" media="screen">

</head>
<body>
    <!-- 页面顶部导航条 -->
	<div class="row panel titlePanel">
		<div class="col-md-12">
			<div class="col-md-3">U
				<h3>
					<i class="fa fa-dashboard"></i> 人员管理
				</h3>
			</div>
			<div class="col-md-6">
				<div style="text-align: center;"></div>
			</div>
			<div class="col-md-3">
				<ul class="functionTip app-breadcrumb breadcrumb">
					<li class="breadcrumb-item"><i class="fa fa-home fa-lg"></i></li>
					<li class="breadcrumb-item"><a href="">人员管理 / 修改</a></li>
				</ul>
			</div>
		</div>
	</div>
    <!-- 页面内容体 -->
    
	<div class="row">
	   <div class="col-md-12">
		  <form  action="<%=request.getContextPath()%>/Admin/User/Modify" method="post">
			  			<div class="panel-group" id="accordion">
				
				<div class="panel panel-default">
					<div class="panel-heading">
						<h4 class="panel-title" style="text-align:left;">
							<a data-toggle="collapse" data-parent="#accordion" 
							   href="#collapse1">
								<i class="fa fa-hand-o-right" aria-hidden="true"></i>基本信息
							</a>
						</h4>
					</div>
					<div id="collapse1" class="panel-collapse collapse in">
						<div class="panel-body">
			              	<div class="col-md-12 row">
			              	
								<div class="form-group col-md-6 form-inline" >
								  <label class="control-label-required">姓名</label>
								  <input class="form-control" type="text"value="${user.users.users_name}" placeholder="请输入人员的姓名">
								</div>
								<div class="form-group col-md-6 form-inline" >
								  <label class="control-label-required">密码</label>
								  <input name="user_name"class="form-control" type="text" value="${user.users.users_password}" placeholder="请输入人员的姓名">
								</div>
								
								<div class="form-group col-md-6 form-inline" >
								  <label class="control-label-required">性别</label>
							  <select class="form-control">
								       <option value ="男" ${(user.user_sex=="男")?"selected":"" }></option>
								       <option value ="女" ${(user.user_sex=="女")?"selected":"" }></option>
								  </select>			
								</div>
								
								<div class="form-group col-md-6 form-inline" >
								  <label class="control-label-required">职务</label>
								  <select class="form-control">
								  <C:forEach items="${roles }" var="role">
								  	<option> value ="roles_id" ${(user.roles_id==role.roles_id)?"selected":"" ${role.roles_name }</option>
									
								    </C:forEach>
								       
								  </select>			
								</div>
								
								<div class="form-group col-md-6 form-inline" >
								  <label class="control-label-required">身份<br>证号</label>
								  <input class="form-control" type="text" placeholder="请输入人员的省份证号码">
								</div>
								
								<div class="form-group col-md-6 form-inline" >
								  <label class="control-label-required">手机</label>
								  <input class="form-control" type="text" placeholder="请输入人员的手机号码">
								</div>
								
								<div class="form-group col-md-6 form-inline" >
									<label class="control-label-required">地址</label>
									<textarea class="form-control" rows="4" cols="40" placeholder="请输入人员的地址"></textarea>
								</div>
								
								<div class="form-group col-md-6 form-inline" >
								  <label class="control-label-required">邮编</label>
								  <input class="form-control" type="text" placeholder="请输入人员的邮政编码">
								</div>
								
								<div class="form-group col-md-6 form-inline" >
								  <label class="control-label-norequired">头像</label>
								  <input class="form-control" type="file">
								</div>
						   </div>
              
						</div>
						
					</div>
				</div>				
				
				
			
			   <div class="panel panel-default">
					<div class="panel-footer" style="text-align: center;">
							 <button type="button" class="btn btn-primary" onclick="navTo('/bookshop/pages/admin/users/list.jsp')"><i class="fa fa-fw fa-lg fa-times-circle"></i>返回</button>
							 <button type="submit" class="btn btn-warning"><i class="fa fa-fw fa-lg fa-check-circle"></i>提交</button> 
				    </div>
				</div>
			
			
			</div>
		  </form>
	    </div>
		
	</div>

	<!--全局JS -->
	<script src="/bookshop/js/admin/share/jquery-3.2.1.min.js"></script>
	<script src="/bookshop/js/admin/share/bootstrap.min.js"></script> 
	<script src="/bookshop/js/admin/share/share.js"></script>
	<!--私有JS-->
	<script src="/bookshop/js/admin/share/cityDrop.js"></script>

</body>