<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="bean" uri="http://struts.apache.org/tags-bean"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>this is working</h1>
<br/>
  old Value is : ${oldvalue}
  <br/> 
  first value is : ${first}
  <br/>
  Message:: <bean:write name="firstform"  property="message"/>
  <br/>
  <a href="simpleform.do">This is the LINK!!!</a>
</body>
</html>