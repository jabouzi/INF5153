package org.example.semaine4.solid.dip.ex2.solution;

import org.example.semaine4.solid.dip.ex2.solution.module_a.Application;
import org.example.semaine4.solid.dip.ex2.solution.module_a.IServiceA;
import org.example.semaine4.solid.dip.ex2.solution.module_a.IServiceB;
import org.example.semaine4.solid.dip.ex2.solution.module_b.ServiceA;
import org.example.semaine4.solid.dip.ex2.solution.module_b.ServiceB;

// Main method to run
public class Main {
    public static void main(String[] args) {
        IServiceA serviceA = new ServiceA(); // Implementation Module B
        IServiceB serviceB = new ServiceB(); // Implementation Module B

        Application app = new Application(serviceA, serviceB); // Module A
        app.run();
    }
}
