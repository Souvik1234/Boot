<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ page import="java.util.List" %>
  <%@ page import="com.example.demo.Dept" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Testing...</h1>

<%

List<Dept> l =(List<Dept>) request.getAttribute("data");
if(l!=null){
	for(Dept d: l){
		out.println(d.getDeptno()+"-->"+d.getDname()+"-->"+d.getLoc()+" ");
	}
}
else{
%>
<%out.print("");} %>

</body>
</html>