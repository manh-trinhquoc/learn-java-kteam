public class HelloWorld {
    public static void main(String[] args) {
        Person aPerson = new Person("chau", 21, 1.7f);
        // aPerson.name = "Chay";
        // aPerson.age = 21;
        // aPerson.height = 1.7f;
        System.out.println(aPerson);
        System.out.println(aPerson.getAge());
        aPerson.eat("bread");
    }
}
