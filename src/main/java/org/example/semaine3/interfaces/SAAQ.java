package org.example.semaine3.interfaces;

import java.util.ArrayList;
import java.util.List;

// Un bon exmple est une librairie externe

public class SAAQ {
    private final List<Vehicule> vehiculesEnregistres = new ArrayList<>();

    public void enregistrerVehicule(Vehicule vehicule) {
        vehiculesEnregistres.add(vehicule);
        System.out.println("Véhicule enregistré : " + vehicule.getNumeroSerie() + " de type " + vehicule.getType());
    }

    public List<Vehicule> getVehiculesEnregistres() {
        return vehiculesEnregistres;
    }
}
