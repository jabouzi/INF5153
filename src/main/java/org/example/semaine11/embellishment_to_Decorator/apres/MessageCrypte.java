package org.example.semaine11.embellishment_to_Decorator.apres;

// Décorateur pour le cryptage
public class MessageCrypte implements IMessage {
    private IMessage message;

    public MessageCrypte(IMessage message) {
        this.message = message;
    }

    @Override
    public String envoyer() {
        return "CRYPTED[" + message.envoyer() + "]";
    }
}
