package org.example.semaine5.uml.old.aggregation;

// Définition : Une relation “tout/partie” où la partie peut exister indépendamment du tout.
public class Main {
    public static void main(String[] args) {
        School school = new School("UQAM");
        Student s1 = new Student("Alice");
        Student s2 = new Student("Bob");

        school.addStudent(s1);
        school.addStudent(s2);
        school.showStudents();
    }
}
