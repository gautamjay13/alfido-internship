import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling 
{
    public static void main(String[] args) 
    {
        String fileName = "EmployeeData.txt";
        String contentToWrite = "Employee ID: 101\nName: Sakshi Jamdade\nDepartment: IT";

        // Requirement: Writing data using FileWriter
        try (FileWriter writer = new FileWriter(fileName)) 
        {
            writer.write(contentToWrite);
            System.out.println("Success: Data written to " + fileName);
        } 
        catch (IOException e) 
        {
            System.err.println("Error writing to file: " + e.getMessage());
        }

        System.out.println("\n--- Reading Data from File ---");

        // Requirement: Reading data using FileReader
        try (FileReader reader = new FileReader(fileName)) 
        {
            int character;
            while ((character = reader.read()) != -1) 
            {
                System.out.print((char) character);
            }
            System.out.println("\n\nSuccess: File reading complete.");
        } 
        catch (IOException e) 
        {
            System.err.println("Error reading from file: " + e.getMessage());
        }
    }
}