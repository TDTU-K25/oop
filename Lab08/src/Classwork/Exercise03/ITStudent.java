public class ITStudent extends Student {
    private int sID;

    // Constants of class
    public static String RANK_A = "A";
    public static String RANK_B = "B";
    public static String RANK_C = "C";

    public ITStudent(String name, double gpa, int ID) {
        super(name, gpa);
        this.sID = ID;
    }   

    @Override
    public String getRank() {
        if (this.gpa <= 5) {
            return RANK_C;
        }
        else {
            if (this.gpa <= 8) {
                return RANK_B;
            }
        }
        return RANK_A;
    }

    @Override
    public String toString() {
        return String.format("ITStudent[name = %s, gpa = %f, ID = %d]", this.sName, this.gpa, this.sID);
    }
}
