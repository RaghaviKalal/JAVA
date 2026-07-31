class Animal {
    private String message ="Dog Barks (from outer class)";

    class Dog{
        void display(){
            System.out.println("Message: " +  message);
        }
    }
    
}
public class DogAnonymousDemo{
    public static void main(String[] args) {
        
      Animal obj=new Animal ();
      Animal.Dog in=obj.new Dog();
      in.display();

    }
}

