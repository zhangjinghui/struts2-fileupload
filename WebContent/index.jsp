<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<s:debug></s:debug>
	<s:form action="testFileUpload" method="post"
		enctype="multipart/form-data" theme="simple">
		<s:fielderror name="ppt"></s:fielderror>
		<s:actionerror />

		<s:file name="ppt" label="File"></s:file>
		<s:textfield name="desc[0]" label="Desc"></s:textfield>
		<br>
		<br>

		<s:file name="ppt" label="File"></s:file>
		<s:textfield name="desc[1]" label="Desc"></s:textfield>
		<br>
		<br>

		<s:file name="ppt" label="File"></s:file>
		<s:textfield name="desc[2]" label="Desc"></s:textfield>
		<br>
		<br>

		<s:submit></s:submit>
	</s:form>
</body>
</html>