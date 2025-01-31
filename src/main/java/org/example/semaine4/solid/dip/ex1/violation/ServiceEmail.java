package org.example.semaine4.solid.dip.ex1.violation;

// Module bas niveau
public class ServiceEmail {
    public void envoyerEmail(String message) {
        System.out.println("E-mail envoye : " + message);
    }
}

