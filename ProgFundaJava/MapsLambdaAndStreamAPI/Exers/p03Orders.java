package MapsLambdaAndStreamAPI.Exers;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class p03Orders {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, Double> products = new LinkedHashMap<>();


        while (!input.equals("buy")) {

            String product = input.split(" ")[0];
            double pricePerProduct = Double.parseDouble(input.split(" ")[1]);
            int quality = Integer.parseInt(input.split(" ")[2]);
            double totalPrice = pricePerProduct * quality;

            if (!products.containsKey(product)) {

                products.put(product, totalPrice);
            } else {
                products.put(product, products.get(product) + totalPrice);
            }

            input = scanner.nextLine();
        }
        products.forEach((k, v) -> System.out.printf("%s -> %.2f%n", k, v));

    }
}
