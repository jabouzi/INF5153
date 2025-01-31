package org.example.semaine4.solid.isp.solution;

// Classe Imprimante Simple
public class ImprimanteSimple implements Imprimante {
    @Override
    public void imprimer(String document) {
        System.out.println("Impression du document : " + document);
    }
}
