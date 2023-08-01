package MidExamPreparation;

import java.util.Scanner;

public class p01GuineaPig {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double foodQuantityKg = Double.parseDouble(scanner.nextLine());
        double hayQuantityKg = Double.parseDouble(scanner.nextLine());
        double coverQuantityKg = Double.parseDouble(scanner.nextLine());
        double guineaWeightKg = Double.parseDouble(scanner.nextLine());

        double foodQuantityGr = foodQuantityKg * 1000;
        double hayQuantityGr = hayQuantityKg * 1000;
        double coverQuantityGR = coverQuantityKg * 1000;
        double guineaWeightGr = guineaWeightKg * 1000;

        boolean isNotEnough = false;
        for (int day = 1; day <= 30; day++) {

            foodQuantityGr = foodQuantityGr - 300;

            if (day % 2 == 0) {
                double currentHay = foodQuantityGr * 0.05;
                hayQuantityGr = hayQuantityGr - currentHay;
            }

            if (day % 3 == 0) {

                double currentCover = guineaWeightGr / 3;
                coverQuantityGR = coverQuantityGR - currentCover;
            }
            if (foodQuantityGr <= 0 || hayQuantityGr <= 0 || coverQuantityGR <= 0) {

                isNotEnough = true;
                break;
            }
        }
        if (isNotEnough){
              System.out.println("Merry must go to the pet store!");

        }else {
            System.out.printf("Everything is fine! Puppy is happy! Food: %.2f, Hay: %.2f, Cover: %.2f.",
                    foodQuantityGr / 1000, hayQuantityGr / 1000, coverQuantityGR / 1000);

        }


    }
}
