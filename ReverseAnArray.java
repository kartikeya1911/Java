import java.util.Scanner;

public class ReverseAnArray {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a size of array: ");
        int size=sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter the elements: ");
        intakeArr(arr);
        System.out.print("Array is : ");
        printArr(arr);
        System.out.println("Reverse of array: ");
        Reverse(arr);
        printArr(arr);
        sc.close();
    }
//intake of array
    public static void intakeArr(int[] arr){
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
    }

//printing of array
    public static void printArr(int[] arr){
        for(int i=0;i<arr.length ;i++){
            System.out.print(arr[i]+" ");
        }
    }

//reversing of array
    public static void Reverse(int[] arr){
        for(int i=0;i<arr.length/2;i++){
            int temp;
            temp=arr[i];
            arr[i]=arr[arr.length-i-1];
            arr[arr.length-i-1]=temp;
        }
        System.out.println();
    }
   

}
