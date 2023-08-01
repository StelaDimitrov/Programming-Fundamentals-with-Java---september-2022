package DataTypesAndVariables.Lab;

import java.util.Scanner;

public class p01ConvertMetersToKilometers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        short meter = Short.parseShort(scanner.nextLine());

        double km = meter / 1000.0;

          System.out.printf("%.2f",km);

        
        




    }
}
