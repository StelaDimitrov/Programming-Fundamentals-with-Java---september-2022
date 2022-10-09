package DataTypesAndVariables.exes;

import java.util.Scanner;

public class p02SumDigits {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 1. входни данни
        // стоп : числото <= 0
        // продължавам: числото >0
        //повтаряме
        //1.взимаме последната цифра  -> % 10
        //2. сумираме цифрата
        //3.махаме последната цифра -> /10
        //принтираме

        int number = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        while (number > 0) {

            int curentNumber = number % 10;
             sum += curentNumber;

             number = number / 10;
        }

          System.out.println(sum);

    }
}
