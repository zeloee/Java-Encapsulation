import java.util.Scanner;

// Identity
public class Main {
    // State
    public Scanner sc = new Scanner(System.in);
    public String displayOptions = 
        "[1] iPhone 14 - Php 61,990\n" + 
        "[2] iPhone 14 Plus - Php 68,990\n" +
        "[3] iPhone 14 Pro - Php 76,990\n" +
        "[4] iPhone 14 Pro Max - Php 83,990\n\n" +
        "[1] Regular - No discount\n" +
        "[2] Student - 10%\n" +
        "[3] PWD - 20%\n" +
        "[4] Senior Citizen - 30%\n";
    public int selectedBrand, selectedDiscount;

    public static void main(String[] args) throws Exception {
        // Code Runner

        // Instantiation of the class (Creating object)
        Main main = new Main();
        main.startTransaction();
    }

    // Behavior (One method/function should do one thing)
    // Rule: method first word should be a verb
    public void startTransaction() {
        System.out.println(displayOptions);
        queryBrand();
        queryStatus();
        displayComputation();
    }

    /**
     * This function asks the user to enter a number between 1 and 4, and then stores that number in
     * the variable selectedBrand
     */
    public void queryBrand() {
        System.out.print("Enter your choice of brand [1-4]: ");
        selectedBrand = sc.nextInt();
    }

    /**
     * This function asks the user to enter a status number and then stores that number in the variable
     * selectedDiscount.
     */
    public void queryStatus() {
        System.out.print("Enter status [1-4]: ");
        selectedDiscount = sc.nextInt();
    }

    /**
     * The function takes the selected brand and discount from the user and passes it to the child
     * class to calculate the total bill
     */
    public void displayComputation() {
        Child child = new Child();
        child.setTotalBill(selectedBrand, selectedDiscount);
        System.out.println("Your total bill is: " + child.getTotalBill());
    }
}

/*
    [1] iPhone 14 - Php 61,990
    [2] iPhone 14 Plus - Php 68,990
    [3] iPhone 14 Pro - Php 76,990
    [4] iPhone 14 Pro Max - Php 83,990

    [1] Regular - No discount
    [2] Student - 10%
    [3] PWD - 20%
    [4] Senior Citizen - 30%

    Enter your choice of brand [1-4]: 1
    Enter status [1-4]: 1
    Total bill: 

    4 * 4 = 16 IF's
*/