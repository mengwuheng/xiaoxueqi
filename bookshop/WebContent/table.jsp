<%@page contentType="text/html; charset=utf-8" %>
<!DOCTYPE html><html><head><meta charset="utf-8"><title></title></head>
<body>
		<%@include file="/currentTime.jsp" %>
		<br>
		<jsp:include page="/currentTime.html"></jsp:include>		
		
		<table border="1" width="90%" align="center">
		<%
			String rowStr = request.getParameter("row");
			int row = Integer.parseInt(rowStr);
			for(int i=0;i<row;i++)
			{
			%>
			<tr>
				<%
					for(int j=0;j<10;j++)
					{
						%>
						<td><%=i*10+j+1 %></td>
						<% 
					}
				%>
			</tr>
			
			<%
			}
		%>
	
			
		</table></body></html>
