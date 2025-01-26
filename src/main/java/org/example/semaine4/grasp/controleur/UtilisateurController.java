package org.example.semaine4.grasp.controleur;

public class UtilisateurController {
    private UtilisateurService utilisateurService;

    public UtilisateurController(UtilisateurService utilisateurService) {
        this.utilisateurService = utilisateurService;
    }

    public void inscrire(String nomUtilisateur, String motDePasse) {
        utilisateurService.creerUtilisateur(nomUtilisateur, motDePasse);
    }

    public boolean seConnecter(String nomUtilisateur, String motDePasse) {
        return utilisateurService.authentifier(nomUtilisateur, motDePasse);
    }
}
