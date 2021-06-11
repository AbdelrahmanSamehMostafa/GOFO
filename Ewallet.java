/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * It's a class with some methods that produces an online payment method which 
 * called EWallet, if the user either player or playground owner wants to check 
 * his balance also the player can transfer the amount of money needed from the 
 * playground owner by using the function transferBalance()
 *
 * @author Abdelrahman
 */
public class Ewallet {

    private double balance_;

    /**
     * It's a method to return the amount of money (Balance)
     *
     * @return The balance in the EWallet
     */
    public double getBalance() {
        return balance_;
    }

    /**
     * It's a method to transfer the amount of money selected upon the player
     * books any playground
     *
     * @param money -The amount of money that must be transferred
     * @param pgowner -The playground owner that the money will be transferred
     * for him
     * @return True if transferred successfully
     */
    public boolean transferBalance(double money, PlaygroundOwner pgowner) {
        if (money < balance_) {
            balance_ = balance_ - money;
            pgowner.ewallet.balance_ = pgowner.ewallet.balance_ + money;
            return true;
        } else if (money > balance_) {
            System.out.println("Sorry, You don't have enough balance");
        }
        return false;
    }

    /**
     * Method to deposit money in the balance of the account
     *
     * @param money The amount of money that the client wants to deposit
     */
    public void depositMoney(double money) {
        balance_ = balance_ + money;
        System.out.println("Your new balance : " + balance_);
    }

    /**
     * Method to withdraw money from the balance of the account
     *
     * @param money The amount of money that the client wants to withdraw
     */
    public void withdrawMoney(double money) {
        if (money < balance_) {
            balance_ = balance_ - money;
            System.out.println("Your new balance : " + balance_);
        } else if (money > balance_) {
            System.out.println("Sorry, You don't have enough balance");
            System.out.println("Your balance is " + balance_);
        } else {
            System.out.println("Error!");
        }
    }
}
