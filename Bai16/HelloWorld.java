public class HelloWorld {
    public static void main(String[] args) {
        Person aPerson = new Person();
        aPerson.name = "Chay";
        aPerson.age = 21;
        aPerson.height = 1.7f;
        System.out.println(aPerson);
        System.out.println(aPerson.name);
        System.out.println(aPerson.height);
        System.out.println(aPerson.age);

        Person[] arrayPerson = new Person[2];

        arrayPerson[0] = new Person();
        arrayPerson[0].name = "Chay1";
        arrayPerson[0].age = 211;
        arrayPerson[0].height = 1.71f;

        arrayPerson[1] = new Person();
        arrayPerson[1].name = "Chay2";
        arrayPerson[1].age = 212;
        arrayPerson[1].height = 1.72f;

        System.out.println(arrayPerson);

        for (int i = 0; i < arrayPerson.length; i++) {
            System.out.println(arrayPerson[i]);
            System.out.println(arrayPerson[i].name);
            System.out.println(arrayPerson[i].height);
            System.out.println(arrayPerson[i].age);
        }
    }
}
