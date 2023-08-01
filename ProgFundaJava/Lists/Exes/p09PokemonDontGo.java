package Lists.Exes;

import java.util.Arrays;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class p09PokemonDontGo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine()
                        .split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int sumRemoved = 0; //сума на премахнатите елементи
        // повтаряме въвеждане на данни
        // спираме когато списъка е празен  size <=0
        //продължаваме докато списъка е пълен >=0

        while (numbers.size() > 0) {

            int index = Integer.parseInt(scanner.nextLine());

            //1. index в списъка >=0 И <=последния

            if (index >= 0 && index <= numbers.size() - 1) {
                //взимам елемента на дадения индекс
                int removeElement = numbers.get(index);
                //премахвам елемента на даденя индекс - добавяме го към сумата
                sumRemoved += removeElement;
                numbers.remove(index);
                // променям си списъка спрямо индекса
                modifylist(numbers, removeElement);
            }
            // 2.index  < 0
            else if (index < 0) {
                // взимаме първия елемент от списъка
                int firstElement = numbers.get(0);
                //премахвам първия елемент от списъка - сумирам
                sumRemoved += firstElement;
                numbers.remove(0);
                //взимаме последния елемент
                int lastElement = numbers.get(numbers.size() - 1);
                //слагаме на индекс последния елемент
                numbers.add(0, lastElement);
                //модифицираме списъка
                modifylist(numbers, firstElement);

            }
            // 3. index > последния в списъка
            else if (index > numbers.size() - 1) {
                //взимаме последния елемент
                int lastElement = numbers.get(numbers.size() - 1);
                // премахваме псоледния елемент
                sumRemoved +=lastElement;
                numbers.remove(numbers.size() - 1);
                // взимаме първия елемент и го слагаме 1вия на мястото на индекса
                int firstElement = numbers.get(0);
                numbers.add(firstElement);
                // модиицирам списък
                modifylist(numbers, lastElement);
            }
        }
          System.out.println(sumRemoved);

    }

    private static void modifylist(List<Integer> numbers, int removeElement) {
        for (int indexLits = 0; indexLits <= numbers.size() - 1; indexLits++) {

            int currentNumber = numbers.get(indexLits);

            if (currentNumber <= removeElement) {

                currentNumber = currentNumber + removeElement;
            } else {
                currentNumber = currentNumber - removeElement;
            }
            numbers.set(indexLits, currentNumber);


        }
    }
}
