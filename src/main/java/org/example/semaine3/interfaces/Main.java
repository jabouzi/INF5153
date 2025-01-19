package org.example.semaine3.interfaces;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        SAAQ saaq = new SAAQ();

        Vehicule voiture = new Voiture("12345ABC", Arrays.asList("Jean Dupont"), Arrays.asList("Accident mineur en 2020"));
        Vehicule camion = new Camion("98765XYZ", Arrays.asList("Société X"), Arrays.asList("Aucun accident"));

        saaq.enregistrerVehicule(voiture);
        saaq.enregistrerVehicule(camion);

        System.out.println("Véhicules enregistrés : " + saaq.getVehiculesEnregistres().size());
    }
}
