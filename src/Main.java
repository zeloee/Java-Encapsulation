import java.util.Scanner;

public class Main {
    public Scanner sc = new Scanner(System.in);
    public String typedUsername, typedPassword;


    public static void main(String[] args) throws Exception {
        
        Main main = new Main ();
        main.startTyping();

    }

    public void startTyping() {
        
        queryUsername();
        queryPassword();
        displayAmount();

    }

    public void queryUsername(){
        System.out.println("Enter your username: ");
        typedUsername = sc.nextLine();
    }

    public void queryPassword(){
        System.out.println("Enter your password: ");
        typedPassword = sc.nextLine();
    }

    public void displayAmount() {
        Bank bank = new Bank();
        System.out.println(bank.getAmount());
    }

}

/*
 * Your task is to create a java program for bank system using Encapsulation 
 * 
 * First! You should have 2 classes which are Main class and Bank class
 * So that means you have Main.java and Bank.java created in your src directory
 * 
 * In Main class, you should create string variable for username, and password.
 * you should have a public method which are queryUsername and queryPassword
 * those method should be a void type (No return value)
 * 
 * In queryUsername method, the method should ask what is the username of the user
 * Enter username: BernardSapida
 * 
 * In queryPassword method, the method should ask for the password of the user
 * Enter password: HelloWorld
 * 
 * All inputs should be a string! Use nextLine().
 * 
 * In Bank class, create a variable for password, username, cardNumber, and amount.
 * 
 * Create a setter method name setAmount with a parameter of int amount.
 * 
 * Create a getter method name getAmount and it will return the amount
 * 
 * Lastly, do this task IF AND ONLY IF di ka busy. Prioritize those things na nagmamatter
 * sa iyo and anytime naman pwede mo isubmit ito and also chat ka kapag hard stuck kana. 
 * However mas maganda if matatapos mo siya sooner para marami pa ako maituro sa iyo.
 * Do it slowly! Goodluck! ALAM KONG KAYANG KAYA MO YAN NOWELA! 
 */