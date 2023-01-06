public class HelloWorld {
    public static void main(String[] args) {
        Student aStudent2 = new Student("Chau2");
        System.out.println(aStudent2);
        Student aStudent3 = new Student("Chau3", 20);
        System.out.println(aStudent3);
        Student aStudent4 = new Student("Chau4", 21, 1.7f);
        System.out.println(aStudent4);
        aStudent4.getInfo();
    }
}