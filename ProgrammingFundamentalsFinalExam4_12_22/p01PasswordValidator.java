package ProgrammingFundamentalsFinalExam4_12_22;

import java.util.Scanner;

public class p01PasswordValidator {
    public static void main(String[] args) {

         Scanner scanner = new Scanner(System.in);

         String passwordOfUser = scanner.nextLine();

         String command = scanner.nextLine();

         while(!command.equals("Complete")){





             command = scanner.nextLine();
         }
    }
}
