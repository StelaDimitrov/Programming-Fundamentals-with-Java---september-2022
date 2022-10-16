package Methods.Lab;

import java.util.Scanner;

public class p05Orders {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();

        int numberOfProduct = Integer.parseInt(scanner.nextLine());

      numOfProduct(product,numberOfProduct);

      double price = numOfProduct(product,numberOfProduct);

        System.out.printf("%.2f", price);




    }
    public static double numOfProduct (String product, int number){

        double price = 0;

        switch (product){

            case "coffee":
                price = 1.50 * number;
                break;
            case "water":
                price = 1.00 * number;
                break;
            case "coke":
                price = 1.40 * number;
                break;
            case "snacks":
                price = 2.00 * number;
                break;
        }
        return price;



    }
}
