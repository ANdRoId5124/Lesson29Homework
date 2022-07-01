<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 01.07.2022
  Time: 18:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>MyPage</title>
</head>
<body>
<ul>
    <core:forEach var="list1" items="${listOfGoods}">
        <li>${list1}</li>
    </core:forEach>
</ul>
</body>
</html>
