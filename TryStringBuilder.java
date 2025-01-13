//import java.util.*;

public class TryStringBuilder {
    public static void main(String[] args) {
        String str="";
        // for(char ch='A';ch<='Z';ch++){
        //     str=str+ch;
        // }

        // System.out.println(str);

        StringBuilder sb=new StringBuilder();
        for(char ch='A';ch<='Z';ch++){
            sb=sb.append(ch);
        }
        str=sb.toString();
        System.out.println(str);
    }
}
