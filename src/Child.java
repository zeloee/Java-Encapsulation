public class Child {
    // State
    private int[] priceList = { 61990, 68990, 76990, 83990 };
    private double[] discountList = { .0, .1, .2, .3 };
    private double totalBill;

    // Setters (Scope: Public, Type: void, Parameter: should have)
    // To compute the total bill using the selectedBrand and selectedDiscount
    // Formula = price - (price * discount)
    // (brand) 68990 x (discount) .3 = 20,697
    // 68990 - 20,697 = 48,293

    // selectedBrand = 2, selectedDiscount = 4, total = 48,293
    /**
     * @param selectedBrand The brand of the item selected by the user.
     * @param selectedDiscount 1-4
     */
    public void setTotalBill(int selectedBrand, int selectedDiscount) {
        totalBill = priceList[selectedBrand-1] - (priceList[selectedBrand-1] * discountList[selectedDiscount-1]);
    }

    // Getters
    //   Scope: Public, 
    //   Type: String, int, double, so on... except void)
    //   Parameter: No parameter
    /**
     * This function returns the total bill
     * 
     * @return The total bill.
     */
    public double getTotalBill() {
        return totalBill;
    }
}
