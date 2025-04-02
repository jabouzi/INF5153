package org.example.semaine11.embellishment_to_Decorator.apres;

// Décorateur pour le formatage HTML
public class MessageHTML implements IMessage {
    private IMessage message;

    public MessageHTML(IMessage message) {
        this.message = message;
    }

    @Override
    public String envoyer() {
        return "<p>" + message.envoyer() + "</p>";
    }
}
