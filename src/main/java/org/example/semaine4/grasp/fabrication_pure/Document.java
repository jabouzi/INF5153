package org.example.semaine4.grasp.fabrication_pure;

class Document {
    private String chemin;
    private byte[] contenu;
    private GestionFichiers gestionFichiers;

    public Document(GestionFichiers gestionFichiers) {
        this.gestionFichiers = gestionFichiers;
    }

    public void sauvegarder() {
        gestionFichiers.sauvegarderFichier(chemin, contenu);
    }

    public void charger() {
        contenu = gestionFichiers.lireFichier(chemin);
    }
}
