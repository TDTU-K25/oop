public class MathStudent extends Student {
    private String sID;

    // Constants of class
    public static final String RANK_PASSED = "Passed";
    public static final String RANK_FAILED = "Failed";

    public MathStudent(String name, double gpa, String ID) {
        super(name, gpa);
        this.sID = ID;
    }

    @Override
    public String getRank() {
        if (this.gpa < 5) {
            return RANK_FAILED;
        } 
        return RANK_PASSED;    
    }

    @Override
    public String toString() {
        return String.format("%s - %s - %f", this.sID, this.sName, this.gpa);
    }
}