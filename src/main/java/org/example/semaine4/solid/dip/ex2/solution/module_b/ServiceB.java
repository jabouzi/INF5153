package org.example.semaine4.solid.dip.ex2.solution.module_b;

import org.example.semaine4.solid.dip.ex2.solution.module_a.IServiceB;

// Implementer l'abstraction
public class ServiceB implements IServiceB {
    @Override
    public void executer() {
        System.out.println("Executer Service B...");
    }
}
