import java.util.Scanner;

public class PatternFullPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        pattern(num);
        sc.close();
    }

    public static void pattern(int num) {
        for (int i = 0; i < num; i++) {

            for (int k = 0; k < (num - i)- 1; k++) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}