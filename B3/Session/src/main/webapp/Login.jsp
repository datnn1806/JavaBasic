<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="login" method= "POST">
<input type="text" name="username"/>
<br />
<input type="text" name="password"/>
<button type="submit"> Login</button>
</form>
<p>${error}</p>
</body>
</html>