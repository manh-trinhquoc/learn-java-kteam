public class HelloWorld {
    public static void main(String[] args) {
        int[] arrInt = { 1, 2, 3, 4, 5, 6 };
        for (int i = 0; i < arrInt.length; i++) {
            if (arrInt[i] == 2) {
                continue;
            }
            if (arrInt[i] == 5) {
                break;
            }
            System.out.println(arrInt[i]);
        }
    }
}
