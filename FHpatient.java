import java.io.*;

public class FHpatient {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("patient.txt");

            writer.write("Patient ID: 201\n");
            writer.write("Name: Ananya\n");
            writer.write("Age: 19\n");
            writer.write("Diagnosis: Fever\n");

            writer.close();

            FileReader reader = new FileReader("patient.txt");
            BufferedReader br = new BufferedReader(reader);

            String line;

            System.out.println("Patient Details:");

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