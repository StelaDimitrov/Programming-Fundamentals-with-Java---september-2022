package Arrays.exes;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class p04ArrayRotation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int rotations = Integer.parseInt(scanner.nextLine());

        for (int rotation = 1; rotation <= rotations; rotation++) {
            // взимаме първия елемент
            int firstElement = numbers[0];
            // преместваме всички елементи с 1 на ляво
            //всички индекси от първия до последния
            for (int index = 0; index < numbers.length - 1; index++) {
                numbers[index] = numbers[index + 1];
            }
            // слагаме на последна позиция
            numbers[numbers.length - 1] = firstElement;

        }
        for (int number:numbers) {
              System.out.print(number + " ");


        }
    }
}
