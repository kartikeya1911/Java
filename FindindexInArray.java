import java.util.*;

public class FindindexInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number from array: ");
        int num = sc.nextInt();
        int[] a = { 10, 25, 34, 96, 26 };
        int ind = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == num) {
                ind = i;
            } else {
                continue;
            }
        }

        System.out.println(ind);
        sc.close();
    }
}
