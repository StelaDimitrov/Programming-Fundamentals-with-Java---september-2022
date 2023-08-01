package ProgrammingFundamentalsFinalExam4_12_22;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class p02MessageDecrypter {
    public static void main(String[] args) {

         Scanner scanner = new Scanner(System.in);

         int n = Integer.parseInt(scanner.nextLine());
        String regexValidMassage = "(?<symbol>[\\$%]*)[A-Z][a-z]{3,}(?<symbolEnd>[\\$%]*):+ \\[[0-9]*\\]+\\|+\\[[0-9]*\\]+\\|+\\[+[0-9]*\\]+?\\|";

        Pattern pattern = Pattern.compile(regexValidMassage);

        for (int i = 0; i < n; i++) {

            String massage = scanner.nextLine();
            Matcher matcher = pattern.matcher(massage);

            String [] number = massage.split("[\\s+\\[\\]\\|]");

            String firstSymbol = matcher.group("symbol");
            String lastSymbol = matcher.group("symbolEnd");

            if (firstSymbol.equals(lastSymbol)){




            }else{
                System.out.println("Valid message not found!");

            }




        }

    }
}
