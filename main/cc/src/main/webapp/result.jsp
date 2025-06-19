<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Conversion Result</title>
    <link rel="stylesheet" type="text/css" href="css/style.css">
    <style>
        body {
            font-family: Arial, sans-serif;
            background: linear-gradient(to right, #d3cce3, #e9e4f0);
            text-align: center;
            padding: 50px;
        }

        .result-box {
            background-color: #fff;
            border: 2px solid #4caf50;
            border-radius: 12px;
            padding: 30px;
            margin: auto;
            width: 400px;
            box-shadow: 0 0 15px rgba(0, 0, 0, 0.2);
        }

        .result-box h2 {
            color: #2e86de;
            margin-bottom: 20px;
        }

        .result-box p {
            font-size: 18px;
            color: #333;
            margin: 10px 0;
        }

        .convert-again a {
            display: inline-block;
            margin-top: 20px;
            text-decoration: none;
            padding: 10px 20px;
            background-color: #2e86de;
            color: white;
            border-radius: 6px;
            transition: background-color 0.3s ease;
        }

        .convert-again a:hover {
            background-color: #1b4f72;
        }
    </style>
</head>
<body>

<%
    String toCurrency = (String) request.getAttribute("toCurrency");
    String result = (String) request.getAttribute("result");
    String fromCurrency = request.getParameter("fromCurrency");

    java.util.Map<String, String> fullNames = new java.util.HashMap<>();
    fullNames.put("INR", "Indian (Rupee)");
    fullNames.put("USD", "United States Dollar");
    fullNames.put("EUR", "Euro");
    fullNames.put("JPY", "Japanese Yen");
    fullNames.put("GBP", "British Pound");
    fullNames.put("AUD", "Australian Dollar");
    fullNames.put("CAD", "Canadian Dollar");
    fullNames.put("CHF", "Swiss Franc");
    fullNames.put("CNY", "Chinese Yuan");
    fullNames.put("SGD", "Singapore Dollar");
    fullNames.put("NZD", "New Zealand Dollar");
    fullNames.put("KRW", "South Korean Won");
    fullNames.put("BRL", "Brazilian Real");
    fullNames.put("MXN", "Mexican Peso");
    fullNames.put("ZAR", "South African Rand");
    fullNames.put("SEK", "Swedish Krona");
    fullNames.put("NOK", "Norwegian Krone");
    fullNames.put("DKK", "Danish Krone");
    fullNames.put("HKD", "Hong Kong Dollar");
    fullNames.put("RUB", "Russian Ruble");

    String fullFrom = fullNames.getOrDefault(fromCurrency, fromCurrency);
    String fullTo = fullNames.getOrDefault(toCurrency, toCurrency);
%>

<div class="result-box">
    <h2>Currency Conversion Result</h2>
    <p>Converted from <strong><%= fullFrom %></strong> to <strong><%= fullTo %></strong></p>
    <p><strong>Converted Amount:</strong> <%= result %> <%= toCurrency %></p>
    
    <div class="convert-again">
        <a href="index.jsp">Convert Again</a>
    </div>
</div>

</body>
</html>
