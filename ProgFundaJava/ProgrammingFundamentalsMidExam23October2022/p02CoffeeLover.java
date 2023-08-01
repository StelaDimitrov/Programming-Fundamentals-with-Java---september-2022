package ProgrammingFundamentalsMidExam23October2022;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class p02CoffeeLover {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> coffeesList = Arrays.stream(scanner.nextLine()
                .split("\\s+ ")).collect(Collectors.toList());

        int numberCommand = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();

        while (numberCommand >= 0) {

            if (command.equals("Include")) {
                String commandToInclude = command.split("\\s+")[1];

                coffeesList.add(commandToInclude);

            } else if (command.equals("Remove")) {
                String commandToRemove = command.split("\\s+")[1];
                int numberCoffeesToRemove = Integer.parseInt(command.split("\\s+")[2]);
                if (commandToRemove.equals("first") && numberCoffeesToRemove == 1) {
                    coffeesList.remove(0);
                } else if (commandToRemove.equals("first") && numberCoffeesToRemove == 2)
                    coffeesList.remove(0);
                coffeesList.remove(1);
                if (commandToRemove.equals("last") && numberCoffeesToRemove == 1) {
                    coffeesList.remove(coffeesList.size()-1);

            }

        } else if (command.equals("Prefer")) {
                for (int index = 0; index < coffeesList.size()-1; index++) {
                  int indexToPrefer = Integer.parseInt(command.split("\\s+")[1]);
                  int indexToPrefer2 = Integer.parseInt(command.split("\\s+")[2]);
                  String firstIndex = coffeesList.get(indexToPrefer);
                  String secondIndex = coffeesList.get(indexToPrefer2);

                  coffeesList.add(indexToPrefer2, firstIndex);
                  coffeesList.add(indexToPrefer,secondIndex);


                }

        } else if (command.equals("Reverse")) {
                Collections.reverse(coffeesList);


        }


    }
        System.out.println(coffeesList.toString().replaceAll("[\\[\\],]", ""));


}
}
