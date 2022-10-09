package DataTypesAndVariables.exes;

import java.util.Scanner;

public class p08BeerKegs {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // входни данни - брой кегове
        //за всеки кег повтаряме
        //1.прочитаме данните
        //2. обем = π * r^2 * h.
        //3.проверка дали е най големия кег
        //търсим максимална стойност
        //1. променлива в която ще съхраняваме тази стоиност
        double maxVolume = Integer.MIN_VALUE;
        String maxModelKeg = "";

        int countKegs = Integer.parseInt(scanner.nextLine());

        for (int keg = 1; keg <= countKegs; keg++) {
            String kegModel = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());

            double volume = Math.PI * Math.pow(radius, 2) * height;
            //2. проверка дали дадения обем ми е по - голям от максималния

            if (volume > maxVolume) {

                maxVolume = volume;
                maxModelKeg = kegModel;
            }


        }
          System.out.println(maxModelKeg);

    }
}
