import java.util.*;

public class StringsFunction {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str=sc.nextLine();
        //find char at index in string
        System.out.println(str.charAt(3));// => index starts at 0 output is't'
        //find length of string
        System.out.println(str.length()); // length include the space
        //find index of char
        System.out.println(str.indexOf('j'));



        sc.close();
    }
}
