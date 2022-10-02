package BasicSyntax.lab;

import java.util.Scanner;

public class p03PassedorFailed {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double gread = Double.parseDouble(scanner.nextLine());

        if (gread >= 3){
            System.out.println("Passed!");

        }else{
              System.out.println("Failed!");

        }
    }
}
