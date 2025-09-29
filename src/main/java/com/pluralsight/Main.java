//
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner myScanner = new Scanner(System.in); //
//
//        // Prompt for sandwich size
//        System.out.print("Enter sandwich size (1 for Regular, 2 for Large): ");
//        int size = myScanner.nextInt();
//
//        double price;
//        String sizeName;
//        if (size == 1) {
//            price = 5.45;
//            sizeName = "Regular";
//        } else if (size == 2) {
//            price = 8.95;
//            sizeName = "Large";
//        } else {
//            System.out.println("Invalid size selected.");
//            return;
//        }
//
//        // Asking for age
//        System.out.print("Enter your age: ");
//        int age = myScanner.nextInt();
//
//        // Apply discount
//        if (age <= 17) {
//            price = price - (price * 0.10); // 10% discount
//        } else if (age >= 65) {
//            price = price - (price * 0.20); // 20% discount
//        }
//
//        // Display final cost
//        System.out.printf("You ordered a %s sandwich. The price with a discount applied is: $%.2f%n",
//                sizeName, price);
//
//        myScanner.close();
//    }
//}
//
//
//

// ================ EXERCISE 2 ======


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        // Prompt for sandwich size
        System.out.print("Enter sandwich size (1 for Regular, 2 for Large): ");
        int size = myScanner.nextInt();

        double price;
        String sizeName;
        if (size == 1) {
            price = 5.45;
            sizeName = "Regular";
        } else if (size == 2) {
            price = 8.95;
            sizeName = "Large";
        } else {
            System.out.println("Invalid size selected.");
            return;
        }

        // Asking if they want to load sandwich
        System.out.print("Do you want it loaded? (yes/no): ");
        String loadedAnswer = myScanner.next(); // reads one word like "yes"
        boolean loaded = loadedAnswer.equalsIgnoreCase("yes"); //


        if (loaded) {
            if (size == 1) {
                price = price + 1.00; // regular loaded extra
            } else {
                price = price + 1.75; // large loaded extra
            }
        }

        // Ask for age
        System.out.print("Enter your age: ");
        int age = myScanner.nextInt();

        // Apply discount
        if (age <= 17) {
            price = price - (price * 0.10); // 10% discount
        } else if (age >= 65) {
            price = price - (price * 0.20); // 20% discount
        }

        // Display final cost
        System.out.printf("You ordered a %s sandwich. The price with a discount applied is: $%.2f%n",
                sizeName, price);

        myScanner.close();
    }
}



