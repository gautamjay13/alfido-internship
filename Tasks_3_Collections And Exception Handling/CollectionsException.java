import java.util.*;

// Requirement: Custom Exception (Basic Level)
class InvalidEmployeeIDException extends Exception {
    public InvalidEmployeeIDException(String message) {
        super(message);
    }
}

public class CollectionsException {
    public static void main(String[] args) 
    {
        // Requirement: Use ArrayList, HashMap, and HashSet
        List<String> employeeList = new ArrayList<>();
        Map<Integer, String> employeeMap = new HashMap<>();
        Set<String> departments = new HashSet<>();

        Scanner sc = new Scanner(System.in);

        try {
            // 1. ArrayList: Sequence maintain karne ke liye
            employeeList.add("Sakshi");
            employeeList.add("Amit");
            employeeList.add("Rahul");

            // 2. HashMap: ID wise data mapping ke liye
            employeeMap.put(101, "Sakshi");
            employeeMap.put(102, "Amit");
            employeeMap.put(103, "Rahul");

            // 3. HashSet: Unique departments store karne ke liye
            departments.add("IT");
            departments.add("HR");
            departments.add("IT"); // Duplicate (HashSet ise automatically ignore karega)

            System.out.println("--- Employee Management System ---");
            System.out.println("Available Departments: " + departments);
            System.out.println("All Employees: " + employeeList);

            System.out.print("\nEnter Employee ID to fetch details: ");
            int id = sc.nextInt();

            if (!employeeMap.containsKey(id)) {
                throw new InvalidEmployeeIDException("Access Denied: Employee ID " + id + " does not exist.");
            } else {
                System.out.println("Success! Employee Name: " + employeeMap.get(id));
            }

        } 
        catch (InvalidEmployeeIDException e) 
        {
            System.out.println(e.getMessage());
        } 
        catch (InputMismatchException e) 
        {
            System.out.println("Error: Invalid input format. Please enter a numeric ID.");
        } 
        finally 
        {
            System.out.println("\n--- Session Ended ---");
            sc.close();
        }
    }
}
