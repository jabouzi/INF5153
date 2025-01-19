package org.example.semaine3.interfaces;

import java.util.List;

public interface VehiculeApiInterface {
    List<Vehicule> obtenirListeVehicules() throws InterruptedException;
}
