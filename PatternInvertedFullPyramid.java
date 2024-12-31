import java.util.Scanner;

public class PatternInvertedFullPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        pattern(num);
        sc.close();
    }

    public static void pattern(int num) {
        for (int i = num; i > 0; i--) {

            for (int k = 0; k < (num - i); k++) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i-1; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
