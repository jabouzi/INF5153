package org.example.semaine11.embellishment_to_Decorator.common;


import org.example.semaine11.embellishment_to_Decorator.apres.IMessage;
import org.example.semaine11.embellishment_to_Decorator.apres.MessageCrypte;
import org.example.semaine11.embellishment_to_Decorator.apres.MessageHTML;
import org.example.semaine11.embellishment_to_Decorator.apres.MessageSimple;
import org.example.semaine11.embellishment_to_Decorator.avant.Message;

public class Main {
    public static void main(String[] args) {
        // AVANT : Approche conditionnelle
        Message msgAvant = new Message("Hello World");
        msgAvant.setCrypter(true);
        msgAvant.setFormaterHTML(true);
        System.out.println("AVANT: " + msgAvant.envoyer());
        // Sortie: AVANT: <p>CRYPTED[Hello World]</p>

        // APRÈS : Approche Decorator
        IMessage msgApres = new MessageHTML(
                new MessageCrypte(
                        new MessageSimple("Hello World")));
        System.out.println("APRÈS: " + msgApres.envoyer());
        // Sortie: APRÈS: <p>CRYPTED[Hello World]</p>
    }
}
