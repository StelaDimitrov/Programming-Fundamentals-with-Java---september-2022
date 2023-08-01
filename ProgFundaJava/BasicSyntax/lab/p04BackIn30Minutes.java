package BasicSyntax.lab;

import java.util.Scanner;

public class p04BackIn30Minutes {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int InHour = Integer.parseInt(scanner.nextLine());
        int Inmin = Integer.parseInt(scanner.nextLine());

       int ollminets = (InHour*60) + Inmin + 30;

       int hour = ollminets / 60;
       int minutes = ollminets %60;

       if (hour >23){
           hour = 0;
       }

          System.out.printf("%d:%02d", hour, minutes);

    }
}
