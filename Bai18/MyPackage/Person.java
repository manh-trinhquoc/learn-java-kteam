package MyPackage;

public class Person {
    private String name;
    private int age;
    private float height;

    public Person(String name, int age, float height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public void eat(String footName) {
        System.out.println("Person " + name + " is eating " + footName);
    }

    public int getAge() {
        return age;
    }
}
