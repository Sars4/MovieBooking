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
public class User {
    private int id;
    private String username;
    private String password;
    private String[] history;
    
/**
 * User()
 * constructor for a user
 * @param id
 * @param username
 * @param password
 * @param history 
 */
    public User(int id, String username, String password, String[] history) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.history = history;
    }
    
    /**
     * userMenu()
     * main menu for a user
     */
    public void userMenu()
    {
        
    }
    
    /**
     * viewHIstory()
     * prints out a users history
     */
    public void viewHistory()
    {
        
    }
    
    /**
     * viewMovie()
     * prints out information of a movie
     */
    public void viewMovie()
    {
        
    }
    
    /**
     * viewTickets()
     * view information of tickets
     */
    public void viewTickets()
    {
        
    }
    
    /**
     * deleteAccount()
     * removes the account from users and tickets
     */
    public void deleteAccount()
    {
        
    }
    
    /**
     * logout()
     * stops the menu and returns to login menu
     */
    public void logout()
    {
        
    }
}
