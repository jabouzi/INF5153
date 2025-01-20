package org.example.semaine3.interfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VehiculeModel {
    private VehiculeApiInterface api;

    public VehiculeModel(VehiculeApiInterface api) {
        this.api = api;
    }

    public List<Vehicule> obtenirVehicules() throws InterruptedException {
        List<Vehicule> vehicules = new ArrayList<>();
        String[] lignes = api.obtenirListeVehicules();

        for (String ligne : lignes) {
            String[] parties = ligne.split(";");
            TypeVehicule type = TypeVehicule.valueOf(parties[0]);
            String id = parties[1];
            String numeroSerie = parties[2];
            List<String> proprietaires = Arrays.asList(parties[3].split(","));
            List<String> historiqueAccidents = parties[4].isEmpty() ? new ArrayList<>() : Arrays.asList(parties[4].split(","));

            switch (type) {
                case VOITURE:
                    vehicules.add(new Voiture(id, numeroSerie, proprietaires, historiqueAccidents));
                    break;
                case CAMION:
                    vehicules.add(new Camion(id, numeroSerie, proprietaires, historiqueAccidents));
                    break;
                case MOTO:
                    vehicules.add(new Moto(id, numeroSerie, proprietaires, historiqueAccidents));
                    break;
            }
        }

        return vehicules;
    }
}
