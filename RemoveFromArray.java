import java.util.*;

public class RemoveFromArray {
    public static void main(String[] args) {

        // Initial array and element to remove
        int[] arr = {1, 2, 3, 4, 5};
        int rem = 3; // Element to remove
        int[] brr = new int[arr.length - 1]; // New array to hold result
        int j = 0; // Index for new array

        // Loop through the original array and copy all elements except the one to remove
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != rem) {
                brr[j++] = arr[i]; // Add to new array
            }
        }

        // Print the new array
        System.out.println("Array after removing " + rem + ":");
        for (int num : brr) {
            System.out.print(num+" ");
        }
    }
}
