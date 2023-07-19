package TextProcessing.Exer;

import java.util.Scanner;

public class p01ValidUsernames {
    public static <Scanner> void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String[] usernames = input.split(", ");

        for (String username : usernames) {
            if (isValidUsername(username)) {
                System.out.println(username);
            }

        }
    }

    //мерод който проверява дали моя username е валиден
    //true ако е валиден
    // false ако е невалиден

    public static boolean isValidUsername(String username) {
        // валидна дължина 3-16

       if( username.length() < 3 || username.length() > 16){
           return  false;
       }

        // валидно съдържание

        for (char symbol : username.toCharArray()) {
            if (!Character.isLetterOrDigit(symbol) && symbol != '-' && symbol != '_') {
                return false;
            }

        }
        return true;
    }
}
