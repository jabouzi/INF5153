package org.example.semaine9.visitor.example2;

// Utilisation
public class VisitorExample {
    public static void main(String[] args) {
        Employe employe = new Employe("Alice");
        Visiteur visiteur = new VisiteurRH();

        employe.accepter(visiteur); // Visite de l'employe : Alice
    }
}