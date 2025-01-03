import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Size of first array
        System.out.print("Enter a size of first array: ");
        int size1 = sc.nextInt();

        // First array declaration
        int[] arr = new int[size1];

        // Intake of first array
        System.out.print("Enter the elements: ");
        intakeArr(arr, sc);

        // Printing of first array
        System.out.print("Your Array is: ");
        printArr(arr);

        // Size of second array
        System.out.print("Enter a size of Second array: ");
        int size2 = sc.nextInt();

        // Second array declaration
        int[] brr = new int[size2];

        // Intake of second array
        System.out.print("Enter the elements: ");
        intakeArr(brr, sc);

        // Printing of second array
        System.out.print("Your Array is: ");
        printArr(brr);

        // Merged array
        int[] crr = new int[size1 + size2];
        mergeArray(arr, brr, crr);

        // Print merged array
        System.out.print("Merged Array is: ");
        printArr(crr);

        sc.close();
    }

    // Intake of array elements
    public static void intakeArr(int[] arr, Scanner sc) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

    // Printing of array elements
    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Merging two arrays
    public static void mergeArray(int[] arr, int[] brr, int[] crr) {
        for (int i = 0; i < arr.length; i++) {
            crr[i] = arr[i];
        }
        for (int i = 0; i < brr.length; i++) {
            crr[arr.length + i] = brr[i];
        }
    }
}