import java.util.Scanner;

public class ComplexAddition {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for the first complex number
        System.out.println("Enter the real part of the first complex number: ");
        int real1 = sc.nextInt();
        System.out.println("Enter the imaginary part of the first complex number: ");
        int imag1 = sc.nextInt();

        // Input for the second complex number
        System.out.println("Enter the real part of the second complex number: ");
        int real2 = sc.nextInt();
        System.out.println("Enter the imaginary part of the second complex number: ");
        int imag2 = sc.nextInt();

        // Add the real and imaginary parts
        int sumReal = real1 + real2;
        int sumImaginary = imag1 + imag2;

        // Display the result
        System.out.println("The sum of the two complex numbers is: " + sumReal + " + " + sumImaginary + "i");

        sc.close();
    }
}
