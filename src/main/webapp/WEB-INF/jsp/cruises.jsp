<%@ page contentType="text/html; charset=UTF-8" isELIgnored= "false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<title>Cruises</title>
</head>
<body>
    <c:forEach var="cruise" items="${cruise}" >
        <li>
            <c:out value="${cruise}" />
        </li>
  </c:forEach>
  <form action="${pageContext.request.contextPath}/sortCruise" method="post">
        <p> Отсортируй туры по виду транспорта: </p> <br>
            <input type="submit" name="button" value="Sorting" />
    </form>
</body>
</html>
