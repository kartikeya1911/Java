import java.util.Scanner;

public class PatternHollowSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        pattern(num);
        sc.close();
    }

    public static void pattern(int num){
//first straight line
        for(int i=0;i<num;i++){
            System.out.print("* ");
        }
        System.out.println();

//middle portion
        for(int i=0;i<num-2;i++){
            System.out.print("* ");
            for(int j=num-2;j>0;j--){
                System.out.print("  ");
            }
            System.out.println("* ");
        }

//last straight line
        for(int i=0;i<num;i++){
            System.out.print("* ");
        }
    }
}
