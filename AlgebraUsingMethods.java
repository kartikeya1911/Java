import java.util.Scanner;

class Algebra {
    int add(int x, int y) {
        return x + y;
    }

    int sub(int x, int y) {
        return x - y;
    }

    int multiply(int x, int y) {
        return x * y;
    }

    int div(int x, int y) {
        return x / y;
    }
}

public class AlgebraUsingMethods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        Algebra obj1 = new Algebra();
        System.out.println(obj1.multiply(a, b));

        sc.close();
    }
}
