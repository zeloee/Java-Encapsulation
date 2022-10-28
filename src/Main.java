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
    }

    public void queryUsername(){
        System.out.println("Enter your username: ");
        typedUsername = sc.nextLine();
    }

    public void queryPassword(){
        System.out.println("Enter your password: ");
        typedPassword = sc.nextLine();
    }
}