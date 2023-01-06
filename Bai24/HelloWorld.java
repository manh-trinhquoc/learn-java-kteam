
public class HelloWorld {
    public static void main(String[] args) {
        Student aStudent4 = new Student("Chau4", 21, 1.7f, "HUST");
        System.out.println(aStudent4);
        aStudent4.getInfo();
        aStudent4.setAge(22);
        aStudent4.getInfo();
        aStudent4.setAge(-4);
        aStudent4.getInfo();

    }
}
