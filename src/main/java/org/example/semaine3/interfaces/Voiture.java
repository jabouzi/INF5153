package org.example.semaine3.interfaces;

import java.util.List;

public class Voiture implements Vehicule {
    private final String id;
    private final String numeroSerie;
    private final List<String> proprietaires;
    private final List<String> historiqueAccidents;

    // Des membres en extra

    public Voiture(String id, String numeroSerie, List<String> proprietaires, List<String> historiqueAccidents) {
        this.id = id;
        this.numeroSerie = numeroSerie;
        this.proprietaires = proprietaires;
        this.historiqueAccidents = historiqueAccidents;
    }

    @Override
    public String getId() { return id; }

    @Override
    public String getType() {
        return TypeVehicule.VOITURE.name();
    }

    @Override
    public String getNumeroSerie() {
        return numeroSerie;
    }

    @Override
    public List<String> getProprietaires() {
        return proprietaires;
    }

    @Override
    public List<String> getHistoriqueAccidents() {
        return historiqueAccidents;
    }
}
