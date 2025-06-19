<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>5-Day Forecast</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">
</head>
<body>
<div class="container">
    <h2>5-Day Forecast for ${forecast.city.name}</h2>

    <table border="1">
        <tr>
            <th>Date & Time</th>
            <th>Temperature (°C)</th>
            <th>Condition</th>
        </tr>
        <c:forEach var="item" items="${forecast.list}">
            <tr>
                <td>${item.dt_txt}</td>
                <td>${item.main.temp}</td>
                <td>${item.weather[0].description}</td>
            </tr>
        </c:forEach>
    </table>

    <br><a href="${pageContext.request.contextPath}/">Search another city</a>
</div>
</body>
</html>
