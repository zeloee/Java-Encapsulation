import java.util.Scanner;

public class Condition {
    public static void main(String[] args) throws Exception {
        System.out.println("\n==============================\n");
        int num1 = 4;
        String result = (num1 == 1) ? "One" : (num1 == 2) ? "Two" : "Not one or two";

        System.out.println("Result: " + result);

        Scanner sc = new Scanner(System.in);
        int itemPrice = 0;
        double itemDiscount = 0;
        double totalPrice = 0;

        System.out.print("Choose an item: ");
        String chosenItem = sc.nextLine();

        System.out.print("Choose a discount: ");
        String chosenDiscount = sc.nextLine();

        switch(chosenItem) {
            case "1" -> { itemPrice = 100_000; }
            case "2" -> { itemPrice = 120_000; }
            case "3" -> { itemPrice = 140_000; }
            case "4" -> { itemPrice = 160_000; }
        }

        switch(chosenDiscount) {
            case "1" -> { itemDiscount = 0; }
            case "2" -> { itemDiscount = .1; }
            case "3" -> { itemDiscount = .2; }
            case "4" -> { itemDiscount = .3; }
        }

        totalPrice = itemPrice - (itemPrice * itemDiscount);
        System.out.println("Total Price: " + totalPrice);

        System.out.println("\n==============================\n");
    }
}

/*
 * 
 * Choose an iPhone:
 * [1] iPhone 10 - Php 100,000
 * [2] iPhone 10 Pro - Php 120,000
 * [3] iPhone 10 Plus Pro - Php 140,000
 * [4] iPhone 10 Pro Max - Php 160,000
 * 
 * Choose a discount:
 * [1] No discount
 * [2] 10%
 * [3] 20%
 * [4] 30%
 * 
 */
