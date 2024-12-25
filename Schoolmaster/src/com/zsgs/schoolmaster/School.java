package com.zsgs.schoolmaster;

public class School {
    private int schoolId;
    private String schoolName;
    private String address;
    private String contactNumber;
    private String email;
    private int totalStudents;
    private int totalTeachers;

    public School(int schoolId, String schoolName, String address, String contactNumber, String email, 
                  int totalStudents, int totalTeachers) {
        this.schoolId = schoolId;
        this.schoolName = schoolName;
        this.address = address;
        this.contactNumber = contactNumber;
        this.email = email;
        this.totalStudents = totalStudents;
        this.totalTeachers = totalTeachers;
    }

    public int getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(int schoolId) {
        this.schoolId = schoolId;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTotalStudents() {
        return totalStudents;
    }

    public void setTotalStudents(int totalStudents) {
        this.totalStudents = totalStudents;
    }

    public int getTotalTeachers() {
        return totalTeachers;
    }

    public void setTotalTeachers(int totalTeachers) {
        this.totalTeachers = totalTeachers;
    }
}

