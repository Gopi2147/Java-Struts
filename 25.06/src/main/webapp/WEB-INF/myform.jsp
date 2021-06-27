<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<html:form action="/simpleform">
<table>
<tr>
<th>empID</th>
<td><html:text property="empID"/></td>
</tr>
<tr>
<th>name</th>
<td><html:text property="name"/></td>
</tr>
<tr>
<th>city</th>
<td><html:text property="city"/></td>
</tr>
<tr>
<th>designation</th>
<td><html:text property="designation"/></td>
</tr>
<tr>
      <td> <html:submit property="method" value="store"></html:submit> </td>
</table>
</html:form>
</body>
</html>