public class Calculator {
 static int count = 0;
 int add(int a, int b) {
 count++;
 return a + b;
 }
 float add(float a, float b) {
 count++;
 return a + b;
 }
 public static void main(String[] args) {
 Calculator c = new Calculator();
 System.out.println("Integer Addition: " + c.add(10, 20));
 System.out.println("Float Addition: " + c.add(10.5f, 20.5f));
 System.out.println("Total Calculations: " + count);
 }
}