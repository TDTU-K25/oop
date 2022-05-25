public class Employee{
    private String eID;
    private String eName;
    private int eSalary;
    private String eDept;

    public Employee(String eID, String eName, int eSalary, String eDept){
        //code here
    }

    public double getBonus(){
        //code here
        return 0;
    }

    public double totalSalary(int numOfWorkingDays){
        //code here
        return 0;
    }

    public String geteID() {
        return eID;
    }

    public void seteID(String eID) {
        this.eID = eID;
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public int geteSalary() {
        return eSalary;
    }

    public void seteSalary(int eSalary) {
        this.eSalary = eSalary;
    }

    public String geteDept() {
        return eDept;
    }

    public void seteDept(String eDept) {
        this.eDept = eDept;
    }

   
}