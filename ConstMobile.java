class Mobile {

    String brand;
    String model;
    double price;

    // Default Constructor
    Mobile() {
        brand = "Unknown";
        model = "Unknown";
        price = 0.0;
    }

    // Parameterized Constructor
    Mobile(String b, String m, double p) {
        brand = b;
        model = m;
        price = p;
    }

    // Copy Constructor
    Mobile(Mobile other) {
        brand = other.brand;
        model = other.model;
        price = other.price;
    }

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: Rs. " + price);
    }
}

public class ConstMobile {

    public static void main(String[] args) {

        // Default Constructor
        Mobile m1 = new Mobile();

        // Parameterized Constructor
        Mobile m2 = new Mobile("Samsung", "Galaxy S24", 75000);

        // Copy Constructor
        Mobile m3 = new Mobile(m2);

        System.out.println("Default Mobile:");
        m1.display();

        System.out.println("\nOriginal Mobile:");
        m2.display();

        System.out.println("\nDuplicate Mobile Record:");
        m3.display();
    }
}