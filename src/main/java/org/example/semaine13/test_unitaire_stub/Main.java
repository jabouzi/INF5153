package org.example.semaine13.test_unitaire_stub;

public class Main {
    public static void main(String[] args) {
        // Dans un environnement réel, vous utiliseriez un vrai service météo
        WeatherService realWeatherService = new ActualWeatherService();
        TripAdvisor tripAdvisor = new TripAdvisor(realWeatherService);

        // Obtenir des suggestions pour différentes villes
        String[] cities = {"Montréal", "Vancouver", "Toronto", "Calgary", "Québec"};

        System.out.println("=== CONSEILS DE VOYAGE SELON LA MÉTÉO ===\n");

        for (String city : cities) {
            System.out.println("Vérification de la météo à " + city + "...");
            String suggestion = tripAdvisor.suggestActivity(city);
            System.out.println("Pour " + city + ", nous vous suggérons: " + suggestion);
            System.out.println("-------------------------------------------");
        }
    }

}
