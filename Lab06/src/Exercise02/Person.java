public class Person {
    // Attributes
    protected String name;
    protected String address;

    // Constructor
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    // Getters
    public String getName() {
        return this.name;
    }

    public String getAddress() {
        return this.address;
    }

    // Setter
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return String.format("Person[name=%s, address=%s]", this.name, this.address);
    }
}
