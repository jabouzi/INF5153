package org.example.semaine13.test_unitaire_stub;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TripAdvisorTest {

    @Test
    void testSuggestActivityForHotWeather() {
        // Création d'un stub pour la température chaude
        WeatherService stubHotWeather = new StubWeatherService(30.0);
        TripAdvisor tripAdvisor = new TripAdvisor(stubHotWeather);

        String suggestion = tripAdvisor.suggestActivity("Montréal");

        assertEquals("Aller à la plage", suggestion, "Pour une température chaude, devrait suggérer la plage");
    }

    @Test
    void testSuggestActivityForMildWeather() {
        // Création d'un stub pour la température modérée
        WeatherService stubMildWeather = new StubWeatherService(15.0);
        TripAdvisor tripAdvisor = new TripAdvisor(stubMildWeather);

        String suggestion = tripAdvisor.suggestActivity("Montréal");

        assertEquals("Visiter les musées", suggestion, "Pour une température modérée, devrait suggérer les musées");
    }

    @Test
    void testSuggestActivityForColdWeather() {
        // Création d'un stub pour la température froide
        WeatherService stubColdWeather = new StubWeatherService(5.0);
        TripAdvisor tripAdvisor = new TripAdvisor(stubColdWeather);

        String suggestion = tripAdvisor.suggestActivity("Montréal");

        assertEquals("Rester à l'hôtel au chaud", suggestion, "Pour une température froide, devrait suggérer de rester à l'hôtel");
    }

}