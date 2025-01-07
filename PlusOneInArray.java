import java.util.Scanner;

public class PlusOneInArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a size of array: ");
        int size=sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter the elements: ");
        intakeArr(arr,sc);
        System.out.print("Your Array is : ");
        printArr(arr);

        sc.close();
    }
//intake of array
    public static void intakeArr(int[] arr,Scanner sc){
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
    }

//printing af array
    public static void printArr(int[] arr){
        for(int i=0;i<arr.length ;i++){
            System.out.print(arr[i]+" ");
        }
    }

//adding 1 in sum of array
    public static void Adding(int[] arr){
        for(int i=arr.length;i>0;i--){
            if(arr[i]==9)
        }
    }
}
