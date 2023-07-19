package ProgrFundMidRetakeExam8Dec2022;

import java.util.*;
import java.util.stream.Collectors;

public class p03TheFinalQuest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> massage = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("Stop")) {

            String[] commands = command.split(" ");

            if (commands[0].contains("Delete")) {
                int sizeList = massage.size()-1;
                int index = Integer.parseInt(commands[1]);
                index += 1;


                if (index <= sizeList) {

                    massage.remove(index);

                } else {
                    command = scanner.nextLine();
                }

            }
            if (commands[0].contains("Swap")) {

                String wordOne = commands[1];
                String wordTwo = commands[2];

                if (massage.contains(wordOne) && massage.contains(wordTwo)) {

                    int indexWordOne = massage.indexOf(wordOne);
                    int indexWordTwo = massage.indexOf(wordTwo);

                    massage.set(indexWordOne, wordTwo);
                    massage.set(indexWordTwo, wordOne);

                } else {
                    break;
                }

            }
            if (commands[0].contains("Put")) {
                String wordOne = commands[1];
                int index = Integer.parseInt(commands[2]) - 1;

                // if (index<0){
                //  command = scanner.nextLine();
                // }

                if (massage.size() > index && index > 0) {
                    massage.add(index, wordOne);

                } else if (massage.size() == index) {
                    massage.add(wordOne);

                }

            }
            if (commands[0].contains("Sort")) {

                Collections.sort(massage);

            }
            if (commands[0].contains("Replace")) {

                String wordOne = commands[1];
                String wordTwo = commands[2];

                if (massage.contains(wordTwo)) {

                    int indexWordTwo = massage.indexOf(wordTwo);
                    massage.set(indexWordTwo, wordOne);
                } else {
                    command = scanner.nextLine();
                }
            }
            command = scanner.nextLine();
        }
        System.out.println(String.join(" ", massage));

    }
}
