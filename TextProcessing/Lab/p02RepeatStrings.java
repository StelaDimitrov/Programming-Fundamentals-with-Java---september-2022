package TextProcessing.Lab;

import TextProcessing.Exer.String;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class p02RepeatStrings {
    public static void main(String[] args) {

         Scanner scanner = new Scanner(System.in);

         String[] wordsArr = scanner.nextLine().split(" ");
        List<String> repeatList = new ArrayList<>();
        for (int i = 0; i < wordsArr.length; i++) {
            String currentWord = wordsArr[i];
            int length = currentWord.length();

            String repeatWord = repeatString(currentWord, length);

            repeatList.add(repeatWord);
        }
         System.out.println(String.join("",repeatList));

    }

    public static String repeatString(String word, int length){
        String resul = "";

        for (int i = 0; i < length; i++) {
            resul = resul + word;

        }
        return  resul;
    }
}
