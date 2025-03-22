package org.example.semaine9.interpreter.example2;

// ExpressionTerminale : Représente une note musicale
class NoteMusicale implements ExpressionMusicale {
    private String note;

    public NoteMusicale(String note) {
        this.note = note;
    }

    @Override
    public void interpreter(ContexteMusical contexte) {
        System.out.println("Jouer la note : " + note + " dans la tonalite : " + contexte.getTonalite());
    }
}
