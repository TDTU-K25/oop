public class Student {
    // Attributes
    private int id;
    private String firstName;
    private String lastName;

    // Constructor
    public Student(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Getters
    public int getID() {
        return this.id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getName() {
        return this.lastName + " " + this.firstName;
    }

    // Setters
    public void setID(int id) {
        this.id = id;
    } 

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String toString() {
        return String.format("Student[id=%d, firstName=%s, lastName=%s]", this.id, this.firstName, this.lastName);
    }
}
