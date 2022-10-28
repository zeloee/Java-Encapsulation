import java.util.Scanner;
import java.util.UUID;

public class Bank {
    public Scanner sc = new Scanner (System.in);
    private String Password, UserName;
    private int Amount;
    private UUID cardNumber;

    Bank(String username, String password) {
        UserName = username;
        Password = password;
        cardNumber = UUID.randomUUID();
    }

    //setter
    public void setAmount(int Amount){
        this.Amount += Amount;
    }

    public void withdrawAmount(int amount) {
        this.Amount -= amount;
    }

    //getter
    public int getAmount(){
        return Amount;
    }

    public String getUsername(){
        return UserName;
    }

    public String getPassword(){
        return Password;
    }

    public void printCardInformation() {
        System.out.println("\nCard Information");
        System.out.println("Username: " + UserName);
        System.out.println("Card Number: " + cardNumber);
        System.out.println("Amount: " + Amount);
    }
}
