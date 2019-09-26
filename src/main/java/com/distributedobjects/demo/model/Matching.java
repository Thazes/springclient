package com.distributedobjects.demo.model;

public class Matching {
    private int StudentId;
    private String gender;
    private Long matchId;
    public Matching(int studentId, String gender, Long matchId) {
       this.StudentId = studentId;
        this.gender = gender;
        this.matchId = matchId;
    }


    public int getStudentId() {
        return StudentId;
    }

    public void setStudentId(int studentId) {
        StudentId = studentId;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Long getMatchId() {
        return matchId;
    }

    public void setMatchId(Long matchId) {
        this.matchId = matchId;
    }
}
