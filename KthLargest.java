import java.util.Scanner;

public class KthLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter the elements: ");
        intakeArr(arr,sc);

        System.out.print("Your Array is : ");
        printArr(arr);
        System.out.println();

        // ascending array
        AscendingArray(arr);

        // fetch Kth largest
        KthNumber(arr,sc);
        sc.close();
    }

    // intake of array
    public static void intakeArr(int[] arr ,Scanner sc) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

    // printing af array
    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    //Ascending array
    public static void AscendingArray(int[] arr) {
        System.out.print("Ascending order: ");
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }
            }
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

//fetching Kth largest number
    public static void KthNumber(int[] arr,Scanner sc){
        System.out.print("Enter the value of K: ");
        int k=sc.nextInt();
        System.out.println("Kth largest number is : ");
        System.out.println(arr[arr.length-k]);
    }
}