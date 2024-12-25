package com.zsgs.ticketpro.dto;

public class Theatreowner {
    private int ownerId;
    private String ownerName;
    private String username;
    private String password;
    private String contactNumber;

    public Theatreowner(int ownerId, String ownerName, String username, String password, String contactNumber) {
        this.ownerId = ownerId;
        this.ownerName = ownerName;
        this.username = username;
        this.password = password;
        this.contactNumber = contactNumber;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
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
}

