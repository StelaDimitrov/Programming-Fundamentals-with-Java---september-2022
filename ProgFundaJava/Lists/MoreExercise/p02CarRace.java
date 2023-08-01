package Lists.MoreExercise;

import java.util.Arrays;
import java.util.Scanner;

public class p02CarRace {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int[] timeCar = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();


        double sumTimeLeft = 0;
        double sumTimeRight = 0;

        for (int index = 0; index < timeCar.length / 2; index++) {
            int firstTime = timeCar[index];

            if (firstTime == 0) {

                sumTimeLeft = sumTimeLeft * 0.8;
            }

            sumTimeLeft += firstTime;


        }

         for (int index = timeCar.length -1; index > (timeCar.length - 1)/2  ; index--) {

          int firstTime = timeCar[index];

           if (firstTime == 0) {

              sumTimeRight = sumTimeRight * 0.8;}

          sumTimeRight += firstTime;


         }
          if ( sumTimeLeft > sumTimeRight){

          System.out.printf("The winner is right with total time: %.1f", sumTimeRight);
         }else if( sumTimeRight > sumTimeLeft){
            System.out.printf("The winner is left with total time: %.1f", sumTimeLeft);
          }


    }
}

