
<!--  
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head><title>Weather Result</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">
</head>
<body>
    <div class="container">
        <h2>Weather in ${weather.name}</h2>
        <p>Temperature: ${weather.main.temp} °C</p>
        <p>Condition: ${weather.weather[0].description}</p>
        <a href="/">Check another city</a>
    </div>
</body>
</html>


-->
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Weather Forecast</title>
    <link rel="stylesheet" href="<c:url value='/css/style.css'/>">
</head>
<body>
    <h2>Current Weather in ${weather.name}</h2>
    <p>Temperature: ${weather.main.temp}°C</p>
    <p>Description: ${weather.weather[0].description}</p>
    <p>Wind Speed: ${weather.wind.speed} m/s</p>

    <h3>5-Day Forecast (Every 3 Hours)</h3>
    <table border="1">
        <tr>
            <th>Date & Time</th>
            <th>Temp (°C)</th>
            <th>Description</th>
        </tr>
        <c:forEach var="entry" items="${forecast.list}">
            <tr>
                <td>${entry.dt_txt}</td>
                <td>${entry.main.temp}</td>
                <td>${entry.weather[0].description}</td>
            </tr>
        </c:forEach>
    </table>

    <br><a href="<c:url value='/'/>">Search Again</a>
</body>
</html>
