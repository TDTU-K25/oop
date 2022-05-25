public class Student {
    protected String fullName;
    protected double m1;
    protected double m2;

    public Student() {
        this("Nguyen Van An", 5, 7); // call another constructor in current class
    }

    public Student(String fullName, double m1, double m2) {
        this.fullName = fullName;
        this.m1 = m1;
        this.m2 = m2;
    }

    public double averageScore() {
        return (this.m1 + this.m2) / 2.0;
    }

    public void study() {
        System.out.println("studying ...");
    }

    public void read() {
        System.out.println("reading book ...");
    }

    @Override 
    public String toString() {
        return String.format("Student[%s]", this.fullName);
    }
}