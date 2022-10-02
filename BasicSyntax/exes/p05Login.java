package BasicSyntax.exes;

import java.util.Scanner;

public class p05Login {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //1. username - входни данни
        //2. password - username на обратно
        //3. въвеждане на парола

        String username = scanner.nextLine();

        String password = "";

        // всяка позиция от последната към първата

        for (int position = username.length() - 1; position >= 0; position--) {

            char currentSymbol = username.charAt(position);
            password += currentSymbol;

        }
        // знаем каква ни е паролота

        String enteredPassword = scanner.nextLine();
        int countTry = 0; // брой не успешни опити

        while (!enteredPassword.equals(password)) {
            countTry++;
            if (countTry == 4) {
                System.out.printf("User %s blocked!", username);
                break;

            }
            System.out.println("Incorrect password. Try again.");

            enteredPassword = scanner.nextLine();

        }
        if (enteredPassword.equals(password)) {

            System.out.printf("User %s logged in.", username);

        }

    }
}
