import java.util.Scanner;

public class AscendingArray {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a size of array: ");
        int size=sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter the elements: ");
        intakeArr(arr);
        System.out.print("Array is : ");
        printArr(arr);
        System.out.print("Ascending order os array is :");
        Ascending(arr);
        printArr(arr);
        sc.close();
    }

    public static void intakeArr(int[] arr){
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
    }


    public static void printArr(int[] arr){
        for(int i=0;i<arr.length ;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void Ascending(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println();
    }
}
