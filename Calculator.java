import java.util.Scanner;
public class Calculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //first number
        System.out.println("Enter Your First Number: ");
        double num1= sc.nextDouble();
        //sc.nextLine();

        //Second number
        System.out.println("Enter Your Second Number: ");
        double num2 = sc.nextDouble();
        //sc.nextLine();

        // operation selection
        System.out.println("Enter Your operation( + , - , * , / ): ");
        char oper = sc.next().charAt(0);
        //sc.nextLine();

        double result = 0;

        switch (oper) {
            case '+':
                result=num1+num2;
                break;
            
            case '-':
                result=num1-num2;
                break;

            case '*':
                result=num1*num2;
                break;

            case '/':
                result=num1/num2;
                break;
            default:
                System.out.println("Invalid number");
                break;
        }

        System.out.println("The Result is : "+ result);
        sc.close();
    }
}
