package TextProcessing.Exer;

import java.util.Scanner;

public class p08LettersChangeNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String[] codes = input.split("//s+");

        double totalSum = 0; //сума от модифицираните числа на всеки код
        for (String code : codes) {
            //модифицирам си числото в кода спрямо буквите
            double modifiedNumber = getMоdifiedNumber(code);

            //добавме модифицианото число към сумата
            totalSum += modifiedNumber;
        }
        System.out.printf("%.2f", totalSum);
    }

    // метод връща модифицираното число от кода
    private static double getMоdifiedNumber(String code) {
        char firstLetter = code.charAt(0);
        char secondLetter = code.charAt(code.length() - 1);
        double number = Double.parseDouble(code.replace(firstLetter, ' ')
                .replace(secondLetter, ' ')
                .trim());
        //проверка за firstLetter за главна буква

        if (Character.isUpperCase(firstLetter)) {
            // главана буква от 65 до 90 в таблицата
            int positionUpperLatter = (int) firstLetter - 64;
            number = number / positionUpperLatter;

        } else {
            // малка букава от 97 до 120

            int positionLowerLatter = (int) firstLetter - 96;
            number *= positionLowerLatter;

        }
        //проверка за втората буква
        if (Character.isUpperCase(secondLetter)) {
            // главана буква от 65 до 90 в таблицата
            int positionUpperLatter = (int) secondLetter - 64;
            number = number - positionUpperLatter;

        } else {
            // малка букава от 97 до 120

            int positionLowerLatter = (int) secondLetter - 96;
            number += positionLowerLatter;
    }
        return number; // връщам модифицираното число
}

}
