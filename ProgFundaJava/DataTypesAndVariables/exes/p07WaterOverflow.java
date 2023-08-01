package DataTypesAndVariables.exes;

import java.util.Scanner;

public class p07WaterOverflow {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int waterTank = 255;

        int numbersOfLine = Integer.parseInt(scanner.nextLine());

        int sumLiters = 0;
        while (numbersOfLine > 0) {
            int liters = Integer.parseInt(scanner.nextLine());
            if (liters < waterTank) {
                sumLiters += liters;
                numbersOfLine = numbersOfLine -1;

            } else {

                System.out.println("Insufficient capacity!");
            }
        }
    }
}
