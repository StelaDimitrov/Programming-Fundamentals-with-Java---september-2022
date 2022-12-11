package ProgrFundMidRetakeExam8Dec2022;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class p02BooksWorld {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> genre = Arrays.stream(scanner.nextLine().split(" \\| ")).collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("Stop!")){

            String[] commands = command.split(" ");

            if(commands[0].contains("Join")){

                String genreToJoin = commands[1];

                if (genre.contains(genreToJoin)){
                    break;
                }else{
                    genre.add(genreToJoin);
                }

                
            }
            if (commands[0].contains("Drop")){
                String genreDrop = commands[1];

                if (genre.contains(genreDrop)){
                    genre.remove(genreDrop);
                }else{
                    break;
                }

            }
            if (commands[0].contains("Replace")){
                String oldGenre = commands[1];
                String newGenre = commands[2];

                if (genre.contains(oldGenre)){
                    int index = genre.indexOf(oldGenre);
                    if (!genre.contains(newGenre)){
                        genre.set(index, newGenre);
                    }
                }else{
                    break;
                }
            }
            if (commands[0].contains("Prefer")){
                int genreIndexOne = Integer.parseInt(commands[1]);
                int genreIndexTwo =  Integer.parseInt(commands[2]);;

                if (genre.size()>=genreIndexOne && genre.size()>= genreIndexTwo){

                    String indexOne = genre.get(genreIndexOne);
                    String indexTwo = genre.get(genreIndexTwo);

                    genre.set(genreIndexOne,indexTwo);
                    genre.set(genreIndexTwo, indexOne);


                }else {
                    break;
                }


            }
            command = scanner.nextLine();
        }
        System.out.println(String.join(" ",genre));


    }


}
