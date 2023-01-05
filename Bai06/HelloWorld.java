public class HelloWorld {
    public static void main(String[] args) {
        int a = 1;
        System.out.println(a++);
        System.out.println(++a);
        System.out.println(a++ + 1);
        System.out.println(++a + 1);

        String name = "How Kteam";
        Boolean isString = name instanceof String;
        System.out.println(isString);

        a = 1;
        int b = 2;
        int c = a < b ? 3 : 4;
        System.out.println(c);
    }
}
