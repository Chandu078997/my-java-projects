<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Currency Converter</title>
    <link rel="stylesheet" type="text/css" href="css/style.css">

</head>
<body>
    <h2>Currency Converter</h2>
    <form action="convert" method="post">
        Amount: <input type="number" name="amount" step="0.01" required><br><br>

        From:
        <select name="fromCurrency">
            <option value="INR">India - INR</option>
            <option value="USD">United States - USD</option>
            <option value="EUR">European Union - EUR</option>
            <option value="GBP">United Kingdom - GBP</option>
            <option value="JPY">Japan - JPY</option>
            <option value="AUD">Australia - AUD</option>
            <option value="CAD">Canada - CAD</option>
            <option value="CHF">Switzerland - CHF</option>
            <option value="CNY">China - CNY</option>
            <option value="SGD">Singapore - SGD</option>
            <option value="NZD">New Zealand - NZD</option>
            <option value="SEK">Sweden - SEK</option>
            <option value="NOK">Norway - NOK</option>
            <option value="MXN">Mexico - MXN</option>
            <option value="BRL">Brazil - BRL</option>
            <option value="ZAR">South Africa - ZAR</option>
            <option value="KRW">South Korea - KRW</option>
            <option value="RUB">Russia - RUB</option>
            <option value="HKD">Hong Kong - HKD</option>
            <option value="AED">United Arab Emirates - AED</option>
        </select><br><br>

        To:
        <select name="toCurrency">
            <option value="INR">India - INR</option>
            <option value="USD">United States - USD</option>
            <option value="EUR">European Union - EUR</option>
            <option value="GBP">United Kingdom - GBP</option>
            <option value="JPY">Japan - JPY</option>
            <option value="AUD">Australia - AUD</option>
            <option value="CAD">Canada - CAD</option>
            <option value="CHF">Switzerland - CHF</option>
            <option value="CNY">China - CNY</option>
            <option value="SGD">Singapore - SGD</option>
            <option value="NZD">New Zealand - NZD</option>
            <option value="SEK">Sweden - SEK</option>
            <option value="NOK">Norway - NOK</option>
            <option value="MXN">Mexico - MXN</option>
            <option value="BRL">Brazil - BRL</option>
            <option value="ZAR">South Africa - ZAR</option>
            <option value="KRW">South Korea - KRW</option>
            <option value="RUB">Russia - RUB</option>
            <option value="HKD">Hong Kong - HKD</option>
            <option value="AED">United Arab Emirates - AED</option>
        </select><br><br>

        <input type="submit" value="Convert">
    </form>
</body>
</html>
