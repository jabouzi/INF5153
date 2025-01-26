package org.example.semaine4.grasp.fabrication_pure;

public class GestionFichiers {
    public void sauvegarderFichier(String chemin, byte[] contenu) {
        System.out.println("Fichier sauvegardé à : " + chemin);
    }

    public byte[] lireFichier(String chemin) {
        System.out.println("Lecture du fichier depuis : " + chemin);
        return new byte[0];
    }
}
