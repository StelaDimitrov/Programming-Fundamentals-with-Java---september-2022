package ObjectsAndClasses.Exes.p06OrderByAge;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Parson> parsonList = new ArrayList<>();

        String input = scanner.nextLine();

        while (!input.equals("End")) {

            String name = input.split(" ")[0];
            String id = input.split(" ")[1];
            int age = Integer.parseInt(input.split(" ")[2]);

            Parson parson = new Parson(name, id, age);

            parsonList.add(parson);


            input = scanner.nextLine();
        }

        //  списък с хора
        //1, сортираме хората
        parsonList.sort(Comparator.comparing(Parson::getAge));
        // 2, принтираме всеки човек

        for (Parson parson:parsonList) {
             System.out.println(parson);

        }
    }


}
