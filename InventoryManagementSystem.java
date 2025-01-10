/*
 Build a program to manage a store's inventory:

Product: Add, update, and delete products with attributes like ID, name, quantity, and price.
Transaction: Allow purchase (reduce stock) or restock of products.
Report: Generate a report showing all products with stock levels and total inventory value.
 */
import java.util.Scanner;
public class InventoryManagementSystem {
    private static int productID;
    private static int quantity=0; 
    

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Product(sc);
        transactions(sc);

        sc.close();
    }
//product id and quantity
    public static void Product(Scanner sc){
        System.out.println("enter product id: ");
        int productID=sc.nextInt();

        System.out.println("Enter the quanity: ");
        int quantity=sc.nextInt();
    }

    public static void transactions (Scanner sc){
        System.out.println("press(1) for purchase or press(2) for sell");
        int choose=sc.nextInt();

        if(choose==1){
            System.out.println("FOR PURCHASE:- ");

            System.out.println("enter the quantity: ");
            int quantity=sc.nextInt();

            System.out.println("Enter the price of purchase");
            int price=sc.nextInt();
        }
        else if(choose==2){
            System.out.println("FOR SELL:- ");

            System.out.println("enter the quantity: ");
            int quantity=sc.nextInt();

            System.out.println("Enter the price of selling");
            int price=sc.nextInt();

        }
        else{
            System.out.println("invalid choice");
            
        }
    }



}
