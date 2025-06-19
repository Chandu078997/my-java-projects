
/*
package com.weather.weather_forecast.model;


import java.util.List;

public class WeatherResponse {
    private Main main;
    private List<Weather> weather;
    private String name;

    // Getters & Setters

    public Main getMain() { return main; }
    public void setMain(Main main) { this.main = main; }

    public List<Weather> getWeather() { return weather; }
    public void setWeather(List<Weather> weather) { this.weather = weather; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public static class Main {
        private double temp;
        public double getTemp() { return temp; }
        public void setTemp(double temp) { this.temp = temp; }
    }

    public static class Weather {
        private String description;
        private String icon;

        public String getDescription() { return description; }
        public void setDescription(String description) { this.description = description; }

        public String getIcon() { return icon; }
        public void setIcon(String icon) { this.icon = icon; }
    }
}
*/

package com.weather.weather_forecast.model;

import java.util.List;
import java.util.Map;

public class WeatherResponse {
    private Main main;
    private List<Weather> weather;
    private Wind wind;
    private String name;

    public Main getMain() { return main; }
    public void setMain(Main main) { this.main = main; }

    public List<Weather> getWeather() { return weather; }
    public void setWeather(List<Weather> weather) { this.weather = weather; }

    public Wind getWind() { return wind; }
    public void setWind(Wind wind) { this.wind = wind; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public static class Main {
        private double temp;
        private double temp_min;
        private double temp_max;

        public double getTemp() { return temp; }
        public void setTemp(double temp) { this.temp = temp; }

        public double getTemp_min() { return temp_min; }
        public void setTemp_min(double temp_min) { this.temp_min = temp_min; }

        public double getTemp_max() { return temp_max; }
        public void setTemp_max(double temp_max) { this.temp_max = temp_max; }
    }

    public static class Weather {
        private String description;
        private String icon;

        public String getDescription() { return description; }
        public void setDescription(String description) { this.description = description; }

        public String getIcon() { return icon; }
        public void setIcon(String icon) { this.icon = icon; }
    }

    public static class Wind {
        private double speed;

        public double getSpeed() { return speed; }
        public void setSpeed(double speed) { this.speed = speed; }
    }
}


