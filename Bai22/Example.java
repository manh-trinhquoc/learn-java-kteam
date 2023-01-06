public class Example {
    private int[] arrInt;

    private Person aPerson;

    public void setArray(int[] arrInt) {
        this.arrInt = arrInt.clone();
    }

    public int[] getArray() {
        return this.arrInt.clone();
    }

    public void displayArray() {
        System.out.println(this.arrInt);
        for (int a : this.arrInt) {
            System.out.print(a + " ");
        }
        System.out.println();
    }

    public void setPerson(Person aPerson) {
        this.aPerson = aPerson.clone();
    }

    public Person getPerson() {
        return this.aPerson.clone();
    }
}
