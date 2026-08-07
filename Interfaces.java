interface Animal{
    void sound();

}
class Dog implements Animal{
    public void sound()
    {
        System.out.println("Dog barks");
    }
}

public class Interfaces {
    public static void main(String[] args){
        Dog d1=new Dog();
        d1.sound();
    }
    
}
