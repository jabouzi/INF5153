package org.example.semaine4.solid.isp.violation;

// Classe Imprimante Multifonction
public class ImprimanteMultifonction implements Imprimante {
    @Override
    public void imprimer(String document) {
        System.out.println("Impression du document : " + document);
    }

    @Override
    public void scanner(String document) {
        System.out.println("Scan du document : " + document);
    }

    @Override
    public void envoyerFax(String document) {
        System.out.println("Envoi du fax avec le document : " + document);
    }
}
