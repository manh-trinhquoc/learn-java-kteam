
public class HelloWorld {
    public static void main(String[] args) {
        Student aStudent4 = new Student("Chau4", 21, 1.7f, "HUST");
        System.out.println(aStudent4);
        aStudent4.getInfo();
        aStudent4.setAge(22);
        aStudent4.getInfo();
        aStudent4.setAge(-4);
        aStudent4.getInfo();

        Example ex = new Example();
        int[] mang = { 1, 2, 3 };
        System.out.println(mang);
        ex.setArray(mang);
        ex.displayArray();
        mang[1] = 3;
        ex.displayArray();
        System.out.println(ex.getArray());
    }
}
