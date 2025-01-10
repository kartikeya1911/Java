import java.util.Scanner;

public class Bank {
    // Defining variables for person and account details
    private static String name;
    private static String address;
    private static double accountNumber;
    private static double balance;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        person(sc);
        accountDetails(sc);

        // Displaying main menu for transaction
        while (true) {
            System.out.println("\nSelect an operation:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. View Statement");
            System.out.println("4. Exit");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    transaction(sc, 'd');
                    break;
                case 2:
                    transaction(sc, 'w');
                    break;
                case 3:
                    statement();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid option! Please try again.");
            }
        }
    }

    // input personal details
    public static void person(Scanner sc) {
        System.out.print("Enter your name: ");
        name = sc.nextLine();

        System.out.print("Enter your address: ");
        address = sc.nextLine();
    }

    // input account details
    public static void accountDetails(Scanner sc) {
        System.out.print("Enter your account number: ");
        accountNumber = sc.nextDouble();

        System.out.print("Enter your previous balance: ");
        balance = sc.nextDouble();
    }

    // transactions (Deposit/Withdraw)
    public static void transaction(Scanner sc, char transactionType) {
        if (transactionType == 'd') {
            System.out.print("Enter deposit amount: ");
            double depositAmount = sc.nextDouble();
            balance += depositAmount;
            System.out.println("Deposited: " + depositAmount);
        } else if (transactionType == 'w') {
            System.out.print("Enter withdrawal amount: ");
            double withdrawAmount = sc.nextDouble();
            if (withdrawAmount <= balance) {
                balance -= withdrawAmount;
                System.out.println("Withdrawn: " + withdrawAmount);
            } else {
                System.out.println("Insufficient balance!");
            }
        }
    }

    // display account statement
    public static void statement() {
        System.out.println("\nAccount Statement:");
        System.out.println("Account Holder: " + name);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Address: " + address);
        System.out.println("Current Balance: " + balance);
    }
}
