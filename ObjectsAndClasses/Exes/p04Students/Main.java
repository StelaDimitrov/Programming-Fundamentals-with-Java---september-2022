package ObjectsAndClasses.Exes.p04Students;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int countStudents = Integer.parseInt(scanner.nextLine());
        List<Student> studentList = new ArrayList<>();

        for (int studentCount = 1; studentCount <= countStudents; studentCount++) {

            String data = scanner.nextLine();

            String[] dataPart = data.split(" ");
            String firstName = dataPart[0];
            String lastName = dataPart[1];
            double grade = Double.parseDouble(dataPart[2]);

            Student student = new Student(firstName, lastName, grade);

            studentList.add(student);

        }
        studentList.sort(Comparator.comparing(Student::getGrade).reversed());

        for (Student student:studentList) {

             System.out.println(student);
        }
    }
}
