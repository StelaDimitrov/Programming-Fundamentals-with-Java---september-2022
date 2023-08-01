package ProgrammingFundamentalsMidExam23October2022;

import java.util.Scanner;

public class p01TheHuntingGames {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int daysOfAdventure = Integer.parseInt(scanner.nextLine());
        int numbersOfPlay = Integer.parseInt(scanner.nextLine());
        double energy = Double.parseDouble(scanner.nextLine());
        double waterForDayOnePerson = Double.parseDouble(scanner.nextLine());
        double foodForDayOnePerson = Double.parseDouble(scanner.nextLine());

        double totalWater = daysOfAdventure * numbersOfPlay * waterForDayOnePerson;
        double totalFood = daysOfAdventure * numbersOfPlay * foodForDayOnePerson;
        double lostEnergy = Double.parseDouble(scanner.nextLine());

        double lostNewEnergy = 0;

        for (int days = 1; days <= daysOfAdventure; days++) {

            if (days == 1) {
                lostNewEnergy = energy - lostEnergy;

            } else if (days % 2 == 0) {

                totalWater = totalWater - totalWater * 0.3;
                lostNewEnergy = lostNewEnergy * 0.05 + lostNewEnergy - lostEnergy;


            } else if (days % 3 == 0) {
                lostNewEnergy = lostNewEnergy - lostEnergy;

                totalFood = totalFood - totalFood / numbersOfPlay;
                lostNewEnergy = lostNewEnergy * 0.1 + lostNewEnergy - lostEnergy;

            }


            lostEnergy = Double.parseDouble(scanner.nextLine());


        }

        if (lostEnergy > 0) {
            System.out.printf("You are ready for the quest. You will be left with - %d energy!", lostEnergy);
        } else {
            System.out.printf("You will run out of energy. You will be left with %d food and %d water.", totalFood, totalWater);


        }


    }

}

