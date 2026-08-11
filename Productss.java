
interface Product {
    String retailer = "Star Bazzar";

    void display();
}

class Electronic implements Product {
    String name = "Mobile";
    int price = 20000;

    public void display() {
        System.out.println("Electronic: " + name);
        System.out.println("Price: Rs." + price);
        System.out.println("Retailer: " + retailer);
        System.out.println();
    }
}

class Clothing implements Product {
    String name = "T-Shirt";
    int price = 1000;

    public void display() {
        System.out.println("Clothing: " + name);
        System.out.println("Price: Rs." + price);
        System.out.println("Retailer: " + retailer);
        System.out.println();
    }
}

class Grocery implements Product {
    String name = "Rice";
    int price = 500;

    public void display() {
        System.out.println("Grocery: " + name);
        System.out.println("Price: Rs." + price);
        System.out.println("Retailer: " + retailer);
        System.out.println();
    }
}

public class Productss{
    public static void main(String[] args) {

        Electronic e = new Electronic();
        Clothing c = new Clothing();
        Grocery g = new Grocery();

        e.display();
        c.display();
        g.display();
    }
}