package org.example.semaine13.test_unitaire_stub;

// Classe stub interne
class StubWeatherService implements WeatherService {
    private final double fixedTemperature;

    public StubWeatherService(double fixedTemperature) {
        this.fixedTemperature = fixedTemperature;
    }

    @Override
    public double getCurrentTemperature(String city) {
        return fixedTemperature; // Retourne toujours la même température, peu importe la ville
    }
}
