public class Student extends Person {
    public String universityName;

    public Student(String name, int age, float height, String universityName) {
        super(name, age, height);
        this.universityName = universityName;
    }

    public void getInfo() {
        super.getInfo();
        System.out.println("Student university: " + this.universityName);
    }

    @Override
    public Object clone() {
        Student aStudent = new Student(this.getName(), this.getAge(), this.getHeight(), this.universityName);
        return aStudent;
    }
}
