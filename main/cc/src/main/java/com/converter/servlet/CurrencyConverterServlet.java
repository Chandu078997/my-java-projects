package com.converter.servlet;

import java.io.*;
import java.sql.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.util.HashMap;

public class CurrencyConverterServlet extends HttpServlet {
    private static final HashMap<String, Double> rates = new HashMap<>();
    private static final HashMap<String, String> countryNames = new HashMap<>();

    public void init() {
        rates.put("IR", 1.0);     countryNames.put("INR", "Indian(Rupee)");
        rates.put("USD", 0.012);   countryNames.put("USD", "United States(Dollar)");
        rates.put("EUR", 0.011);   countryNames.put("EUR", "European Union(Euro)");
        rates.put("GBP", 0.0095);  countryNames.put("GBP", "United Kingdom(British Pound)");
        rates.put("JPY", 1.74);    countryNames.put("JPY", "Japan (Japanese Yen)");
        rates.put("AUD", 0.018);   countryNames.put("AUD", "Australia(Australian Dollar)");
        rates.put("CAD", 0.016);   countryNames.put("CAD", "Canada(Canadian Dollar)");
        rates.put("CHF", 0.011);   countryNames.put("CHF", "Switzerland(Swiss Franc)");
        rates.put("CNY", 0.085);   countryNames.put("CNY", "China(Chinese Yuan)");
        rates.put("SGD", 0.016);   countryNames.put("SGD", "Singapore(Singapore Dollar)");
        rates.put("NZD", 0.019);   countryNames.put("NZD", "New Zealand(New Zealand Dollar)");
        rates.put("SEK", 0.13);    countryNames.put("SEK", "Sweden(Swedish Krona)");
        rates.put("NOK", 0.13);    countryNames.put("NOK", "Norway(Norwegian Krone)");
        rates.put("MXN", 0.22);    countryNames.put("MXN", "Mexico(Mexican Peso)");
        rates.put("BRL", 0.065);   countryNames.put("BRL", "Brazil(Brazilian Real)");
        rates.put("ZAR", 0.22);    countryNames.put("ZAR", "South Africa(South African Rand)");
        rates.put("KRW", 15.5);    countryNames.put("KRW", "South Korea(South Korean Won)");
        rates.put("RUB", 1.1);     countryNames.put("RUB", "Russia(Russian Ruble)");
        rates.put("HKD", 0.095);   countryNames.put("HKD", "Hong Kong(Hong Kong Dollar)");
        rates.put("AED", 0.044);   countryNames.put("AED", "United Arab Emirates(Dirham)");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        double amount = Double.parseDouble(request.getParameter("amount"));
        String from = request.getParameter("fromCurrency");
        String to = request.getParameter("toCurrency");

        double rateFrom = rates.getOrDefault(from, 1.0);
        double rateTo = rates.getOrDefault(to, 1.0);
        double result = (amount / rateFrom) * rateTo;

        // Store result in DB
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/currencydb?useSSL=false&allowPublicKeyRetrieval=true", 
                "root", 
                "Chandana200055@"
            );

            String query = "INSERT INTO conversion_history (amount, from_currency, to_currency, converted_amount) VALUES (?, ?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setDouble(1, amount);
            stmt.setString(2, from);
            stmt.setString(3, to);
            stmt.setDouble(4, result);

            stmt.executeUpdate();

            stmt.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        request.setAttribute("result", String.format("%.2f", result));
        request.setAttribute("toCurrency", to);
        request.setAttribute("toCountryName", countryNames.get(to));
        request.setAttribute("fromCountryName", countryNames.get(from));

        RequestDispatcher rd = request.getRequestDispatcher("result.jsp");
        rd.forward(request, response);
    }
}
