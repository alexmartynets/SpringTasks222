<%--
  Created by IntelliJ IDEA.
  User: Love
  Date: 16.03.2020
  Time: 23:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="locale" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title><locale:message code="car.title"/></title>
</head>
<body>
<h1><locale:message code="car.header"/></h1>
<table>
    <tr>
        <th><locale:message code="car.model"/></th>
        <th><locale:message code="car.series"/></th>
        <th><locale:message code="car.owner"/></th>
    </tr>
<c:forEach var="car" items="${carsFromList}">
    <tr>
        <td>${car.model}</td>
        <td>${car.series}</td>
        <td>${car.owner}</td>
    </tr>
</c:forEach>
</table>
<h2><a href="${pageContext.request.contextPath}/cars?locale=en">English</a></h2>
<h2><a href="${pageContext.request.contextPath}/cars?locale=ru">Русский</a></h2>
</body>
</html>
