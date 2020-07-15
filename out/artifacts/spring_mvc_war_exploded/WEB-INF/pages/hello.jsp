<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<body>
<c:forEach var="msq" items="${messages}">
    <h1>${msq}</h1>
</c:forEach>
<h2><a href="${pageContext.request.contextPath}/cars?locale=en">English</a></h2>
<h2><a href="${pageContext.request.contextPath}/cars?locale=ru">Русский</a></h2>
</body>
</html>