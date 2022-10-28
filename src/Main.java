import java.util.Scanner;

public class Main {
    public Scanner sc = new Scanner(System.in);
    public String typedUsername, typedPassword;
    public int amount;
    Bank bank = new Bank("BernardSapida", "Password123");

    public static void main(String[] args) throws Exception {
        Main main = new Main ();
        main.startTyping();
    }

    public void startTyping() {
        while(true) {
            verifyUsername();
            verifyPassword();
            startActions();
        }
    }

    public void queryUsername(){
        System.out.print("\nEnter your username: ");
        typedUsername = sc.nextLine();
    }

    public void queryPassword(){
        System.out.print("\nEnter your password: ");
        typedPassword = sc.nextLine();
    }

    public boolean verifyUsername() {
        boolean validUsername = false;

        while(!validUsername) {
            queryUsername();
            if(typedUsername.equals(bank.getUsername())) validUsername = true;
            else System.out.println("Your username didn't exist!");
        }
        return true;
    }

    public boolean verifyPassword() {
        boolean validPassword = false;

        while(!validPassword) {
            queryPassword();
            if(typedPassword.equals(bank.getPassword())) {
                validPassword = true;
                System.out.println("You are now logged in!");
            }
            else System.out.println("Your password is incorrect!");
        }
        return true;
    }

    public void queryAmount(){
        System.out.print("\nEnter amount to deposit: ");
        amount = sc.nextInt();
    }

    public void startActions() {
        action: while(true) {
            System.out.println("\n==================================================");
            System.out.println("\n[1] Deposit amount");
            System.out.println("[2] Withdraw amount");
            System.out.println("[3] Check card information");
            System.out.println("[4] Signout");
            System.out.print("Enter action number: ");
            int action = sc.nextInt();

            switch(action) {
                case 1 -> { 
                    queryAmount();
                    bank.setAmount(amount);
                }
                case 2 -> { 
                    queryAmount();
                    if(amount <= bank.getAmount()) {
                        bank.withdrawAmount(amount);
                        System.out.println(amount + " Php withdraw successfully!");
                        break;
                    } else System.out.println("You dont have enough funds to withdraw");
                }
                case 3 -> { bank.printCardInformation(); }
                case 4 -> { 
                    System.out.println("Thank you for making transaction! You are signed out.");
                    System.exit(1);
                }
            }
        }
    }
}
