package com.distributedobjects.demo.model;

public class Date {
    private int dateId;
    private int studentId;
    private String gender;

    public Date(int dateId, int studentId, String gender) {
        this.dateId = dateId;
        this.studentId = studentId;
        this.gender = gender;
    }

    public int getDateId() {
        return dateId;
    }

    public void setDateId(int dateId) {
        this.dateId = dateId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
