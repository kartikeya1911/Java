import java.util.Scanner;

public class SecondLargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = sc.nextInt();
        // make an array;
        int[] arr = new int[size];
        // input the elements
        Intake(arr);
        // Printing array
        PrintArr(arr);
        // largest and second larget element
        SecondLargest(arr);
        sc.close();
    }

    // input of array
    public static void Intake(int[] arr) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elemets: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
    }

    // printing the array
    public static void PrintArr(int[] arr) {
        System.out.print("Your array is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // find largest and second largest element
    public static void SecondLargest(int[] arr) {
        int large = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > large) {
                large = arr[i];
            }
        }
        System.out.print("largest element is :" + large);
        System.out.println();

        int SecondLarge = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > SecondLarge && arr[i] != large) {
                SecondLarge = arr[i];
            }
        }
        System.out.print("Second Largest Number in Array is " + SecondLarge + " ");
    }
}