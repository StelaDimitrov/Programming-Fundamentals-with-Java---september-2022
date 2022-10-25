package ProgrammingFundamentalsMidExam23October2022;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class p03PhoneShop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<String> phone = Arrays.stream(scanner.nextLine()
                        .split(",\\s+"))
                .collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("End")){

            if (command.contains("Add")){
                String numberToAdd = command.split(",\\s+")[2];
                phone.add(phone.size()-1, numberToAdd);
            }else if (command.contains("Remove")){
                String indexForRemove = command.split(",\\s+")[2];


            }else if (command.contains("Bonus phone")){


            }else if (command.contains("Last")){

            }


        }

    }
}
