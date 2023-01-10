public class Student extends Person implements IStudy, ISpeak {
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

    @Override
    public void study() {
        System.out.println(this.getName() + " is styding");
    };

    @Override
    public void speak() {
        System.out.println(this.getName() + " is speaking");
    }
}
