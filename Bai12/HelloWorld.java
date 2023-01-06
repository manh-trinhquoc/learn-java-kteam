
public class HelloWorld {
    public static void main(String[] args) {
        int[] arrInt = new int[3];
        arrInt[0] = 1;
        arrInt[1] = 2;
        arrInt[2] = 3;
        System.out.println(arrInt);
        for (int i = 0; i < arrInt.length; i++) {
            System.out.println(arrInt[i]);
        }

        char[] arrChar = { 'H', 'e', 'l', 'l', 'o' };
        System.out.println(arrChar);

        int[][] arr2Int = { { 1, 2, 3 }, { 4, 5, 6 } };
        System.out.println(arr2Int);
        for (int i = 0; i < arr2Int.length; i++) {
            System.out.println(arr2Int[i]);
            for (int j = 0; j < arr2Int[i].length; j++) {
                System.out.println(arr2Int[i][j]);
            }
        }
    }
}
