package org.example.semaine7.template.example2;

class RecettePainRaisin extends RecettePain {
    @Override
    void melangerIngredients() {
        System.out.println("Melanger farine, eau, raisins.");
    }

    @Override
    void cuire() {
        System.out.println("Cuire a 180 degres.");
    }

    @Override
    void refroidir() {
        System.out.println("Laisser refroidir 30 minutes.");
    }
}
