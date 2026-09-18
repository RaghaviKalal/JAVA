public class Restaurant {
 static int orders = 0;
 void bill(int amount) {
 orders++;
 System.out.println("Dine-in Bill = " + amount);
 }
 void bill(float amount) {
 orders++;
 System.out.println("Takeaway Bill = " + amount);
 }
 void bill(int amount, int charge) {
 orders++;
 System.out.println("Delivery Bill = " + (amount + charge));
 }
 public static void main(String args[]) {
 Restaurant r = new Restaurant();
 r.bill(500);
 r.bill(300.5f);
 r.bill(400, 50);
 System.out.println("Total Orders = " + orders);
 }
}