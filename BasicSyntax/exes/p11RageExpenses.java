package BasicSyntax.exes;

import java.util.Scanner;

public class p11RageExpenses {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //1, входни данни

        int lostGames = Integer.parseInt(scanner.nextLine());
        double headSetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        //2. крайна стоност = br.slu[alki *headSetPrice  + с мишки + с клавиатура + с монитори

        int countHeadset = lostGames / 2; // br na slushalkite
        int countMouse = lostGames /3; // br na mishkite
        int countKeyboard = lostGames /6; // br.klaviaturi
        int countDisplay = lostGames /12;


        double finalSum = (countHeadset * headSetPrice)
                +(countMouse * mousePrice)
                +(countKeyboard * keyboardPrice)
                +(countDisplay* displayPrice);

         System.out.printf("Rage expenses: %.2f lv.", finalSum);



    }
}
