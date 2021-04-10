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

    public Movie(String name, String[] movieTimes, double avgRating, String location, String[] cast, String genre) {
        this.name = name;
        this.movieTimes = movieTimes;
        this.avgRating = avgRating;
        this.location = location;
        this.cast = cast;
        this.genre = genre;
    }

    public String[] getMovieTimes() {
        return movieTimes;
    }

    public void setMovieTimes(String[] movieTimes) {
        this.movieTimes = movieTimes;
    }

    public double getAvgRating() {
        return avgRating;
    }

    public void setAvgRating(double avgRating) {
        this.avgRating = avgRating;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public String[] getCast() {
        return cast;
    }

    public String getGenre() {
        return genre;
    }
    
    
}
