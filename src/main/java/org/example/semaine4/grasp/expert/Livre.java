package org.example.semaine4.grasp.expert;

class Livre {
    private String titre;
    private boolean estEmprunte;

    public Livre(String titre) {
        this.titre = titre;
        this.estEmprunte = false;
    }

    public String getTitre() {
        return titre;
    }

    public boolean emprunter() {
        if (!estEmprunte) {
            estEmprunte = true;
            System.out.println("Le livre \"" + titre + "\" a été emprunté.");
            return true;
        } else {
            System.out.println("Le livre \"" + titre + "\" est déjà emprunté.");
            return false;
        }
    }

    public boolean retourner() {
        if (estEmprunte) {
            estEmprunte = false;
            System.out.println("Le livre \"" + titre + "\" a été retourné.");
            return true;
        } else {
            System.out.println("Le livre \"" + titre + "\" n'est pas emprunté.");
            return false;
        }
    }
}
