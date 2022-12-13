package ProgramFundFinalRetakeExam12December2022;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class p02TheRace {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        List<String> symbols = new ArrayList<>();

        String regex = "(#|$|%|\\\\*|&)(?<name>[A-Za-z]+)\\1=(?<lengthGeohasCode>[0-9]+)!!(?<EncryptedCode>[A-Za-z0-9]\\D+)";
        Pattern pattern = Pattern.compile(regex); //шаблон
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {

            String name = matcher.group("name");

            int lengthGeohasCode = Integer.parseInt(matcher.group("lengthGeohasCode"));
            String EncryptedCode = matcher.group("EncryptedCode");

            if (lengthGeohasCode != EncryptedCode.length()) {
                System.out.println("Nothing found!");


            } else {
                symbols.add(name);
                for (int symbol = 0; symbol < EncryptedCode.length(); symbol++) {

                    int index = EncryptedCode.charAt(symbol);

                    int newIndex = index + lengthGeohasCode;

                    char newEncrypt = (char) newIndex;

                    symbols.add(String.valueOf(newEncrypt));

                }
                text = scanner.nextLine();

            }


        }
        System.out.println(String.join("Coordinates found! %s-> %s", symbols));
    }
}

