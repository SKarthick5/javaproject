package com.zsgs.ticketpro.dto;

public class Theatre {
    private int theatreId;
    private String theatreName;
    private String location;
    private int totalSeats;
    private String timings;
    private double ticketPrice;

    public Theatre(int theatreId, String theatreName, String location, int totalSeats, String timings, double ticketPrice) {
        this.theatreId = theatreId;
        this.theatreName = theatreName;
        this.location = location;
        this.totalSeats = totalSeats;
        this.timings = timings;
        this.ticketPrice = ticketPrice;
    }

    public int getTheatreId() {
        return theatreId;
    }

    public void setTheatreId(int theatreId) {
        this.theatreId = theatreId;
    }

    public String getTheatreName() {
        return theatreName;
    }

    public void setTheatreName(String theatreName) {
        this.theatreName = theatreName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getTotalSeats() {
        return totalSeats;
    }

    public void setTotalSeats(int totalSeats) {
        this.totalSeats = totalSeats;
    }

    public String getTimings() {
        return timings;
    }

    public void setTimings(String timings) {
        this.timings = timings;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

	public void setId(long l) {
		// TODO Auto-generated method stub
		
	}
}

