<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="DTO.CourseDTO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>wellcome : ${sessionScope.user.username }</h2>
	<%
	List<CourseDTO> list = (List<CourseDTO>) request.getAttribute("course");
	%>
	<table border="1">
		<%
		for (CourseDTO dto : list) {
		%>
		<tr>
			<td><%=dto.getCourse_id()%></td>
			<td><%=dto.getSubject_id()%></td>
			<td><%=dto.getCourse_code()%></td>
			<td><%=dto.getTitle()%></td>
			<td><%=dto.getNumber_of_credits()%></td>
		</tr>
		<%
		}
		%>
	</table>
</body>
</html>