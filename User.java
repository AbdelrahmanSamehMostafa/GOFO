/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * This class is responsible for registration as it take from the user all his 
 * information and stores it until the system needs it
 *
 * @author Abdelrahman
 */
public class User {

    private String name, iD, phone, email, password, location;

    /**
     * It's a constructor to initialize the attributes (name, iD, phone, email,
     * password, location)
     */
    User() {
        name = "";
        iD = "";
        phone = "";
        email = "";
        password = "";
        location = "";
    }

    /**
     * It sets the name of the user
     *
     * @param n -Refers to User's name
     */
    public void setName(String n) {
        name = n;
    }

    /**
     * It sets the national id of the user
     *
     * @param id -Refers to User's NationalID
     */
    public void setID(String id) {
        iD = id;
    }

    /**
     * It sets the phone of the user
     *
     * @param ph -Refers to User's Phone
     */
    public void setPhone(String ph) {
        phone = ph;
    }

    /**
     * It sets the email of the user
     *
     * @param mail -Refers to User's E-mail
     */
    public void setEmail(String mail) {
        email = mail;
    }

    /**
     * It sets the password of the user
     *
     * @param pw -Refers to User's Password
     */
    public void setPassword(String pw) {
        password = pw;
    }

    /**
     * It sets the location of the user
     *
     * @param loc -Refers to User's Location
     */
    public void setLocation(String loc) {
        location = loc;
    }

    /**
     * Function to return the user's name
     *
     * @return -User's Name
     */
    public String getName() {
        return name;
    }

    /**
     * Function to return the user's national id
     *
     * @return -User's NationalID
     */
    public String getID() {
        return iD;
    }

    /**
     * Function to return the user's Phone
     *
     * @return -User's Phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Function to return the user's email
     *
     * @return -User's E-mail
     */
    public String getEmail() {
        return email;
    }

    /**
     * Function to return the user's password
     *
     * @return -User's Password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Function to return the user's location
     *
     * @return -User's Location
     */
    public String getLocation() {
        return location;
    }
}
