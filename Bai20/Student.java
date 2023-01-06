public class Student {
    public String name;
    public int age;
    public float height;

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, int age) {
        this(name);
        this.age = age;
    }

    public Student(String name, int age, float height) {
        this(name, age);
        System.out.println("param : " + height);
        System.out.println("this : " + this.height);
        this.height = height;

    }

    public void getInfo() {
        System.out.println("name: " + this.name);
        System.out.println("age: " + this.age);
        System.out.println("height: " + this.height);
    }
}
