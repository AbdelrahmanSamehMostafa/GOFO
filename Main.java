
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * This is the main function which responsible for printing the output needed
 * upon any changes are set, contains all the classes and some controlled 
 * scenarios for the user
 *
 * @author Abdelrahman
 */
public class Main {

    /**
     * User can register and chooses to be either a Player or a playground
     * Owner, If he chooses player he will be able to see all available
     * playgrounds and book any of them, If he chooses playground owner he till
     * now will be able to add any playground with its info ,Some functions may
     * be able to be used in the future!
     *
     * @param args That we will use it to saves the unnecessary wastage of
     * memory
     */
    public static void main(String[] args) {
        ArrayList<Playground> playgrounds = new ArrayList<Playground>();
        ArrayList<Player> players = new ArrayList<Player>();
        Scanner scan = new Scanner(System.in);
        Playground pg = new Playground();
        Playground pg2 = new Playground();
        pg.setPgName("Liverpool");
        pg.setSize("70m");
        pg.setLocation("Zayed");
        pg.setAvailableTimes("3pm -> 3am");
        pg.setPricePerHour("150 LE");
        pg.setPlaygroundNumber(1);
        pg2.setPgName("Anfield");
        pg2.setSize("90m");
        pg2.setLocation("Haram");
        pg2.setAvailableTimes("5pm -> 5am");
        pg2.setPricePerHour("130 LE");
        pg2.setPlaygroundNumber(2);
        playgrounds.add(pg);
        playgrounds.add(pg2);
        System.out.println("Welcome to GOFO\n");
        System.out.println("Do you want to Register? if yes press 'y' if no press 'n' -->");

        //variable rg checks if the user want to register or not
        String rg;
        rg = scan.nextLine();
        if ("y".equals(rg)) {
            User u1 = new User();
            String n = "", id = "", ph = "", email = "", pw = "", loc = "";
            System.out.println("Enter your name: ");
            n = scan.nextLine();
            u1.setName(n);
            System.out.println("Enter your national ID: ");
            id = scan.nextLine();
            u1.setID(id);
            System.out.println("Enter your Phone number: ");
            ph = scan.nextLine();
            u1.setPhone(ph);
            System.out.println("Enter your Email: ");
            email = scan.nextLine();
            u1.setEmail(email);
            System.out.println("Enter your Password: ");
            pw = scan.nextLine();
            u1.setPassword(pw);
            System.out.println("Enter your Location: ");
            loc = scan.nextLine();
            u1.setLocation(loc);
            System.out.println("\nRegistration Completed!\n");
        }
        while (true) {
            // variable choice checks what the user wants to be after registration
            String choice = "";
            System.out.println("choose what you want to be \n1-Player\n2-Playground Owner");
            choice = scan.nextLine();
            if ("1".equals(choice)) { //chooses player
                Player p1 = new Player();
                players.add(p1);
                p1.getAvailablePG(playgrounds);
                while (true) {
                    System.out.println("Do you want to book any playground ?\nIf yes press 'y' if no press 'n' -->");
                    // variable bk checks the player wants to book a playground or not
                    String bk = "";
                    bk = scan.nextLine();
                    int indx = 0;
                    if ("y".equals(bk)) {
                        p1.requestBooking(playgrounds);
                        int x = 0;
                        for (int i = 0; i < players.size(); i++) {
                            if (p1.getID().equals(players.get(i).getID())) {
                                x = i;
                            }
                        }
                        indx = x;
                        players.get(indx).playerbookings.add(p1.book);
                        for (int i = 0; i < players.get(indx).playerbookings.size(); i++) {
                            System.out.println(players.get(indx).playerbookings.get(i).getTimeSlot());
                        }
                    } else { // when Player press n
                        System.out.println("\nThank you, Bye!\n");
                        break;
                    }
                }
                break;
            } else if ("2".equals(choice)) { //chooses playground owner
                PlaygroundOwner po1 = new PlaygroundOwner();
                while (true) {
                    System.out.println("Do you want to add any playground ?\nIf yes press 'y' if no press 'n' -->");
                    // variable add checks the playground owner wants to add any playground or not
                    String add = "";
                    add = scan.nextLine();
                    if ("y".equals(add)) {
                        Playground pg3 = new Playground();
                        po1.addPlayground(pg3);
                        playgrounds.add(pg3);
                    } else { //when playground owner press n
                        System.out.println("\nThank you, Bye!\n");
                        break;
                    }
                }
                break;
            } else { // if he enters numbers neither 1 nor 2
                System.out.println("Please enter numbers only!!\n");
            }
        }
    }
}
