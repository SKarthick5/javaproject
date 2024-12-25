package com.zsgs.schoolmaster;

public class Teacher {
    private int teacherId;
    private String name;
    private String subject;
    private String username;
    private String password;
    private String contactNumber;
    private String email;

    public Teacher(int teacherId, String name, String subject, String username, String password, 
                   String contactNumber, String email) {
        this.teacherId = teacherId;
        this.name = name;
        this.subject = subject;
        this.username = username;
        this.password = password;
        this.contactNumber = contactNumber;
        this.email = email;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
}

