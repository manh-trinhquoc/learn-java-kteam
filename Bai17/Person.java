
public class Person {
    public String name;
    public int age;
    public float height;

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
