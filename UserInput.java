import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object
        
        System.out.println("Enter your name:");
        String name = sc.nextLine(); // Read user input
        
        System.out.println("Hello, " + name + "!"); // Display the input
        
        sc.close(); // Close the Scanner
    }
}
