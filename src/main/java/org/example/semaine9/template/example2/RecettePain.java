package org.example.semaine9.template.example2;

abstract class RecettePain {
    public final void preparer() {
        melangerIngredients();
        cuire();
        refroidir();
    }

    abstract void melangerIngredients();

    abstract void cuire();

    abstract void refroidir();
}
