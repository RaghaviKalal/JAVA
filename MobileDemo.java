class Mobile {
 String brand;
 String model;
 int price;
 // Default Constructor
 Mobile() {
 brand = "Unknown";
 model = "Unknown";
 price = 0;
 }
 // Parameterized Constructor
 Mobile(String b, String m, int p) {
 brand = b;
 model = m;
 price = p;
 }
 // Copy Constructor
 Mobile(Mobile obj) {
 brand = obj.brand;
 model = obj.model;
 price = obj.price;
 }
 void display() {
 System.out.println("Brand: " + brand);
 System.out.println("Model: " + model);
 System.out.println("Price: " + price);
 }
}
public class MobileDemo {
 public static void main(String[] args) {
 Mobile m1 = new Mobile(); // Default Constructor
 Mobile m2 = new Mobile("Samsung", "Galaxy S24", 75000); // Parameterized
//Constructor
 Mobile m3 = new Mobile(m2); // Copy Constructor
 System.out.println("Default Constructor:");
 m1.display();
 System.out.println("\nParameterized Constructor:");
 m2.display();
 System.out.println("\nCopy Constructor:");
 m3.display();
 }
}
