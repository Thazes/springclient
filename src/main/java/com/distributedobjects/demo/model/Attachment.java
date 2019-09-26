package com.distributedobjects.demo.model;

public class Attachment {
    private int studentId;
    private int companyId;

    public Attachment(int studentId, int companyId) {
        this.studentId = studentId;
        this.companyId = companyId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }
}
