import java.util.*;

public class problem_shopping {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int product1= 200;
            int product2 = 300;
            int product3 = 300;
            int product_price1 = 700;
            int product_price2 = 330;
            int product_price3 = 550;
            int totalCost = 0;



            do {
                System.out.println("available Products:");
                System.out.println("A - Quantity: " + product1+ " Price: Rs. " + product_price1);
                System.out.println("B - Quantity: " + product2 + " Price: Rs. " + product_price2);
                System.out.println("C - Quantity: " + product3 + " Price: Rs. " + product_price3);

                System.out.print("Enter the quantity of product A: ");
                int quantityProductA = scanner.nextInt();
                System.out.print("Enter the quantity of product B: ");
                int quantityProductB = scanner.nextInt();
                System.out.print("Enter the quantity of product C: ");
                int quantityProductC = scanner.nextInt();

                int costProductA = product_price1 * quantityProductA;
                int costProductB = product_price2* quantityProductB;
                int costProductC = product_price3 * quantityProductC;

                totalCost += costProductA + costProductB + costProductC;

                product1 -= quantityProductA;
                product2 -= quantityProductB;
                product3 -= quantityProductC;

                System.out.println("Total Cost: Rs. " + totalCost);

                System.out.print("Do you want to continue shopping? (yes/no): ");
                String continueShopping = scanner.next();

                if (!continueShopping.equalsIgnoreCase("yes")) {
                    break;
                }
            } while (true);

            System.out.println("Your total cost is Rs " + totalCost);
            System.out.println("Please choose a payment option.");
            System.out.println("press 1 for UPI");
            System.out.println("press 2 for credit card");
            System.out.println("press 3 for debit card");
            int n = scanner.nextInt();
            System.out.println("enter number");
            if (n==1||n==2||n==3){
                System.out.println("your  payment has proceed");

            }
            else {
                System.out.println("failed");
            }
            scanner.close();
}
    }

