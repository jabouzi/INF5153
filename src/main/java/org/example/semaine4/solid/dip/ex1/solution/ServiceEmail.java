package org.example.semaine4.solid.dip.ex1.solution;

// Module bas niveau 1
public class ServiceEmail implements Notificateur {
    @Override
    public void envoyer(String message) {
        System.out.println("E-mail envoye : " + message);
    }
}

