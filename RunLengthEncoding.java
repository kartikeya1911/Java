import java.util.*;

public class RunLengthEncoding {
    public static String encode(String input) {
        StringBuilder encoded = new StringBuilder(); 
        int n = input.length();

        for (int i = 0; i < n; i++) {
            int count = 1;
            while (i + 1 < n && input.charAt(i) == input.charAt(i + 1)) {
                count++;
                i++;
            }  
            encoded.append(input.charAt(i));
            encoded.append(count);
        }
        return encoded.toString();
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter fax-String:-");
        String input = sc.nextLine();
        String encoded = encode(input);
        System.out.println("Encoded String: " + encoded);

        sc.close();
    }
}
 