<%@ page contentType="text/html; charset=UTF-8" isELIgnored= "false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<title>Therapy</title>
</head>
<body>
    <c:forEach var="therapy" items="${therapy}" >
        <li>
            <c:out value="${therapy}" />
        </li>
    </c:forEach>
    <form action="${pageContext.request.contextPath}/sortTherapy" method="post">
        <p> Отсортируй туры по виду транспорта: </p> <br>
            <input type="submit" name="button" value="Sorting" />
    </form>
</body>
</html>