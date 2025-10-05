//
//import java.util.*;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner myScanner = new Scanner(System.in);
//        System.out.println("Chose your sandwich size 1 or 2");
//        System.out.println("1 - Regular ($5.45)");
//        System.out.println("2 - Large ($8.95)");
//        System.out.println("Enter 1 or 2: ");
//        int size = myScanner.nextInt();
//
//        double price = 0;
//        if (size == 1) {
//            price = 5.45;
//        } else if (size == 2) {
//            price = 8.95;
//        }
//
//        System.out.println("Enter your age");
//        int age = myScanner.nextInt();
//        if (age <= 17) {
//            price = price - price * 0.1;
//        } else if (age >= 65){
//            price = price - price * 0.2;
//    }
//        System.out.printf(" Your total is with a discount: $%.2f%n" ,price);
//        myScanner.close();
//    }
//}





// =====================Exrecise 2=================
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Choose your sandwich size:");
        System.out.println("1 - Regular ($5.45)");
        System.out.println("2 - Large ($8.95)");
        System.out.print("Enter 1 or 2: ");
        int size = myScanner.nextInt();

        double price = 0.0;


        if (size == 1) {
            price = 5.45;
        }
        if (size == 2) {
            price = 8.95;
        }

        // loaded? (true/false)
        System.out.print("Would you like your sandwich loaded? (true/false): ");
        boolean loaded = myScanner.nextBoolean();

        // add loaded cost
        if (loaded && size == 1) {        // regular
            price = price + 1.00;
        }
        if (loaded && size == 2) {        // large
            price = price + 1.75;
        }

        // age + discounts
        System.out.print("Enter your age: ");
        int age = myScanner.nextInt();

        if (age <= 17) {
            price = price - (price * 0.10);   // 10% off
        }
        if (age >= 65) {
            price = price - (price * 0.20);   // 20% off
        }

        // print total to 2 decimals
        System.out.printf("Your total is: $%.2f%n", price);

        myScanner.close();
    }
}
