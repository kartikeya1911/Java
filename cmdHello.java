// public class cmdlinearg {
//     public static void main(String[] args) {
//         // int f = fact(n:5);
//         System.out.println("len = " + args.length);
//         for(int i = 0 ; i <args.length; i++){
//             System.out.println("Hello "+args[i]);
//         }
//     }
// }


//factorial
// public class cmdHello {
//     public static void main(String[] args) {
        
//         if (args.length < 1) {
//             System.out.println("Please provide a number as a command-line argument.");
//             return;
//         }

//         int num = Integer.parseInt(args[0]);
        
//         // Calculate factorial
//         int result = fact(num);
//         System.out.println("Factorial of " + num + " is " + result);
//     }

//     public static int fact(int num) {
//         int fact = 1;
//         for (int i = 1; i <= num; i++) {
//             fact *= i;
//         }
//         return fact;
//     }
// }


//add
public class cmdHello {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 0; i<args.length;i++){
            int arr = Integer.parseInt(args[i]);
            sum = sum+arr;
        }
        System.out.println("Sum: "+ sum);

    }
}
