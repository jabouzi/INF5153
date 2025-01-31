package org.example.semaine4.solid.dip.ex2.solution.module_a;

// Module A: Module de haut niveau qui depend de l'abstractions
public class Application {
    private final IServiceA serviceA;
    private final IServiceB serviceB;

    public Application(IServiceA serviceA, IServiceB serviceB) {
        this.serviceA = serviceA;
        this.serviceB = serviceB;
    }

    public void run() {
        serviceA.executer();
        serviceB.executer();
    }
}

