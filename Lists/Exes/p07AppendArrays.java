package Lists.Exes;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class p07AppendArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String  input = scanner.nextLine();

        List<String> listSeparateByPipe = Arrays.stream(input.split("\\|"))
                .collect(Collectors.toList());

        Collections.reverse(listSeparateByPipe);

          System.out.println(listSeparateByPipe.toString()
                  .replace("[", "")
                  .replace("]","")
                  .trim()
                  .replaceAll(",", "")
                  .replaceAll("\\s+"," "));



    }
}
