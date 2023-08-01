package BasicSyntax.exes;

import java.util.Scanner;

public class p04PrintAndSum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //1. входни данни - цяло число за начало и цяло число за край
        //2.отпечатам всички числа
        //3. намирам и отпечатвам сумата

        int startNumber = Integer.parseInt(scanner.nextLine());
        int endNumber = Integer.parseInt(scanner.nextLine());

        // for цикъл - знаем колко пъти исакме да пошторим нещо
        // while цикъл - не знаем колко пъти искаме да повторим нещо
            int sum = 0;
        for (int number = startNumber; number <= endNumber ; number++) {
              System.out.print(number + " ");

                sum = sum + number;

        }
          System.out.println();
          System.out.printf("Sum: %d", sum);

    }
}
