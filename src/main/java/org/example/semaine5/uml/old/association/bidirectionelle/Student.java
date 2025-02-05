package org.example.semaine5.uml.old.association.bidirectionelle;

class Student {
    private String name;
    private University university;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setUniversity(University university) {
        this.university = university;
    }

    public String getUniversityName() {
        return (university != null) ? university.getName() : "No University";
    }
}
