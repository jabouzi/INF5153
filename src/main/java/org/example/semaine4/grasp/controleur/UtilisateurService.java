package org.example.semaine4.grasp.controleur;


class UtilisateurService {
    public void creerUtilisateur(String nomUtilisateur, String motDePasse) {
        System.out.println("Utilisateur créé : " + nomUtilisateur);
    }

    public boolean authentifier(String nomUtilisateur, String motDePasse) {
        System.out.println("Authentification réussie pour : " + nomUtilisateur);
        return true;
    }
}
