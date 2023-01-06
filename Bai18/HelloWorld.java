import MyPackage.Person;

public class HelloWorld {
    public static void main(String[] args) {
        Person aPerson = new Person("chau", 21, 1.7f);
        // aPerson.name = "tesst";
        System.out.println(aPerson);
        System.out.println(aPerson.getAge());
        aPerson.eat("bread");
    }
}
