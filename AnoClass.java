class Animals
{
    void dis()
    {
        System.out.println("In Animals class");
    }
}
public class AnoClass{
    public static void main(String[] args) {
        
        {
            Animals a=new Animals(){
                void dis()
                {
                    super.dis();
                    System.out.println("Hello from Anonymous Class.");
                }
            };
            a.dis();
        }
    }
}