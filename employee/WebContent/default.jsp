<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.8.3.min.js"></script>
<script type="text/javascript">

					 $(function(){
						 $.get("${pageContext.request.contextPath}/employee1",function(data){
							 var option="<option/>";
								for (var int = 0; int < data.length; int++) {
									option+="<option value="+data[int].post_id+">"+data[int].post_name+"</option>";
								} 
								$("#post_name").append(option);
							
						 });
						 $("#formsubmit").click(function(){
							 
							var name= $("#post_name").val();
							
							if(name==""){
								alert("请选择职位")
							}else{
								$("#postform").submit();
							}
						 });
					});
	</script>
</head>
<body>
	<form id="postform" action="${pageContext.request.contextPath }/employee" method="post">
			<div  align="center">
				<div style="background-color: palevioletred;width: 400px;height:150px;line-height:150px;">
					<font color="white" size="6" ">雇员查询系统</font>
				</div>
				<div style="background-color: blanchedalmond;width: 400px;height:50px;line-height:50px;text-align: left;font-size: large;">
					雇员姓名:<input type="text" name="emp_name" />
				</div>
				<div style="background-color: blanchedalmond;width: 400px;height:50px;line-height:50px;text-align: left;font-size: large;">
					公司职位:<select id="post_name" name="post_id" style="width: 150px;"></select>
				</div>
				
				<div style="width: 400px;height:50px;;text-align: left;">
					<input type="button" id="formsubmit" value="查询雇员明细" />
				</div>
			</div>
	</form>
</body>
</html>