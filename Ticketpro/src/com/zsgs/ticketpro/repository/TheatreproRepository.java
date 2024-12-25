package com.zsgs.ticketpro.repository;

import java.util.ArrayList;
import java.util.List;

import com.zsgs.ticketpro.dto.Admin;
import com.zsgs.ticketpro.dto.Credentials;
import com.zsgs.ticketpro.dto.Customer;
import com.zsgs.ticketpro.dto.Movie;
import com.zsgs.ticketpro.dto.Theatre;

public class TheatreproRepository {
	private static TheatreproRepository theatreprorepository;
	public static TheatreproRepository getInstance()
	{
		if(theatreprorepository==null)
			theatreprorepository=new TheatreproRepository();
	    return theatreprorepository;
	}

    private List<Credentials> adminCredentials = new ArrayList<Credentials>();

    private Theatre theatre;
    private List<Movie> movieList = new ArrayList<>();
    private List<Customer> customerList = new ArrayList<>();

    private void TheatreProRepository() {}

    private void initialSetup() {
        // Adding Admin details to the list
        adminCredentials.add(new Credentials("0001", "admin", "ZSGS"));
        adminCredentials.add(new Credentials("0002", "superAdmin", "ZSGS"));
    }

    public Admin checkValidUser(String userName, String password) {
        for (Credentials credential : adminCredentials) {
            if (credential.getUserName().equals(userName) && credential.getPassword().equals(password)) {
                return credential; //
            }
        }
        return null;
    }

    public Theatre getTheatre() {
        // Theatre info can be retrieved here
        return theatre;
    }

    public void setTheatre(Theatre theatre) {
        theatre.setId(100L);
        this.theatre = theatre;
    }

    public List<Movie> getAllMovies() {
        return movieList;
    }

    public Movie getMovie(int movieId) {
        for (Movie movie : movieList) {
            if (movie.getMovieId() == movieId) {
                return movie;
            }
        }
        // select query with where condition.
        return null;
    }

    public List<Movie> searchMovies(String movieName) {
        List<Movie> searchResult = new ArrayList<>();
        for (Movie movie : movieList) {
            if (movie.getGenre().contains(movieName)) {
                searchResult.add(movie);
            }
        }
        // select query with where condition.
        return searchResult;
    }

    public boolean insertMovie(Movie movie) {
        boolean hasMovie = false;
        for (Movie addedMovie : movieList) {
            if (addedMovie.getGenre().equals(movie.getGenre()) && addedMovie.getDirector().equals(movie.getDirector())) {
                hasMovie = true;
                break;
            }
        }
        if (hasMovie) {
            return false;
        } else {
            movieList.add(movie);
            return true;
        }
    }

    public boolean insertCustomer(Customer customer) {
        boolean hasCustomer = false;
        for (Customer addedCustomer : customerList) {
            if (addedCustomer.getEmailId().equals(customer.getEmailId())) {
                hasCustomer = true;
                break;
            }
        }
        if (hasCustomer) {
            return false;
        } else {
            customerList.add(customer);
            return true;
        }
    }
}
