package joachim.unittesting;

/**
 * @author Joachim
 */
public class Bank {

    public Bank() {
        
    }

    public static double calculateYearlyInterest(Account account) {
        if (account.getBalance() <= 100) {
            account.setInterest(3);
            return 0.03;
        } else if (account.getBalance() <= 1000) {
            account.setInterest(5);
            return 0.05;
        } else if (account.getBalance() >= 1000) {
            account.setInterest(7);
            return 0.07;
        }
        return 0;
    }
}
