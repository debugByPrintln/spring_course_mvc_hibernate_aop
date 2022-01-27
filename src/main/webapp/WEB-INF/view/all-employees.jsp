<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 26.01.2022
  Time: 2:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style><%@include file="/WEB-INF/view/css/style.css"%></style>
</head>
<body>
    <h1>All Employees</h1>
    <br>
    <table>
        <tr>
            <th>Name</th>
            <th>Surname</th>
            <th>Department</th>
            <th>Salary</th>
            <th>Operations</th>
        </tr>

        <c:forEach var="tmp" items="${allEmployees}">
            <c:url var="updateButton" value="/updateInfo">
                <c:param name="empId" value="${tmp.id}"/>
            </c:url>
            <c:url var="deleteButton" value="/deleteEmployee">
                <c:param name="empId" value="${tmp.id}"/>
            </c:url>
            <tr>
                <td>${tmp.name}</td>
                <td>${tmp.surname}</td>
                <td>${tmp.department}</td>
                <td>${tmp.salary}</td>
                <td>
                    <input type="button" value="Update" onclick="window.location.href = '${updateButton}'"/>
                    <input type="button" value="Delete" onclick="window.location.href = '${deleteButton}'"/>
                </td>
            </tr>
        </c:forEach>
    </table>
    <br>
    <input type="button" value="add" onclick="window.location.href = 'addNewEmployee'"/>
</body>
</html>
