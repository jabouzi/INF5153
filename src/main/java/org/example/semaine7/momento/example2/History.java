package org.example.semaine7.momento.example2;

// Caretaker : Gère les sauvegardes (mementos)
class History {
    private Memento memento;

    public void sauvegarderEtat(Radio radio) {
        this.memento = radio.sauvegarder();
    }

    public void restaurerEtat(Radio radio) {
        if (memento != null) {
            radio.restaurer(memento);
        } else {
            System.out.println("Aucune sauvegarde disponible.");
        }
    }
}
