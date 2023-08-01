package RegularExpressions.Exers;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class p02Race {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String nameParticipants = scanner.nextLine();

        List<String> names = Arrays.stream(nameParticipants.split(", ")).collect(Collectors.toList());
        Map<String, Integer> racerDistances = new LinkedHashMap<>();

        names.forEach(name -> racerDistances.put(name, 0));

        String regexLetters = "[A-Za-z]+";
        Pattern patternLetter = Pattern.compile(regexLetters);

        String regexDigits = "[0-9]";
        Pattern patterDigits = Pattern.compile(regexDigits);

        String input = scanner.nextLine();

        while (!input.equals("end of rice")) {
            //име на състезателя трябва да вземем всички букви
            StringBuilder racerName = new StringBuilder();
            Matcher matcherLetter = patternLetter.matcher(input);
            // съхранявам си всички текстове "G""e""or""g""e"

            while (matcherLetter.find()) {

                racerName.append(matcherLetter.group());
            }

            //дистанция е сумата от цифри
            int distance = 0;

            Matcher matcherDigits = patterDigits.matcher(input);
            while (matcherDigits.find()) {
                distance += Integer.parseInt(matcherDigits.group());
            }

            if (names.contains(racerName.toString())) {
                // имаме играча в първоначалния списък
                int currentDistance = racerDistances.get(racerName.toString());

                racerDistances.put(racerName.toString(), currentDistance + distance);
            }
            input = scanner.nextLine();
        }
        int count = 0;// реда на текушия играч

        for (Map.Entry<String, Integer>pair:racerDistances.entrySet()) {

            if (count==1){

                 System.out.println("1st place: "+pair.getKey());
                 count++;
            }else if (count==2){
                System.out.println("2nd place: "+pair.getKey());
                count++;
            }else if (count == 3){
                System.out.println("3rd place: "+pair.getKey());
              break;
            }

        }

    }
}
