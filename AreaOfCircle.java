import java.util.Scanner;
public class AreaOfCircle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int radius = sc.nextInt();
        double area = Area(radius);
        System.out.println("Area of Circle is: "+ area);
        sc.close();
    }

    public static double Area(double radius){
        double area = 3.14 * radius * radius;
        return area;
    }
}
