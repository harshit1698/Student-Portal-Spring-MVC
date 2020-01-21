<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.SQLException" %>
<%--<%@ page import="hp.Std" %>--%>
<%@ page import="db.Std" %><%--
  Created by IntelliJ IDEA.
  User: Harshit Trivedi
  Date: 1/20/2020
  Time: 4:07 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" isELIgnored="false" language="java" %>
<html>
<head>
    <title>Dashboard</title>
</head>
<body>

<h2>Student Dashboard</h2>

<table border="1">

    <th>
        ID
    </th>
    <th>
        Name
    </th>
    <th>
        Edit
    </th>
    <th>
        Delete
    </th>
    <c:forEach var="item" items="${obj}">
        <tr>

        <td>
             ${item.id}
        </td>
        <td>
             ${item.name}
        </td>
        <td>
            <a href="/db/edit?id=${item.id}&name=${item.name}">Edit</a>
        </td>
            <td>
                <a href="/db/del?id=${item.id}">Delete</a>
            </td>

        </tr>
    </c:forEach>

</table>


    </body>
</html>
