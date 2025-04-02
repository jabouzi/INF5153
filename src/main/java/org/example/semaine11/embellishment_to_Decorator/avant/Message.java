package org.example.semaine11.embellishment_to_Decorator.avant;

public class Message {
    private String contenu;
    private boolean crypter;
    private boolean formaterHTML;

    public Message(String contenu) {
        this.contenu = contenu;
    }

    // Méthode principale + embellissements
    public String envoyer() {
        String resultat = contenu;

        if (crypter) {
            resultat = "CRYPTED[" + resultat + "]"; // Embellissement 1
        }

        if (formaterHTML) {
            resultat = "<p>" + resultat + "</p>"; // Embellissement 2
        }

        return resultat;
    }

    // Setters pour activer/désactiver les options
    public void setCrypter(boolean crypter) { this.crypter = crypter; }
    public void setFormaterHTML(boolean formaterHTML) { this.formaterHTML = formaterHTML; }
}