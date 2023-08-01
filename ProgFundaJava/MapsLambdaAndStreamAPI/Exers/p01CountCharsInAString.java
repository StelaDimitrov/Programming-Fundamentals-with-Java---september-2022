package MapsLambdaAndStreamAPI.Exers;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class p01CountCharsInAString {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine().replace("\\s+","");

        Map<Character, Integer> symbolsCount = new LinkedHashMap<>();

        // HashMap - няма значение реда на записите
        // LinkedNashMap - записите се подреждат спрямо реда на добавяне
        //TheeMap - записите се сортират по азбучен ред
        for (char symbol : text.toCharArray()) {
            if (symbol ==' ') {
                continue;
            }

            if (!symbolsCount.containsKey(symbol)) {
                symbolsCount.put(symbol, 1);
            } else {
                int currentCount = symbolsCount.get(symbol);
                symbolsCount.put(symbol, currentCount + 1);
            }

        }
        symbolsCount.entrySet().forEach(entry ->  System.out.println(entry.getKey()+" -> "+entry.getValue()));
    }

}
