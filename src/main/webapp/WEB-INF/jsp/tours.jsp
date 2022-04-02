<%@ page contentType="text/html; charset=UTF-8" isELIgnored= "false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<title>Vacations</title>
</head>
<body>
    <c:forEach var="vacation" items="${vacation}" >
        <li>
            <c:out value="${vacation}" />
        </li>
    </c:forEach>
    <form action="${pageContext.request.contextPath}/sortVac" method="post">
        <p> Отсортируй туры по виду транспорта: </p> <br>
            <input type="submit" name="button" value="Sorting" />
    </form>
</body>
</html>
