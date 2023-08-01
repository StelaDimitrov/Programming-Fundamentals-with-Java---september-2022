package DataTypesAndVariables.exes;

import java.util.Scanner;

public class p04SumOfChars {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //1. входни данни - брой символи
        // за всеки символ повтаряме:
        //  въвеждаме стойност -
        //  аски кода на символа
        //сумираме

        int countSymbols = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int symbol = 1; symbol <= countSymbols; symbol++) {

            char value = scanner.nextLine().charAt(0);
            int code = (int) value;
            sum += code;

        }
         System.out.printf("The sum equals: %d", sum);
    }
}
