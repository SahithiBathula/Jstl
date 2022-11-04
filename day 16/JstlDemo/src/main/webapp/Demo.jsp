 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <c:set var="firstname" value="${param['firstname']}" />
 <c:set var="lastname" value="${param['lastname']}" />
 First Name:
 <b>
   <c:out value="${firstname}" />
   
 </b><br/><br/>
 Last Name:
 <b>
 <c:out value="${lastname}" />
 </b><br/><br/>
</body>
</html>