abstract class FoodOrder {
    abstract void calculateBill();
}

class DineInOrder extends FoodOrder {
    void calculateBill() {
        int foodPrice = 500;
        int serviceCharge = 50;
        int total = foodPrice + serviceCharge;

        System.out.println("Dine-In Order");
        System.out.println("Total Bill = Rs. " + total);
    }
}

class TakeAwayOrder extends FoodOrder {
    void calculateBill() {
        int foodPrice = 500;
        int packingCharge = 30;
        int total = foodPrice + packingCharge;

        System.out.println("Take-Away Order");
        System.out.println("Total Bill = Rs. " + total);
    }
}

public class AbsFoodOrder
 {
    public static void main(String[] args) {
        FoodOrder order1 = new DineInOrder();
        FoodOrder order2 = new TakeAwayOrder();

        order1.calculateBill();
        order2.calculateBill();
    }
}
