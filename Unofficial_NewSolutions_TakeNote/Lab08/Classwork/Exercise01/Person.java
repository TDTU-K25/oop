public class Person {
    protected String name;
    protected int birthYear;

    public Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public String getName() {
        return this.name;
    }

    public int getBirthYear() {
        return this.birthYear;
    }

    @Override
    public String toString() {
        return String.format("Person[name = %s, birthYear = %d]", this.name, this.birthYear);
    }
}