/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.util.Scanner;

/**
 * It's a class inherits from class User which stores the info of the user after
 * registration and the user chooses to be a PlaygroundOwner, The
 * PlaygroundOwner can add any of the available playgrounds by using the
 * function addPlayground()
 *
 * @author Abdelrahman
 */
public class PlaygroundOwner extends User {

    Scanner scan = new Scanner(System.in);
    public Ewallet ewallet;
    ArrayList<Playground> playgrounds = new ArrayList<Playground>();

    /**
     * Function the playgroundOwner call it when the user want to add any of the
     * available with entering its info
     *
     * @param pg -Object from class Playground
     */
    public void addPlayground(Playground pg) {
        String name;
        System.out.println("Enter plyaground name : ");
        name = scan.nextLine();
        pg.setPgName(name);

        String size;
        System.out.println("Enter plyaground size : ");
        size = scan.nextLine();
        pg.setSize(size);

        String loc;
        System.out.println("Enter plyaground location : ");
        loc = scan.nextLine();
        pg.setLocation(loc);

        String pph;
        System.out.println("Enter plyaground price per hour : ");
        pph = scan.nextLine();
        pg.setPricePerHour(pph);

        String at;
        System.out.println("Enter plyaground available times : ");
        at = scan.nextLine();
        pg.setAvailableTimes(at);

        int pgnum;
        System.out.println("Enter plyaground number (Only numbers) : ");
        pgnum = scan.nextInt();
        pg.setPlaygroundNumber(pgnum);

        System.out.println("\nSussessfully added!\n");
        playgrounds.add(pg);
    }

}
