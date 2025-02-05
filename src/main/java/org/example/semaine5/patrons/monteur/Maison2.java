package org.example.semaine5.patrons.monteur;

// Classe Maison
class Maison2 {
    private String murs;
    private String sol;
    private String porte;
    private String fenetres;
    private String toit;
    private String jardin;
    private String piscine;

    public Maison2 setMurs(String murs) {
        this.murs = murs;
        return this;
    }

    public Maison2 setSol(String sol) {
        this.sol = sol;
        return this;
    }

    public Maison2 setPorte(String porte) {
        this.porte = porte;
        return this;
    }

    public Maison2 setFenetres(String fenetres) {
        this.fenetres = fenetres;
        return this;
    }

    public Maison2 setToit(String toit) {
        this.toit = toit;
        return this;
    }

    public Maison2 setJardin(String jardin) {
        this.jardin = jardin;
        return this;
    }

    public Maison2 setPiscine(String piscine) {
        this.piscine = piscine;
        return this;
    }

    @Override
    public String toString() {
        return "Maison2 {" +
                "murs='" + murs + '\'' +
                ", sol='" + sol + '\'' +
                ", porte='" + porte + '\'' +
                ", fenetres='" + fenetres + '\'' +
                ", toit='" + toit + '\'' +
                ", jardin='" + jardin + '\'' +
                ", piscine='" + piscine + '\'' +
                '}';
    }
}

