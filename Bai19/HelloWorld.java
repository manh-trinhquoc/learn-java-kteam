
public class HelloWorld {
    static String course;

    static {
        course = "Java";
        System.out.println("static block Course: " + course);
    }

    public static void main(String[] args) {
        Student aStudent = new Student("chau", 21, 1.7f);
        System.out.println(aStudent);

        System.out.println("University from class: " + Student.universityName);
        System.out.println("University from instance: " + aStudent.universityName);
        System.out.println("total: " + Student.total);
        Student aStudent2 = new Student("chau", 21, 1.7f);
        System.out.println(aStudent2);
        System.out.println("total: " + Student.total);

        Student.getInfoUniversity();

        System.out.println("main course: " + course);
    }
}
