package composite.expression;

class Nombre implements Expression {
    private double valeur;

    public Nombre(double valeur) {
        this.valeur = valeur;
    }

    @Override
    public double evaluer() {
        return valeur;
    }
}