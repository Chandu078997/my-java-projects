/*
 package com.weather.weather_forecast.controller;


import com.weather.weather_forecast.model.WeatherResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

@Controller
public class WeatherController {

    @Value("${weather.api.key}")
    private String apiKey;

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/forecast")
    public String getWeather(@RequestParam("city") String city, Model model) {
        String url = "https://api.openweathermap.org/data/2.5/weather?q=" + city + "&appid=" + apiKey + "&units=metric";
        RestTemplate restTemplate = new RestTemplate();
        try {
            WeatherResponse response = restTemplate.getForObject(url, WeatherResponse.class);
            model.addAttribute("weather", response);
            
            return "weather"; // returns weather.jsp
        } catch (HttpClientErrorException e) {
            model.addAttribute("error","Entered name is not in the cities category.");
            return "index";
        }
    }
}*/
package com.weather.weather_forecast.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import com.weather.weather_forecast.model.ForecastResponse;
import com.weather.weather_forecast.model.WeatherResponse;

@Controller
public class WeatherController {

    @Value("${weather.api.key}")
    private String apiKey;

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/forecast")
    public String getWeather(@RequestParam("city") String city, Model model) {
        RestTemplate restTemplate = new RestTemplate();

        String currentWeatherUrl = "https://api.openweathermap.org/data/2.5/weather?q=" + city + "&appid=" + apiKey + "&units=metric";
        String forecastUrl = "https://api.openweathermap.org/data/2.5/forecast?q=" + city + "&appid=" + apiKey + "&units=metric";

        try {
            WeatherResponse currentWeather = restTemplate.getForObject(currentWeatherUrl,WeatherResponse.class);
            ForecastResponse forecast = restTemplate.getForObject(forecastUrl, ForecastResponse.class);

            model.addAttribute("weather", currentWeather);
            model.addAttribute("forecast", forecast);

            return "weather";
        } catch (HttpClientErrorException e) {
            model.addAttribute("error", "City not found or API error.");
            return "index";
        }
    }
}
