
public class HelloWorld {

    public static void main(String[] args) {
        int[] a = { 0, 1, 2, 3 };
        try {
            System.out.println(a[3]);
            System.out.println(a[4]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index không tồn tại");
        }

        int S = 0;
        try {
            for (String arg : args) {
                inputValue(Integer.parseInt(arg));
                S += Integer.parseInt(arg);
                System.out.println(arg);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
        } finally {
            System.out.println("This is the end");
        }

    }

    static void inputValue(int value) {
        if (value > 100) {
            throw new ArithmeticException("value > 100");
        }
    }

}
