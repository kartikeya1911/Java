import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();

        int temp;
        temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("Your first number is : " + num1);
        System.out.println("Your Second number is : " + num2);
        sc.close();
    }
}
