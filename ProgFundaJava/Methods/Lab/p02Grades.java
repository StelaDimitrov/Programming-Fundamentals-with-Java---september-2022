package Methods.Lab;

import java.util.Scanner;

public class p02Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double gradeInput = Double.parseDouble(scanner.nextLine());
        printGradInWord(gradeInput);
    }

    public static void printGradInWord(double grade){

        if(grade >= 2 && grade <= 2.99){

             System.out.printf("Fail");
        }else if (grade <= 3.49){
             System.out.printf("Poor");
        }else if (grade <= 4.49){
             System.out.printf("Good");
        }else if (grade <= 5.49){
             System.out.printf("Very good");

        }else{
             System.out.printf("Excellent");
        }
    }
}
