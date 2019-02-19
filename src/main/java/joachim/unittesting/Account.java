/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package joachim.unittesting;

/**
 *
 * @author Joachim
 */
public class Account {

    int interest;
    int balance;

    public Account() {
        
    }
    public Account(int Balance) {
        this.balance = Balance;
    }

    public int getInterest() {
        return interest;
    }

    public void setInterest(int interest) {
        this.interest = interest;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    
}
