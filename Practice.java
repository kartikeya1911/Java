import java.util.Scanner;
public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");;
        int num=sc.nextInt();
        BinaryInt(num);
        sc.close();
    }


    public static void BinaryInt (int num){
        int[] A = new int[1000];
        int i=0;

        while(num>0){
            A[i]=num%2;
            num=num/2;
            i++;
        }

        for(int j=i-1;j>=0;j--){
            System.out.print(A[j]);
        }
    }
}
