//input 1234
//output 2345
public class Add1InEachint{
    public static void main(String[] args) {
        int n = 1234;
        int sum = 0;
        while(n>0){
            int rem = n%10;
            sum = sum + rem;
            n = n/10;
            }
            return sum;
            }
            public static void main(String[] args) {
                int n = 12345;
                System.out.println(sumOfDigits(n));
                }
}