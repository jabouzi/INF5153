package org.example.semaine3.interfaces;

import java.util.List;

public interface Vehicule {
    String getType(); // Type de véhicule
    String getNumeroSerie(); // Numéro de série
    List<String> getProprietaires(); // Liste des propriétaires
    List<String> getHistoriqueAccidents(); // Historique des accidents
}
