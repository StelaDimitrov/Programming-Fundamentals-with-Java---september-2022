package Methods.Lab;

import java.util.Scanner;

public class p06CalculateRectangleArea {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int widthInout = Integer.parseInt(scanner.nextLine());
        int lengthInput = Integer.parseInt(scanner.nextLine());

        int result = calculateArea(widthInout, lengthInput);

        System.out.println(result);

    }

    public static int calculateArea(int width, int length) {

        return width * length;
    }
}
