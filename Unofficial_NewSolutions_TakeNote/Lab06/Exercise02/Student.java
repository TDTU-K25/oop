public class Student extends Person {
    // Attributes
    private String program;
    private int year;
    private double fee;

    // Constructor
    public Student(String name, String address, String program, int year, double fee) {
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    public String getProgram() {
        return this.program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getFee() {
        return this.fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    @Override
    public String toString() {
        return String.format("Student[name=%s, address=%s, program=%s, year=%d, fee=%f]", this.name, this.address, this.program, this.year, this.fee);
    }
}
