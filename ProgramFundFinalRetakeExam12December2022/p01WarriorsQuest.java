package ProgramFundFinalRetakeExam12December2022;

import java.util.*;
import java.util.stream.Collectors;

public class p01WarriorsQuest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String skill = scanner.nextLine();

        String command = scanner.nextLine();

        while(!command.equals("For Azeroth")){

            if (command.contains("GladiatorStance")&&command.equals("DefensiveStance")&&command.contains("Dispel")
                    &&command.contains("Target Change")&&command.contains("Target Remove")){

                System.out.println("Command doesn't exist!");
            }

            //o"GladiatorStance"
            if (command.equals("GladiatorStance")){

                String upSkill = skill.toUpperCase();
                System.out.println(upSkill);

                skill = upSkill;


                //o	"DefensiveStance"
            } else if (command.equals("DefensiveStance")) {
                String lowerSkill = skill.toLowerCase();
                System.out.println(lowerSkill);


                //o	"Dispel {index} {letter}"
            } else if (command.contains("Dispel")) {

                int index = Integer.parseInt(command.split("\\s+")[1]);
                String letter = command.split("\\s+")[2];
                String indexChar = command.split("\\s+")[1];
                if (index >= skill.length()){

                    System.out.println("Dispel is too weak");
                }else {
                    List<String> skills = Arrays.stream(skill.split("")).collect(Collectors.toList());


                    skills.set(index, letter);


                    System.out.println("Success!");

                }

                //o"Target Change {first substring} {second substring}"
            } else if (command.contains("Target Change")) {

                String firstSubstring = command.split("\\s+")[1];
                String secindSubstring = command.split("\\s+")[2];

                if (skill.contains(firstSubstring)){
                    skill = skill.replaceAll(firstSubstring, secindSubstring);
                    System.out.println(skill);
                }else {
                    System.out.println(skill);
                }

                //o	"Target Remove {substring}"
            } else if (command.contains("Target Remove")) {

                String substringToRemove = command.split("\\s+")[2];

                if (skill.contains(substringToRemove)){

                   String newSkillRemove =  skill.replaceAll(substringToRemove, "");
                    System.out.println(newSkillRemove);

                    skill = newSkillRemove;


                }else{
                    break;
                }

            }

            command = scanner.nextLine();
        }
    }
}
