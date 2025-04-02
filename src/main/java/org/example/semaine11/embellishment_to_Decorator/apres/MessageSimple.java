package org.example.semaine11.embellishment_to_Decorator.apres;

// Implémentation de base (responsabilité principale)
public class MessageSimple implements IMessage {
    private String contenu;

    public MessageSimple(String contenu) {
        this.contenu = contenu;
    }

    @Override
    public String envoyer() {
        return contenu;
    }
}
