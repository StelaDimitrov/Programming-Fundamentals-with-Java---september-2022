package ExamPreparation_05_2022;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class p02MirrorWord {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String hiddenWords = scanner.nextLine();

        String regex = "(@|#)(?<first>[A-Za-z]{3,})\\1\\1(?<second>[A-Za-z]{3,})\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(hiddenWords);

        List<String> pars = new ArrayList<>();
        int countAllPars = 0;

        while (matcher.find()) {

            String firstWord = matcher.group("first");
            String secondWord = matcher.group("second");
            countAllPars++;
            StringBuilder secondWordBilder = new StringBuilder(secondWord);
            String reversedSecondWord = secondWordBilder.reverse().toString();

            if (firstWord.equals(reversedSecondWord)) {

                pars.add(firstWord + " <=> " + secondWord);
            }
        }
            if (countAllPars == 0) {
                System.out.println("No word pairs found!");
            } else {
                System.out.println(countAllPars+ " word pairs found!");
            }


            if (pars.size() == 0) {
                System.out.printf("No mirror words!");
            } else {
                System.out.println("The mirror words are:");
                System.out.println(String.join(", ", pars));
            }
        }
    }

