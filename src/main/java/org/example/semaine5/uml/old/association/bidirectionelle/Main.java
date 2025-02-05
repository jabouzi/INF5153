package org.example.semaine5.uml.old.association.bidirectionelle;

// Définition :
// Une relation bidirectionnelle 1..* signifie qu’une classe A peut être liée à plusieurs instances d’une classe B,
// et chaque instance de B connaît aussi son instance associée de A.
public class Main {
    public static void main(String[] args) {
        University uqam = new University("UQAM");

        Student alice = new Student("Alice");
        Student bob = new Student("Bob");

        uqam.addStudent(alice);
        uqam.addStudent(bob);

        uqam.showStudents();
    }
}
