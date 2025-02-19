package org.example.semaine7.interpreter.example2;

import java.util.ArrayList;
import java.util.List;

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

