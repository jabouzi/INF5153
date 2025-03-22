package org.example.semaine9.interpreter.example2;

// Contexte : Contient des informations partagées pendant l'interprétation
class ContexteMusical {
    private String tonalite;

    public ContexteMusical(String tonalite) {
        this.tonalite = tonalite;
    }

    public String getTonalite() {
        return tonalite;
    }
}

