package com.distributedobjects.demo.model;

public class Student {
    private int id;
    private int studentId;
    private String firstName;

    public Student(int id, int studentId, String firstName) {
        this.id = id;
        this.studentId = studentId;
        this.firstName = firstName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
