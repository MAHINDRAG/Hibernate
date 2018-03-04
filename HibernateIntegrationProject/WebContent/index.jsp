<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome to Reg.page</h1>
<form action="insert" method="post">
<pre>
Id :<input type="text" name="empId" id="empId"><span id="empIdError"></span>
Name :<input type="text" name="empName"/>
Salary :<input type="text" name="empSal"/>
<input type="submit" value="insert"/> 
</pre>
</form>
</body>
</html>