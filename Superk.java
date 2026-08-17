class Parent{
    void display()
    {
        System.out.println("Parent Class method");
    }
}
 class Child extends Parent{
    void diplay() {
        super.display();
        System.out.println("Child class method");
    }
 }

public class Superk
 {
   public static void main(String[] args) {
    Child c = new Child();
    c.display();
   }
}
