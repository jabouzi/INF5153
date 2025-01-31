package org.example.semaine4.solid.dip.ex2.solution.module_b;

import org.example.semaine4.solid.dip.ex2.solution.module_a.IServiceA;

// Module B: Implementer l'abstraction
public class ServiceA implements IServiceA {
    @Override
    public void executer() {
        System.out.println("Executer Service A...");
    }
}
