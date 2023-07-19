package ProgrFundMidRetakeExam8Dec2022;

import java.util.Scanner;

public class p01Championship {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int dayOfChampionship = Integer.parseInt(scanner.nextLine());
        int pointThatNeedToBeCover = Integer.parseInt(scanner.nextLine());
        int countOfTheSwimmers = Integer.parseInt(scanner.nextLine());
        double priseHotelForOneDayOneSwimmer = Double.parseDouble(scanner.nextLine());
        double participationFeePerSwimmer = Double.parseDouble(scanner.nextLine());

        double totalHotelPrice = priseHotelForOneDayOneSwimmer * countOfTheSwimmers * dayOfChampionship;
        double totalParticipationFee = countOfTheSwimmers * participationFeePerSwimmer;
        double totalPrice = totalHotelPrice + totalParticipationFee;
        double points = Double.parseDouble(scanner.nextLine());

        for (int days = 1; days < dayOfChampionship; days++) {

            if (days>1){
                points = points + points * 0.05;
            }
            double newPoints = Double.parseDouble(scanner.nextLine());
            points = newPoints + points;

        }
        if (points >= pointThatNeedToBeCover) {
            totalPrice = totalPrice - totalPrice * 0.25;

              System.out.printf("Money left to pay: %.2f BGN.%n",totalPrice);
              System.out.println("The championship was successful!");

        } else {
            totalPrice = totalPrice - totalPrice * 0.10;
            System.out.printf("Money left to pay: %.2f BGN.%n",totalPrice);
            System.out.println("The championship was not successful.");
        }



    }

}

