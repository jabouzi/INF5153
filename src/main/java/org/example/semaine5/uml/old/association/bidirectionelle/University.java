package org.example.semaine5.uml.old.association.bidirectionelle;

import java.util.ArrayList;
import java.util.List;

class University {
    private String name;
    private List<Student> students;

    public University(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addStudent(Student student) {
        students.add(student);
        student.setUniversity(this); // Étudiant connaît son université
    }

    public void showStudents() {
        System.out.println("University: " + name);
        for (Student student : students) {
            System.out.println(" - " + student.getName() + " (Belongs to " + student.getUniversityName() + ")");
        }
    }
}

