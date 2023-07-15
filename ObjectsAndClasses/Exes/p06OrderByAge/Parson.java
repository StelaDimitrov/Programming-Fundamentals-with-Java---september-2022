package ObjectsAndClasses.Exes.p06OrderByAge;

public class Parson {

    private String name;
    private String id;
    private int age;

    //конструктор

    public Parson (String name, String id, int age){

        this.name = name;
        this.id = id;
        this.age = age;


    }

    public int getAge() {
        return this.age;
    }

    @Override
    public String toString() {
        return String.format("%s with ID: %s is %d years old.", this.name, this.id,this.age);
    }

}
