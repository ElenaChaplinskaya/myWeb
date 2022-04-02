<%@ page contentType="text/html; charset=UTF-8" isELIgnored= "false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<title>Start Page</title>
</head>
<body>
Мы такая-растакая туркомпания. Предлагаем широкий ассортимент туров! <br>
<form action="${pageContext.request.contextPath}/tours" method="post">
<input type="submit" name="button" value="Vacation" />
<input type="submit" name="button" value="Cruise" />
<input type="submit" name="button" value="Shopping"/>
<input type="submit" name="button" value="Therapy"/>
</form>
</body>
</html>
