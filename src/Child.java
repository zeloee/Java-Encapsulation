public class Child {
    
    private int [] priceList = { 61990, 68990, 76990, 83990 };
    private double[] discountList = { .0, .1, .2, .3};
    private double totalBill;

    // Formula = price - (price * discount)
    public void setTotalBill(int selectedBrand, int selectedDiscount) {
        totalBill = priceList[selectedBrand-1] - (priceList[selectedBrand-1] * discountList[selectedDiscount-1]);
    }

    public double getTotalBill(){
        return totalBill;
    }
}