public class ForeignStudent extends Student {
    private String country;

    public ForeignStudent() {
        super();
        this.country = "Vietnam";
    }

    public ForeignStudent(String fullName, double m1, double m2, String country) {
        super(fullName, m1, m2);
        this.country = country;
    }

    @Override
    public double averageScore() {
        return super.averageScore() + 2;
    }

    @Override
    public void read() {
        System.out.println("reading foreign book ...");
    }

    @Override 
    public String toString() {
        return String.format("ForeignStudent[%s - %s]", this.fullName, this.country);
    }
}