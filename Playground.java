
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * This class is essential as it stores the data of any playground on the system
 * and is a reference any time needed to access these data containing an
 * arrayList with all booked playgrounds and print the available for the player
 * if needed
 *
 * @author Abdelrahman
 */
public class Playground {

    private String pgName, size, location, pricePerHour, availableTimes;
    private boolean activated;
    private int playgroundNumber;
    private PlaygroundOwner Owner;

    ArrayList<Booking> bookedPlaygrounds = new ArrayList<Booking>();

    /**
     * It's an empty constructor to initialize the attributes ( pgName, size,
     * location, pricePerHour, availableTimes)
     */
    Playground() {

        pgName = "";
        size = "";
        location = "";
        pricePerHour = "";
        activated = true;
        playgroundNumber = 0;
        Owner = new PlaygroundOwner();
    }

    /**
     * It sets the name of the playground
     *
     * @param n -Refers to Playground name
     */
    public void setPgName(String n) {
        pgName = n;
    }

    /**
     * It sets the size of the playground
     *
     * @param sz -Refers to Playground size
     */
    public void setSize(String sz) {
        size = sz;
    }

    /**
     * It sets the location of the playground
     *
     * @param loc -Refers to Playground location
     */
    public void setLocation(String loc) {
        location = loc;
    }

    /**
     * It sets the price per hour of the playground
     *
     * @param pph -Refers to Playground price per hour
     */
    public void setPricePerHour(String pph) {
        pricePerHour = pph;
    }

    /**
     * It sets the available times of the playground
     *
     * @param at -Refers to Playground available times
     */
    public void setAvailableTimes(String at) {
        availableTimes = at;
    }

    /**
     * It sets the unique number of the playground
     *
     * @param num -Refers to Playground ID
     */
    public void setPlaygroundNumber(int num) {
        playgroundNumber = num;
    }

    /**
     * It sets the owner of the playground
     *
     * @param owner -Refers to Playground owner
     */
    public void setOwner(PlaygroundOwner owner) {
        Owner = owner;
    }

    /**
     * Func to return the playground name
     *
     * @return -Playground Name
     */
    public String getPgName() {
        return pgName;
    }

    /**
     * Func to return the playground size
     *
     * @return -Playground Size
     */
    public String getSize() {
        return size;
    }

    /**
     * Func to return the playground location
     *
     * @return -Playground Location
     */
    public String getLocation() {
        return location;
    }

    /**
     * Func to return the playground price per hour
     *
     * @return -Playground PricePerHour
     */
    public String getPricePerHour() {
        return pricePerHour;
    }

    /**
     * Func to return the playground unique number
     *
     * @return -Playground ID
     */
    public int getPlaygroundNumber() {
        return playgroundNumber;
    }

    /**
     * Func to return the playground available times
     *
     * @return -Playground Available Times
     */
    public String getAvailableTimes() {
        return availableTimes;
    }

    /**
     * Func to return the playground owner
     *
     * @return -Playground Owner
     */
    public PlaygroundOwner getOwner() {
        return Owner;
    }

    /**
     * Func to check if the playground is activated or not
     *
     * @param active Activated or not activated!
     */
    public void activate(boolean active) {
        activated = active;
    }
}
