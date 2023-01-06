public class HelloWorld {
    public static void main(String[] args) {
        String gender = "boy";
        switch (gender) {
            case "girl":
                System.out.println(gender);
                break;
            case "boy":
                System.out.println(gender);
                break;
            default:
                System.out.println("Khong biet");
        }
    }
}
