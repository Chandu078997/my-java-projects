<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Weather App</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css" />
</head>
<body>
<div class="container">
    <h1>Weather Forecast</h1>
    <form action="/forecast" method="get">
        <input type="text" name="city" placeholder="Enter city (e.g., Delhi)" required />
        <button type="submit">Get Weather</button>
    </form>
    <c:if test="${not empty error}">
        <p style="color: red;">${error}</p>
    </c:if>
</div>
</body>
</html>
