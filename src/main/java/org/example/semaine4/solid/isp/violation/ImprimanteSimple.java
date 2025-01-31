package org.example.semaine4.solid.isp.violation;

// Classe Imprimante Simple
public class ImprimanteSimple implements Imprimante {
    @Override
    public void imprimer(String document) {
        System.out.println("Impression du document : " + document);
    }

    @Override
    public void scanner(String document) {
        throw new UnsupportedOperationException("Cette imprimante ne supporte pas le scan.");
    }

    @Override
    public void envoyerFax(String document) {
        throw new UnsupportedOperationException("Cette imprimante ne supporte pas l'envoi de fax.");
    }
}
