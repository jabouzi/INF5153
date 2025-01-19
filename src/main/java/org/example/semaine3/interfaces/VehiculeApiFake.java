package org.example.semaine3.interfaces;

import java.util.Arrays;
import java.util.List;

public class VehiculeApiFake implements VehiculeApiInterface {

    @Override
    public List<Vehicule> obtenirListeVehicules() {
        // Retourne une liste de deux voitures pour le test
        return Arrays.asList(
                new Voiture("789GHI", Arrays.asList("Fake User 1"), Arrays.asList("Accident mineur")),
                new Camion("012JKL", Arrays.asList("Fake User 2"), Arrays.asList("Aucun accident"))
        );
    }
}
