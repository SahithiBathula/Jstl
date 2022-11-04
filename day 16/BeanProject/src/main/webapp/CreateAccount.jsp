<%@page import="com.infinite.BankProject.BankDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method="get" action="Bank.jsp">
<center>
Account No:
    <input type="text" name="accountNo" /> <br/><br/>
    First Name:
    
        <input type="text" name="firstName" /> <br/><br/>
    
    Last Name:
     <input type="text" name="lastName" /> <br/><br/>
    City:
    <select name="city">
       <option value="Vijayawada">Vijayawada</option>
       <option value="Guntur">Guntur</option>
       <option value="Kakinada">Kakinada</option>
       <option value="Vizag">Vizag</option>
       
    </select> <br/><br/>
    State:
     <select name="state">
       <option value="Karnataka">Karnataka</option>
       <option value="Hyderabad">Hyderabad</option>
       <option value="Andhra">Andhra</option>
       <option value="Dubai">Dubai</option>
       
    </select> <br/><br/>
     Amount:
      <input type="name" name="amount" /> <br/><br/>
      CheqFacil:
       <input type="text" name="cheqfacil" /> <br/><br/>
       Account Type:
        <input type="text" name="accountType" /> <br/><br/>
    <input type="submit" value="Add Employ" />
</center>
</form>
 <%
		if (request.getParameter("basic")!=null) {
			BankDAO dao = new BankDAO();
	%>
		<jsp:useBean id="beanBank" class="com.infinite.BankProject.Bank" scope="page" />
		<jsp:setProperty property="*" name="beanBank"/>
	<%=dao.createAccount(beanBank) %>
	<%
		}
	%>

</body>
</html>