package org.example.semaine5.patrons.monteur.sans;

// Classe Maison
class Maison {
    private String murs;
    private String sol;
    private String porte;
    private String fenetres;
    private String toit;
    private String jardin;
    private String piscine;

    public void setMurs(String murs) {
        this.murs = murs;
    }

    public void setSol(String sol) {
        this.sol = sol;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    public void setFenetres(String fenetres) {
        this.fenetres = fenetres;
    }

    public void setToit(String toit) {
        this.toit = toit;
    }

    public void setJardin(String jardin) {
        this.jardin = jardin;
    }

    public void setPiscine(String piscine) {
        this.piscine = piscine;
    }

    @Override
    public String toString() {
        return "Maison {" +
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

