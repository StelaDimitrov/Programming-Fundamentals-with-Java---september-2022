package ExamPreparation_05_2022;

import java.util.Scanner;

public class p0201SecretChat {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String concealedMessage = scanner.nextLine();

        String command = scanner.nextLine();
        StringBuilder message = new StringBuilder(concealedMessage);

        while (!command.equals("Reveal")) {

            if (command.contains("InsertSpace")) {
                //  "InsertSpace:|:{index}":
                int index = Integer.parseInt(command.split(":\\|:")[1]);
                message.insert(index, " ");
                System.out.println(message);


            } else if (command.contains("Reverse")) {
                //"Reverse:|:{substring}":
                String substring = command.split(":\\|:")[1];

                if (message.toString().contains(substring)) {
                    int startIndex = message.indexOf(substring);
                    int endIndex = startIndex + substring.length();
                    message.delete(startIndex, endIndex);

                    StringBuilder reversedSubstring = new StringBuilder(substring).reverse();
                    message.append(reversedSubstring);
                    System.out.println(message);


                } else {
                    System.out.println("error");
                }


            } else if (command.contains("ChangeAll")) {

                //"ChangeAll:|:{substring}:|:{replacement}":

                String substring1 = command.split(":\\|:")[1];
                String replacement = command.split(":\\|:")[2];
                message = new StringBuilder(message.toString().replaceAll(substring1, replacement));

                System.out.println(message);
            }
            command = scanner.nextLine();

        }

        System.out.printf("You have a new text message: " + message);


    }
}

