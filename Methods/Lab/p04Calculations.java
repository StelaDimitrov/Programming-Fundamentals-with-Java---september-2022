package Methods.Lab;

import java.util.Scanner;

public class p04Calculations {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String commandInput = scanner.nextLine();
        int firstNumInput = Integer.parseInt(scanner.nextLine());
        int secondNumInput = Integer.parseInt(scanner.nextLine());

        switch (commandInput){
            case "add":
                //printSum()
                break;;
            case "Multiply":
                //printProduct
                break;
            case "subtract":
                break;
            case"divide":
                break;
        }
    }
    public static void  addNumbers(int firstNum, int secondNum){
        int result = firstNum + secondNum;
          System.out.println(result);

    }
}
