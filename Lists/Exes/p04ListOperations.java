package Lists.Exes;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class p04ListOperations {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("End")) {

            if (command.contains("Add")) {
                //Add {number} - add number at the end
                int numberToAdd = Integer.parseInt(command.split("\\s+")[1]);
                numbersList.add(numberToAdd);

            } else if (command.contains("Insert")) {
                //Insert {number} {index}
                int numberToInsert = Integer.parseInt(command.split("\\s+")[1]);
                int index = Integer.parseInt(command.split("")[2]);

                if (isValidIndex(index, numbersList)) {
                    numbersList.add(index, numberToInsert);
                } else {
                    System.out.println("Invalid index");

                }

            } else if (command.contains("Remove")) {
                int indexForRemove = Integer.parseInt(command.split("\\s+")[1]);

                if (isValidIndex(indexForRemove, numbersList)) {
                    numbersList.remove(indexForRemove);
                } else {
                    System.out.println("Invalid index");

                }

                //Remove {index} - remove that index

            } else if (command.contains("Shift left")) {
                //Shift left {count} - first number becomes last 'count' times
                int countShiftLeft = Integer.parseInt(command.split("\\s+")[2]);
                for (int time = 1; time <= countShiftLeft; time++) {
                    // взимаме първия елемет от списъка
                    int firstNumber = numbersList.get(0);
                    numbersList.remove(0);
                    numbersList.add(firstNumber);

                }

            } else if (command.contains("Shift right")) {
                //Shift right {count} - last number becomes first 'count' times
                int countShiftRight = Integer.parseInt(command.split("\\s+")[2]);
                for (int time = 1; time <= countShiftRight; time++) {
                    //взимаме последния елемент
                    int lastNumber = numbersList.get(numbersList.size() - 1);

                    numbersList.remove(numbersList.size() - 1);

                    numbersList.add(0, lastNumber);

                }
            }
            command = scanner.nextLine();
        }
        for (int number : numbersList) {

              System.out.print(number + " ");


        }

    }

    public static boolean isValidIndex(int index, List<Integer> numbers) {

        return index >= 0 && index <= numbers.size() - 1;
    }
}




