package BasicSyntax.exes;

import java.util.Scanner;

public class p6StrongNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine()); // стойноста на числото която се модефицира
        int startNumber = number; // първоначално въведената стоиност на числото

        // 1. цифра - 1, последната цифра (%10) 2. ----3.премахваме (/10)

        int sumFact = 0;

        while (number > 0) {
            int lastDigit = number % 10; // последна цифра
            // намирам фактуриела на числото lastDigit
            int fact =1;
            for (int i = 1; i <= lastDigit ; i++) {
                fact = fact * i;
                
            }
            //сумирам фактуриела
            sumFact += fact;
            number = number / 10;

        }

        //проверка дали сумата на фактуриела е равна на числото

        if ( sumFact == startNumber){
              System.out.println("yes");

        }else{
              System.out.println("no");

        }
    }
}
