package org.example.semaine9.momento.example2;

// Originator : L'objet dont on souhaite sauvegarder et restaurer l'état
class Radio {
    private String station;

    public void setStation(String station) {
        this.station = station;
        System.out.println("Station actuelle : " + station);
    }

    public Memento sauvegarder() {
        return new Memento(station);
    }

    public void restaurer(Memento memento) {
        station = memento.getEtat();
        System.out.println("Station restaurèe : " + station);
    }
}
