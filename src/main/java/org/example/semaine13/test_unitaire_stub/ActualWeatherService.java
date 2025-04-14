package org.example.semaine13.test_unitaire_stub;

import java.util.Random;

// Implémentation réelle qui serait utilisée en production
class ActualWeatherService implements WeatherService {
    // Normalement, ceci appellerait une API météo externe
    private final Random random = new Random();

    @Override
    public double getCurrentTemperature(String city) {
        System.out.print("Connexion au service météo");

        // Simuler un délai de connexion à l'API
        try {
            for (int i = 0; i < 5; i++) {
                Thread.sleep(400);
                System.out.print(".");
            }
        } catch (InterruptedException e) {
            System.out.println("\nLa connexion a été interrompue");
            return 15.0; // Valeur par défaut en cas d'erreur
        }

        // Simuler des températures différentes selon la ville
        double baseTemp;

        switch (city.toLowerCase()) {
            case "montréal":
                baseTemp = 22.0; // Plus chaud en été
                break;
            case "vancouver":
                baseTemp = 18.0; // Plus tempéré
                break;
            case "calgary":
                baseTemp = 5.0;  // Plus froid
                break;
            case "québec":
                baseTemp = 15.0; // Température moyenne
                break;
            case "toronto":
                baseTemp = 24.0; // Plus chaud
                break;
            default:
                baseTemp = 20.0; // Valeur par défaut
        }

        // Ajouter un peu de variation aléatoire (-3 à +3 degrés)
        double variation = (random.nextDouble() * 6) - 3;
        double finalTemp = baseTemp + variation;

        System.out.printf("\nTempérature actuelle à %s: %.1f°C\n", city, finalTemp);

        return finalTemp;
    }
}
