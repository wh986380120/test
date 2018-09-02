<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.8.3.min.js"></script>
<script type="text/javascript">
	
</script>
</head>
<body>
	<form >
		<div  align="center">
			<div style="background-color: lightskyblue;height:100px;line-height:100px;">
				<font color="white" size="6" ">雇员查询系统</font>
			</div>
			<div style="background-color: powderblue;height:40px;line-height:40px;">
				<div style="border-top:3px solid white ;border-right:3px solid white ;width: 185px;float: left;" >雇员编号</div>
				<div style="border-top:3px solid white ;border-right:3px solid white ;width: 185px;float: left;" >雇员职位</div>
				<div style="border-top:3px solid white ;border-right:3px solid white ;width: 185px;float: left;" >雇员姓名</div>
				<div style="border-top:3px solid white ;border-right:3px solid white ;width: 185px;float: left;" >雇员性别</div>
				<div style="border-top:3px solid white ;border-right:3px solid white ;width: 185px;float: left;" >雇员年龄</div>
				<div style="border-top:3px solid white ;border-right:3px solid white ;width: 200px;float: left;" >所属部门</div>
				<div style="border-top:3px solid white ;border-right:3px solid white ;width: 200px;float: left;" >雇员工龄</div>
			</div>
			<c:forEach items="${emplist }" var="emp" >
				<div style="height:40px;line-height:40px;">
					<div style="border-top:3px solid white ;border-right:3px solid white ;width: 185px;float: left;" name="emp_id">${emp.emp_id }</div>
					<div style="border-top:3px solid white ;border-right:3px solid white ;width: 185px;float: left;" name="emp_depart">${emp.emp_depart }</div>
					<div style="border-top:3px solid white ;border-right:3px solid white ;width: 185px;float: left;" name="emp_name">${emp.emp_name}</div>
					<div style="border-top:3px solid white ;border-right:3px solid white ;width: 185px;float: left;" name="emp_sex">${emp.emp_sex }</div>
					<div style="border-top:3px solid white ;border-right:3px solid white ;width: 185px;float: left;" name="emp_age">${emp.emp_age }</div>
					<div style="border-top:3px solid white ;border-right:3px solid white ;width: 200px;float: left;" name="post_name">${post.post_name}</div>
					<div style="border-top:3px solid white ;border-right:3px solid white ;width: 200px;float: left;" name="emp_year">${emp.emp_year }</div>
				</div>
			</c:forEach>
			<div style="border-top:3px solid white ;border-right:3px solid white ;width: 200px;float: left;" name="error">${error}</div>
		</div>
	</form>
</body>
</html>