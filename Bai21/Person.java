
public class Person {
    private String name;
    private int age;
    private float height;

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this(name);
        this.age = age;
    }

    public Person(String name, int age, float height) {
        this(name, age);
        this.height = height;
    }

    public void eat(String footName) {
        System.out.println("Person " + name + " is eating " + footName);
    }

    public int getAge() {
        return age;
    }

    public void getInfo() {
        System.out.println("person name: " + this.name);
        System.out.println("person age: " + this.age);
        System.out.println("person height: " + this.height);
    }
}
