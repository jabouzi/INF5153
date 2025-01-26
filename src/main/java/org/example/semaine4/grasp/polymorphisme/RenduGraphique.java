package org.example.semaine4.grasp.polymorphisme;

import java.util.List;

class RenduGraphique {
    public void rendre(List<Forme> formes) {
        for (Forme forme : formes) {
            forme.dessiner();
        }
    }
}