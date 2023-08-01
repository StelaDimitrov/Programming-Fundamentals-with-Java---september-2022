package DataTypesAndVariables.Lab;

import java.util.Scanner;

public class p06CharsToString {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        char firstSymbol = scanner.nextLine().charAt(0);
        char secondSymbol = scanner.nextLine().charAt(0);
        char thirdSymbol = scanner.nextLine().charAt(0);

         System.out.printf("%s%s%s", firstSymbol, secondSymbol, thirdSymbol);
    }
}
