import java.util.Scanner;

public class PatternInvertedRightHalfPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        pattern(num);
        sc.close();
    }


    public static void pattern(int num){
        for(int i=num-1;i>=0;i--){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
