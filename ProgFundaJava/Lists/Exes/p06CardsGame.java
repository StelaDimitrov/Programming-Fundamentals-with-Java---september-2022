package Lists.Exes;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class p06CardsGame {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> firstPlayersCards = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondPlayersCards = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        // взимаме първата карта от ръката
        //премахвеме картат от ръката
        // проверка кой печели
        // карта 1 > карта 2 - слагаме накрая на ръката на първия  - карта 1 - карта 2
        // карта 2 > карта 1 - слагаме накрая на ръката на първия  - карта 2 - карта 1
        // карта 1 == карта 2 = премахват се от списъка
        // играта продължава когато и двамата имат карти
        // играта спира когато някой остане без карти

        while (firstPlayersCards.size() != 0 && secondPlayersCards.size() != 0) {
            int firstPlayerCard = firstPlayersCards.get(0);
            int secondPlayerCard = secondPlayersCards.get(0);

            firstPlayersCards.remove(0);
            secondPlayersCards.remove(0);

            if (firstPlayerCard>secondPlayerCard){

                firstPlayersCards.add(firstPlayerCard);
                firstPlayersCards.add(secondPlayerCard);
            }else if (secondPlayerCard>firstPlayerCard){

                secondPlayersCards.add(secondPlayerCard);
                secondPlayersCards.add(firstPlayerCard);
            }


        }
        // играта продължава когато и двамата имат карти

        if (firstPlayersCards.size()==0){
            //втория печеки, ако на първия свършат картите
             System.out.printf("Second player wins! Sum: %d", getCardsSum(secondPlayersCards));
        }
        // играта спира когато някой остане без карти
        else if (secondPlayersCards.size()==0){
            //първия печели
             System.out.printf("First player wins! Sum: %d", getCardsSum(firstPlayersCards));
        }


    }

    private static int getCardsSum(List<Integer> listCards) {

        int sum = 0;
        for (int card : listCards) {
            sum += card;

        }
        return sum;
    }
}
