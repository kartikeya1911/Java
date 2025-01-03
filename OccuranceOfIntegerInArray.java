import java.util.Scanner;

public class OccuranceOfIntegerInArray {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a size of array: ");
        int size=sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter the elements: ");
        intakeArr(arr);
        System.out.print("Your Array is : ");
        printArr(arr);
        System.out.println();
        System.out.print("Integer Occur again in Array: ");
        OccurInt(arr);

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

//printing af array
    public static void printArr(int[] arr){
        for(int i=0;i<arr.length ;i++){
            System.out.print(arr[i]+" ");
        }
    }

//find occurance
    public static void OccurInt(int[] arr){
        int occur=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    occur=arr[i];
                }
                else{
                    continue;
                }

            }
        }
        System.out.println(occur);
    }
}
