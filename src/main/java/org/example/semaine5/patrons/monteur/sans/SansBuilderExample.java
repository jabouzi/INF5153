package org.example.semaine5.patrons.monteur.sans;

// Classe principale pour tester sans le patron Builder
public class SansBuilderExample {
    public static void main(String[] args) {
        // Construction d'une maison basique
        Maison maisonBasique = new Maison();
        maisonBasique.setMurs("Murs en brique");
        maisonBasique.setSol("Sol en carrelage");
        maisonBasique.setPorte("Porte en bois");
        maisonBasique.setFenetres("Fenêtres en verre");
        maisonBasique.setToit("Toit en tuiles");

        System.out.println("Maison Basique : " + maisonBasique);

        // Construction d'une maison de luxe
        Maison maisonDeLuxe = new Maison();
        maisonDeLuxe.setMurs("Murs en brique");
        maisonDeLuxe.setSol("Sol en carrelage");
        maisonDeLuxe.setPorte("Porte en bois");
        maisonDeLuxe.setFenetres("Fenêtres en verre");
        maisonDeLuxe.setToit("Toit en tuiles");
        maisonDeLuxe.setJardin("Jardin avec pelouse");
        maisonDeLuxe.setPiscine("Piscine creusée");

        System.out.println("Maison de Luxe : " + maisonDeLuxe);
    }
}
