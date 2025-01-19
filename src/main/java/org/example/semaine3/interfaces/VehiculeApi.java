package org.example.semaine3.interfaces;

import java.util.Arrays;
import java.util.List;

public class VehiculeApi implements VehiculeApiInterface {

    @Override
    public List<Vehicule> obtenirListeVehicules() throws InterruptedException {
        // Simule un délai réseau de 3 secondes
        Thread.sleep(3000);

        // Retourne une liste de véhicules (deux voitures dans ce cas)
        return Arrays.asList(
                new Voiture("123ABC", Arrays.asList("Jean Dupont"), Arrays.asList("Accident mineur en 2020")),
                new Camion("456DEF", Arrays.asList("Marie Curie"), Arrays.asList("Aucun accident"))
        );
    }
}
