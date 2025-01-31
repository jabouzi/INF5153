package org.example.semaine4.solid.dip.ex2.violation.module_a;

import org.example.semaine4.solid.dip.ex2.violation.module_b.ServiceA;
import org.example.semaine4.solid.dip.ex2.violation.module_b.ServiceB;

// Module A: module haut niveau qui depend d'un module bas niveau
public class Application {
    private ServiceA serviceA;
    private ServiceB serviceB;

    public Application() {
        this.serviceA = new ServiceA(); // Couplage fort avec le Module B
        this.serviceB = new ServiceB();
    }

    public void run() {
        serviceA.executer();
        serviceB.executer();
    }
}

