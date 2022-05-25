public abstract class Student {
    protected String sName;
    protected double gpa;

    public Student(String name, double gpa) {
        this.sName = name;
        this.gpa = gpa;
    }

    public abstract String getRank();

    @Override
    public String toString() {
        return String.format("%s - %f", this.sName, this.gpa);
    }
}