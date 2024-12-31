import java.util.Scanner;

//import javax.swing.plaf.synth.SynthOptionPaneUI;

public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number:");

        int num= sc.nextInt();
        sc.nextLine();
        System.out.println("The Number You Choose Is :"+ num);

        System.out.println("what is your name: ");
        String str = sc.nextLine();
        System.out.println("Hello "+ str);
        
        sc.close();
    }
}
