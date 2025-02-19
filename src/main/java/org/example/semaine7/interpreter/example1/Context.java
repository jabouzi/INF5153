package org.example.semaine7.interpreter.example1;

import java.util.HashMap;
import java.util.Map;

// Context: Contient des informations globales pour l'interprétation
class Context {
    private Map<String, Integer> variables = new HashMap<>();

    public void setVariable(String name, int value) {
        variables.put(name, value);
    }

    public int getVariable(String name) {
        if (!variables.containsKey(name)) {
            throw new IllegalArgumentException("Variable non définie : " + name);
        }
        return variables.get(name);
    }
}

