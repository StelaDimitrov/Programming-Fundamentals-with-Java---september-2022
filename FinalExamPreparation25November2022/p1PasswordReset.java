package FinalExamPreparation25November2022;

import java.util.Scanner;

public class p1PasswordReset {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();
        String command = scanner.nextLine();

        while (!command.equals("Done")) {

            if (command.equals("TakeOdd")) {
                // взимаме символите на нечетен индексS

                String newPassword = getCharsOnOddPosition(password);
                System.out.println(newPassword);

                password = newPassword; // текущата парола става равна на новата парола
            } else if (command.contains("Cut")) {

                int index = Integer.parseInt(command.split("//s+")[1]);
                int length = Integer.parseInt(command.split("//s+")[2]);

                // взимаме от паролата текста от Index и е с дължина length
                String substringToRemove = password.substring(index, index + length);

                // премахваме първото срешане на текста от паролата
                password.replaceFirst(substringToRemove, "");
                System.out.println(password);

            } else if (command.contains("Substitute")) {


            }
        }

    }

    private static String getCharsOnOddPosition(String password) {


    }
}
