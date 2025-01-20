package org.example.semaine3.interfaces;

import java.util.Arrays;
import java.util.List;

public class VehiculeApi implements VehiculeApiInterface {

    @Override
    public String[]  obtenirListeVehicules() throws InterruptedException {
        // Simule un délai réseau de 3 secondes
        Thread.sleep(3000);

        // Retourne une liste de véhicules (deux voitures dans ce cas)
        return new String[]{
                "VOITURE;1;1234ABC;Proprietaire1,Proprietaire2;Accident1,Accident2",
                "CAMION;2;5678DEF;Proprietaire3;Accident3",
                "MOTO;3;9876GHI;Proprietaire4,Proprietaire5;"
        };
    }
}
