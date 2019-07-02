<%@page import="java.util.Date"%>
<%@page contentType="text/html; charset=utf-8" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>当前时间
		</title>
	</head>
	<body>
	<%!private String currentTime = ""; %>
		<%
			 Date date = new Date();
			String timeStr = date.toLocaleString();
		%>
		当前时间： <font color="red"><%=timeStr %></font>
	</body>
</html>
