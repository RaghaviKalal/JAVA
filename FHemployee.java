import java.io.*; 
 
public class FHemployee{ 
    public static void main(String[] args) { 
        try { 
            FileWriter writer = new FileWriter("employee.txt"); 
 
            writer.write("Employee ID: 101\n"); 
            writer.write("Name: Raghavi\n"); 
            writer.write("Department: Computer Science\n"); 
            writer.write("Salary: 40000\n"); 
 
            writer.close(); 
 
            FileReader reader = new FileReader("employee.txt"); 
            BufferedReader br = new BufferedReader(reader); 
 
            String line; 
 
            System.out.println("Employee Details:"); 
 
            while ((line = br.readLine()) != null) { 
                System.out.println(line); 
            } 
 
            br.close(); 
        } 
        catch (IOException e) { 
            System.out.println("Error: " + e.getMessage()); 
        } 
    } 
}