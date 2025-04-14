package org.example.semaine13.test_unitaire_stub;

public class TripAdvisor {
    private WeatherService weatherService;

    public TripAdvisor(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    public String suggestActivity(String city) {
        double temperature = weatherService.getCurrentTemperature(city);

        if (temperature > 25.0) {
            return "Aller à la plage";
        } else if (temperature > 10.0) {
            return "Visiter les musées";
        } else {
            return "Rester à l'hôtel au chaud";
        }
    }
}
