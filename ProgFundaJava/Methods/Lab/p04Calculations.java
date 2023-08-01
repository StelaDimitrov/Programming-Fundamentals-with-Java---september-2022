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
                addNumbers(firstNumInput,secondNumInput);
                break;
            case "Multiply":
                multiplyNumbers(firstNumInput,secondNumInput);
                break;
            case "subtract":
                subtractNumbers(firstNumInput,secondNumInput);
                break;
            case"divide":
                divideNumbers(firstNumInput,secondNumInput);
                break;
        }
    }
    public static void  addNumbers(int firstNum, int secondNum){
        int result = firstNum + secondNum;
          System.out.println(result);

    }

    public static void multiplyNumbers(int firsNum, int secondNum){
        int result = firsNum*secondNum;
          System.out.println(result);


    }
    public static void subtractNumbers(int firsNum, int secondNum){
        int result = firsNum - secondNum;
          System.out.println(result);

    }
    public static void divideNumbers(int firstNum, int secondNum){

        int result = firstNum /secondNum;
          System.out.println(result);

    }
}
