import java.util.Scanner;

public class PatternDiamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        pattern(num);
        sc.close();
    }

    public static void pattern(int num) {

        for (int i = num; i > 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }

            for (int k = num; k > i; k--) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = 0; i < num; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }

            for (int k = num; k > i; k--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
