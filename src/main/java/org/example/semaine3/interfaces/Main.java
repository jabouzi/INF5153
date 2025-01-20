package org.example.semaine3.interfaces;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        SAAQ saaq = new SAAQ();

        Vehicule voiture = new Voiture("12345ABC", "ABC123", Arrays.asList("Jean Dupont"), Arrays.asList("Accident mineur en 2020"));
        Vehicule camion = new Camion("98765XYZ", "XYZ987", Arrays.asList("Société X"), Arrays.asList("Aucun accident"));
        Vehicule moto = new Moto("56789DEF", "DEF567", Arrays.asList("Alice"), Arrays.asList("Chute en 2021"));

        saaq.enregistrerVehicule(voiture);
        saaq.enregistrerVehicule(camion);
        saaq.enregistrerVehicule(moto);

        // Afficher le nombre de véhicules enregistrés
        System.out.println("Véhicules enregistrés : " + saaq.getVehiculesEnregistres().size());

        // Afficher les détails des véhicules enregistrés
        for (Vehicule vehicule : saaq.getVehiculesEnregistres()) {
            System.out.println(vehicule);
        }
    }
}
