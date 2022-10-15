package Arrays.exes;

import java.util.Arrays;
import java.util.Scanner;

public class p01Train {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberOfWagons = Integer.parseInt(scanner.nextLine());

        int sumPeople = 0;
        int[] wagons = new int[numberOfWagons];


        for (int wagon = 0; wagon < numberOfWagons; wagon++) {
            int currentNum = Integer.parseInt(scanner.nextLine());

            wagons[wagon] = currentNum;
            sumPeople += currentNum;

        }
        for (int index = 0; index <= wagons.length - 1; index++) {
            int currentElement = wagons[index];
            System.out.print(currentElement + " ");




        }
          System.out.println();

        System.out.println(sumPeople);
    }


}
