
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>    
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<base href="http://983836259.blog.51cto.com/7311475/">
<title>FilterDemo</title>
</head>
<body>
	<%
		System.out.println("test.jsp is loading");
	%>
	<div align="center">
		This is test page
	</div>
</body>
</html>