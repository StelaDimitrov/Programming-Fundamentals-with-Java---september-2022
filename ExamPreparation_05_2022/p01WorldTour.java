package ExamPreparation_05_2022;

import java.util.Scanner;

public class p01WorldTour {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String stops = scanner.nextLine();
        StringBuilder stopsBuilder = new StringBuilder(stops);

        String command = scanner.nextLine();

        while (!command.equals("Travel")) {

            if (command.contains("Add Stop")) {
                //"Add Stop:{index}:{string}":
                int index = Integer.parseInt(command.split(":")[1]);
                String stopName = command.split(":")[2];
                // valid index

                if (isValidIndex(index, stopsBuilder)) ;
                {
                    stopsBuilder.insert(index, stopName);
                }

            } else if (command.contains("Remove Stop")) {
                //"Remove Stop:{start_index}:{end_index}":

                int startIndex = Integer.parseInt(command.split(":")[1]);
                int endIndex = Integer.parseInt(command.split(":")[2]);

                if (isValidIndex(startIndex, stopsBuilder) && isValidIndex(endIndex, stopsBuilder)) {
                    stopsBuilder.delete(startIndex, endIndex + 1);

                }

            } else if (command.contains("Switch")) {
                //"Switch:{old_string}:{new_string}":
                String oldText = command.split(":")[1];
                String newText = command.split(":")[2];

                // правим проверка дали текса го има в нашата текс и правим замяна само ако го има
                if (stopsBuilder.toString().contains(oldText)) {
                    String updateText = stopsBuilder.toString().replace(oldText, newText);
                    stopsBuilder = new StringBuilder(updateText);
                }

            }

            System.out.println(stopsBuilder);
            command = scanner.nextLine();
        }
        System.out.println("Ready for world tour! Planned stops: " + stopsBuilder);

    }
    //метод който валидира индекс в СторсБилдер

    public static boolean isValidIndex(int index, StringBuilder builder) {

        return index >= 0 && index <= builder.length() - 1;
    }
}