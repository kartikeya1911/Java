import java.util.Scanner;

class cars{
    void toyota(){
        System.out.println("specs of TOYOTA are:-");
        System.out.println("car year is : 2010");
        System.out.println("top speed: 220");
        System.out.println();
    }

    void honda(){
        System.out.println("specs of HONDA are:-");
        System.out.println("car year is : 2015");
        System.out.println("top speed: 200");
        System.out.println();
    }

    void audi(){
        System.out.println("specs of AUDI are:-");
        System.out.println("car year is : 2022");
        System.out.println("top speed: 320");
        System.out.println();
    }
}


public class CarsUsingMethods {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        cars obj1=new cars();
        obj1.toyota();
        obj1.audi();
        obj1.honda();

        sc.close();
    }
}
