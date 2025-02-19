package org.example.semaine7.stratery.example2;

// Utilisation
public class StrategyExample {
    public static void main(String[] args) {
        ContexteTransport contexte = new ContexteTransport();
        contexte.setStrategie(new TransportAvion());
        contexte.executerTransport(); // Transport par avion

        contexte.setStrategie(new TransportCamion());
        contexte.executerTransport(); // Transport par camion
    }
}
