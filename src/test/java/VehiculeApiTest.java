import org.example.semaine3.interfaces.*;
import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class VehiculeApiTest {

    @Test
    public void testObtenirListeVehiculesAvecFake() throws InterruptedException {
        // Utilise la classe Fake pour simuler l'API
        VehiculeApiFake apiFake = new VehiculeApiFake();

        VehiculeModel modeleVehicule = new VehiculeModel(apiFake);

        // Obtenir les véhicules
        List<Vehicule> vehicules = modeleVehicule.obtenirVehicules();

        // Vérifications
        assertEquals(3, vehicules.size(), "Le nombre de véhicules doit être 3.");

        // Vérifier les types et contenus des objets
        Vehicule voiture = vehicules.get(0);
        assertTrue(voiture instanceof Voiture, "Le premier véhicule doit être une voiture.");
        assertEquals("12345ABC", voiture.getNumeroSerie(), "Le numéro de série de la voiture doit être correct.");
        assertEquals(List.of("Jean Dupont"), voiture.getProprietaires(), "La liste des propriétaires de la voiture doit être correcte.");
        assertEquals(List.of("Accident mineur en 2020"), voiture.getHistoriqueAccidents(), "L'historique des accidents de la voiture doit être correct.");

        Vehicule camion = vehicules.get(1);
        assertTrue(camion instanceof Camion, "Le deuxième véhicule doit être un camion.");
        assertEquals("98765XYZ", camion.getNumeroSerie(), "Le numéro de série du camion doit être correct.");
        assertEquals(List.of("Société X"), camion.getProprietaires(), "La liste des propriétaires du camion doit être correcte.");
        assertEquals(List.of("Aucun accident"), camion.getHistoriqueAccidents(), "L'historique des accidents du camion doit être correct.");

        Vehicule moto = vehicules.get(2);
        assertTrue(moto instanceof Moto, "Le troisième véhicule doit être une moto.");
        assertEquals("45678LMN", moto.getNumeroSerie(), "Le numéro de série de la moto doit être correct.");
        assertEquals(List.of("Paul Martin"), moto.getProprietaires(), "La liste des propriétaires de la moto doit être correcte.");
        assertEquals(List.of("Accident grave en 2019"), moto.getHistoriqueAccidents(), "L'historique des accidents de la moto doit être correct.");
    }
}
