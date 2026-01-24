package T9Q4;

public class Main{
    public static void main(String[] args) {
        PurchaseSystem p1 = new PurchaseSystem(null, 1.5, 3);
        SugarPurchase p2 = new SugarPurchase(null, 2, 100, 2);
        
        p1.displayTotalPrice();
        p2.displayTotalPrice();
    }
}