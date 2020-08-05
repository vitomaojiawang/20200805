<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<form action="${pageContext.request.contextPath }/admin/exam/createPaper.do" method="post">
	试卷名称 : <input type="text"  name="paperName">  <br>
	目标用户组： <input type="checkbox" name="groupid" value="2">高一年级组
				<input type="checkbox" name="groupid" value="3">高二年级组
	 <br>
	<select name="questionBb">
		<option>请选择章节</option>
		<option value="18">18</option>
		<option value="19">19</option>
		<option value="20">20</option>
	</select>
	<select name="questionType">
		<option>请选择题型</option>
		<option value="1">单选</option>
		<option value="2">多选</option>
		<option value="3">判断</option>
	</select>
	<input type="text" name="count">
	<input type="text" name="score">
	 <br>
		<select name="questionBb">
		<option>请选择章节</option>
		<option value="18">18</option>
		<option value="19">19</option>
		<option value="20">20</option>
	</select>
	<select name="questionType">
		<option>请选择题型</option>
		<option value="1">单选</option>
		<option value="2">多选</option>
		<option value="3">判断</option>
	</select>
	<input type="text" name="count">
	<input type="text" name="score"> <br>
	
	<input type="submit" value="立刻提交">
	</form>
	

	

</body>
</html>