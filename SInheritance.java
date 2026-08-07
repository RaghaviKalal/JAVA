class Animal{
    void eat(){
        System.out.println("This animal eats food");

    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Dog barks");
    }
}
    
    
    
    public class SInheritance {
    public static void main(String[] args){
        Dog d= new Dog();
        Animal a=new Animal();
        d.eat();
        d.bark();
    }

}
