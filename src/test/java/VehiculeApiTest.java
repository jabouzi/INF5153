import org.example.semaine3.interfaces.Vehicule;
import org.example.semaine3.interfaces.VehiculeApiFake;
import org.example.semaine3.interfaces.VehiculeApiInterface;
import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VehiculeApiTest {

    @Test
    public void testObtenirListeVehiculesAvecFake() throws InterruptedException {
        // Utilise la classe Fake pour simuler l'API
        VehiculeApiInterface apiFake = new VehiculeApiFake();

        // Appel à la méthode
        List<Vehicule> vehicules = apiFake.obtenirListeVehicules();

        // Vérifie que la liste contient les bons résultats
        assertEquals(2, vehicules.size());
        assertEquals("789GHI", vehicules.get(0).getNumeroSerie());
        assertEquals("012JKL", vehicules.get(1).getNumeroSerie());
    }
}
