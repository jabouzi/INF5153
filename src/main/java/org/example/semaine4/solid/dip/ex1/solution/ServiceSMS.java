package org.example.semaine4.solid.dip.ex1.solution;

// Module bas niveau 2
public class ServiceSMS implements Notificateur {
    @Override
    public void envoyer(String message) {
        System.out.println("SMS envoye : " + message);
    }
}
