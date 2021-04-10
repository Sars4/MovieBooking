/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package moviebooking;

/**
 *
 * @author logan
 */
public class Movie {
    private String name;
    private String[] movieTimes;
    private double avgRating;
    private String location;
    private String[] cast;
    private String genre;

    /**
     * Movie()
     * constructor for a movie
     * @param name
     * @param movieTimes
     * @param avgRating
     * @param location
     * @param cast
     * @param genre 
     */
    public Movie(String name, String[] movieTimes, double avgRating, String location, String[] cast, String genre) {
        this.name = name;
        this.movieTimes = movieTimes;
        this.avgRating = avgRating;
        this.location = location;
        this.cast = cast;
        this.genre = genre;
    }

    /**
     * getMovieTimes
     * getter for the movie times
     * @return movie times
     */
    public String[] getMovieTimes() {
        return movieTimes;
    }

    /**
     * setMovieTimes()
     * setter for movie times
     * @param movieTimes 
     */
    public void setMovieTimes(String[] movieTimes) {
        this.movieTimes = movieTimes;
    }

    /**
     * getAvgRating()
     * getter for the average rating of a movie
     * @return average rating
     */
    public double getAvgRating() {
        return avgRating;
    }

    /**
     * setAvgRating()
     * setter for the average rating of a movie
     * @param avgRating 
     */
    public void setAvgRating(double avgRating) {
        this.avgRating = avgRating;
    }

    /**
     * getName()
     * getter for the name of a movie
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * getLocation() 
     * getter for the location of the movie
     * @return location
     */
    public String getLocation() {
        return location;
    }

    /**
     * getCast()
     * getter for the cast of a movie
     * @return cast
     */
    public String[] getCast() {
        return cast;
    }

    /**
     * getGenre()
     * getter for the genre of a movie
     * @return genre
     */
    public String getGenre() {
        return genre;
    }
    
    
}
