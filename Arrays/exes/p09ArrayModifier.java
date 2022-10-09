package Arrays.exes;

import java.util.Arrays;
import java.util.Scanner;

public class p09ArrayModifier {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        // Поватарящо действие - въвеждане на команди
        // стоп: входни данни == енд
        //продължаваме: входните данни != енд

        String command = scanner.nextLine();
        while (!command.equals("end")) {
            //валидна команда за изпълнение

            if (command.contains("swap")) {
                int index1 = Integer.parseInt(command.split(" ")[1]);
                int index2 = Integer.parseInt(command.split(" ")[2]);
                // взимаме първия елелемнт
                int element1 = numbers[index1];
                int element2 = numbers[index2];
                //размяна
                numbers[index1] = element2;
                numbers[index2] = element1;
            } else if (command.contains("multiply")) {
                int index1 = Integer.parseInt(command.split(" ")[1]);
                int index2 = Integer.parseInt(command.split(" ")[2]);
                // взимаме първия елелемнт
                int element1 = numbers[index1];
                int element2 = numbers[index2];

                int product = element1 * element2;

                numbers[index1] = product;

            } else if (command.equals("decrease")) {
                //обхождаме всички елементи и намаляме с едно
                for (int index = 0; index <= numbers.length - 1; index++) {

                    numbers[index]--;
                }
            }
            command = scanner.nextLine();
        }
        for (int index = 0; index <= numbers.length - 1; index++) {
            int currentNumber = numbers[index];
            if (index != numbers.length - 1) {
                //не сме на последното число
                System.out.print(currentNumber + ", ");

            } else {
                //последното число
                System.out.print(currentNumber);

            }
        }
    }
}
