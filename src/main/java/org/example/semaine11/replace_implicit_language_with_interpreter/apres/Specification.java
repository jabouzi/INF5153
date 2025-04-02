package org.example.semaine11.replace_implicit_language_with_interpreter.apres;

import java.util.*;
import java.util.stream.Collectors;

// Étape 1: Interface de base pour les spécifications
interface Specification<T> {
    boolean isSatisfiedBy(T item);
}

