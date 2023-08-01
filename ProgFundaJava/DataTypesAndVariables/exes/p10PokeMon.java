package DataTypesAndVariables.exes;

import java.util.Scanner;

public class p10PokeMon {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //| входни данни

        int power = Integer.parseInt(scanner.nextLine());
        int distance = Integer.parseInt(scanner.nextLine());
        int factor = Integer.parseInt(scanner.nextLine());
        // повтаряме:
        // power -= distance - броя на пок увеличаваме с 1
        //проверка за умората му
        //стоп power < distance
        //продължава докато power >= distance
        int firstPower = power;
        int countPoke = 0;
        while (power >= distance) {
            //отива до целта - хаби енергия
            power -= distance;
            //poke
            countPoke++;
            // проверка дали е изморен
            if (power == firstPower / 2) {
                if (factor != 0) {
                    power = power / factor;
                }


            }


        }
        System.out.println(power);
        System.out.println(countPoke);


    }
}
