import java.util.Scanner;

public class MinimumOfArray {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a size of array: ");
        int size=sc.nextInt();
        int[] arr = new int[size];

        System.out.print("Enter the elements: ");
        intakeArr(arr);

        System.out.print("Array is : ");
        printArr(arr);
        System.out.print("minimum of array is : ");
        MinArr(arr);
        sc.close();
    }
//input of array
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
        System.out.println();
    }

    public static void MinArr(int[] arr){
        int min=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    min=arr[i];
                }
                else{
                    continue;
                }
            }
        }
        System.out.print(min);
    }
}
