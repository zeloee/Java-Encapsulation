import java.util.Scanner;

public class Main {
    
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
       

        Main main = new Main();
        main.startTransaction();
    }
    
    public void startTransaction() {
        System.out.println(displayOptions);
        queryBrand();
        queryStatus();
        displayComputation();


    }

    public void queryBrand(){
        System.out.print("Enter your choice of brand [1-4]: ");
        selectedBrand = sc.nextInt();
    }
    public void queryStatus(){
        System.out.print("Enter your status [1-4]: ");
        selectedDiscount = sc.nextInt();

}

    public void displayComputation() {
        Child child = new Child();
        child.setTotalBill(selectedBrand, selectedDiscount);
        System.out.println("Your total bill is: " + child.getTotalBill());
    }
}

