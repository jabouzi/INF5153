package org.example.semaine7.command.example2;

class CommandeCuisine implements Commande {
    private Cuisinier cuisinier;
    private String plat;

    public CommandeCuisine(Cuisinier cuisinier, String plat) {
        this.cuisinier = cuisinier;
        this.plat = plat;
    }

    @Override
    public void executer() {
        cuisinier.preparerPlat(plat);
    }

    @Override
    public void annuler() {
        System.out.println("Annulation de la preparation de : " + plat);
    }
}
