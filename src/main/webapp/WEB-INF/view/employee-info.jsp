<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 27.01.2022
  Time: 1:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>Type employee info:</h1>
    <br>
    <form:form action="addEmployee" modelAttribute="employee">
        <form:hidden path="id"/>
        Name <form:input path="name"/>
        <br>
        Surname <form:input path="surname"/>
        <br>
        Department <form:input path="department"/>
        <br>
        Salary <form:input path="salary"/>
        <br>
        <input type="submit" value="Add">
    </form:form>
</body>
</html>
