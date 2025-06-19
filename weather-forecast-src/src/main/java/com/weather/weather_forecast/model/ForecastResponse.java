/*
package com.weather.weather_forecast.model;

import java.util.List;

public class ForecastResponse {
    private City city;
    private List<ForecastItem> list;

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public List<ForecastItem> getList() {
        return list;
    }

    public void setList(List<ForecastItem> list) {
        this.list = list;
    }

    public static class City {
        private String name;
        public String getName() { return name; }
        public void setName(String name) { this.name = name; }
    }

    public static class ForecastItem {
        private Main main;
        private List<Weather> weather;
        private String dt_txt;

        public Main getMain() { return main; }
        public void setMain(Main main) { this.main = main; }

        public List<Weather> getWeather() { return weather; }
        public void setWeather(List<Weather> weather) { this.weather = weather; }

        public String getDt_txt() { return dt_txt; }
        public void setDt_txt(String dt_txt) { this.dt_txt = dt_txt; }
    }

    public static class Main {
        private double temp;
        public double getTemp() { return temp; }
        public void setTemp(double temp) { this.temp = temp; }
    }

    public static class Weather {
        private String description;
        public String getDescription() { return description; }
        public void setDescription(String description) { this.description = description; }
    }
}*/
package com.weather.weather_forecast.model;

import java.util.List;

public class ForecastResponse {
    private List<Forecast> list;

    public List<Forecast> getList() {
        return list;
    }

    public void setList(List<Forecast> list) {
        this.list = list;
    }

    public static class Forecast {
        private String dt_txt;
        private Main main;
        private List<Weather> weather;

        public String getDt_txt() { return dt_txt; }
        public void setDt_txt(String dt_txt) { this.dt_txt = dt_txt; }

        public Main getMain() { return main; }
        public void setMain(Main main) { this.main = main; }

        public List<Weather> getWeather() { return weather; }
        public void setWeather(List<Weather> weather) { this.weather = weather; }

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
}

