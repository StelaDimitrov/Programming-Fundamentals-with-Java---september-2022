package Methods.Lab;

import java.util.Scanner;

public class p01SignIntegerNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numInput = Integer.parseInt(scanner.nextLine());

        printNumbersSing(numInput);


    }

    public static void printNumbersSing(int num) {

        if (num > 0) {
            System.out.printf("The number %d is positive.", num);
        } else if (num < 0) {
             System.out.printf("The number %d is negative.", num);

        }else {
             System.out.printf("The number 0 is zero.",num);
        }


    }
}
