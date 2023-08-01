package BasicSyntax.lab;

import java.util.Scanner;

public class p02Passed {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double gread = Double.parseDouble(scanner.nextLine());

        if (gread >= 3){
            System.out.println("Passed!");

        }
    }
}


