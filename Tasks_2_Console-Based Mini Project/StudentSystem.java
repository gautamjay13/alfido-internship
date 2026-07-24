import java.util.Scanner;

public class StudentSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Arrays to store student data
        String[] names = new String[5];
        int[] marks = new int[5];
        int studentCount = 0;

        System.out.println("--- Welcome to Student Management System ---");

        while (true) {
            System.out.println("\n1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            if (choice == 1){
                if (studentCount < 5) {
                    System.out.print("Enter Student Name: ");
                    names[studentCount] = sc.nextLine();

                    System.out.print("Enter Marks: ");
                    marks[studentCount] = sc.nextInt();
                    sc.nextLine(); // IMPORTANT FIX

                    studentCount++;
                    System.out.println("Student added successfully!");
                } else {
                    System.out.println("System Full! Cannot add more students.");
                }
            }

            else if (choice == 2) {
                if (studentCount == 0) {
                    System.out.println("No records found.");
                } else {
                    System.out.println("\n--- Student Records ---");
                    for (int i = 0; i < studentCount; i++) {
                        String result = (marks[i] >= 35) ? "Pass" : "Fail";
                        System.out.println("Name: " + names[i] +
                                           " | Marks: " + marks[i] +
                                           " | Result: " + result);
                    }
                }
            }

            else if (choice == 3) {
                System.out.println("Exiting System. Goodbye!");
                break;
            }

            else {
                System.out.println("Invalid choice! Please try again.");
            }
        }

        sc.close();
    }
}