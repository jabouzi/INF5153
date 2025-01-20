package org.example.semaine3.interfaces;

import java.util.Arrays;
import java.util.List;

public class VehiculeApiFake implements VehiculeApiInterface {

    @Override
    public String[] obtenirListeVehicules() {
        // Retourne une liste de deux voitures pour le test
        return new String[]{
                "VOITURE;1;12345ABC;Jean Dupont;Accident mineur en 2020",
                "CAMION;2;98765XYZ;Société X;Aucun accident",
                "MOTO;3;45678LMN;Paul Martin;Accident grave en 2019"
        };
    }
}
