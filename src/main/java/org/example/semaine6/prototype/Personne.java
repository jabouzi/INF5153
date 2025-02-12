package org.example.semaine6.prototype;

// Classe Personne implémentant le patron Prototype
class Personne implements Cloneable {
    private String nom;
    private int age;
    private String adresse;

    // Constructeur
    public Personne(String nom, int age, String adresse) {
        this.nom = nom;
        this.age = age;
        this.adresse = adresse;
    }

    // Méthode pour afficher les détails de la personne
    public void afficherDetails() {
        System.out.println("Nom: " + nom + ", Âge: " + age + ", Adresse: " + adresse);
    }

    // Méthode copy pour créer une copie de l'objet avec un paramètre modifié
    public Personne copy(String nouveauNom) {
        try {
            // Crée une copie de l'objet actuel
            Personne copie = (Personne) this.clone();
            // Modifie le nom dans la copie
            copie.nom = nouveauNom;
            return copie;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    // Redéfinition de la méthode clone() pour permettre la copie
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

