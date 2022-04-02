<%@ page contentType="text/html; charset=UTF-8" isELIgnored= "false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<title>Shopping</title>
</head>
<body>
    <c:forEach var="shopping" items="${shopping}" >
        <li>
            <c:out value="${shopping}" />
        </li>
    </c:forEach>
    <form action="${pageContext.request.contextPath}/sortShop" method="post">
        <p> Отсортируй туры по виду транспорта: </p> <br>
            <input type="submit" name="button" value="Sorting" />
    </form>
</body>
</html>