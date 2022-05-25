public class Employee{
    private String eID;
    private String eName;
    private int eSalary;
    private String eDept;

    public Employee(String eID, String eName, int eSalary, String eDept){
        //code here
        this.eID = eID;
        this.eName = eName;
        this.eSalary = eSalary;
        if (eDept.equals("Accounting")) {
            this.eDept = "Accounting";
        }
        else if (eDept.equals("Administration")) {
            this.eDept = "Administration";
        }
        else if (eDept.equals("Customer Service")) {
            this.eDept = "Customer Service";
        }
        else if (eDept.equals("Human Resources")) {
            this.eDept = "Human Resources";
        }
        else {
            this.eDept = "Administration";
        }
    }
    

    public double getBonus(){
        if (this.eDept.compareTo("Administration") == 0) {
            return 0.5 * this.eSalary;
        }
        else if (this.eDept.compareTo("Accounting") == 0 || this.eDept.compareTo("Human Resources") == 0) {
            return 0.3 * this.eSalary;
        }
        else if (this.eDept.compareTo("Customer Service") == 0) {
            return 0.1 * this.eSalary;
        }
        return 0;
    }

    public double totalSalary(int numOfWorkingDays){
        double total = (this.eSalary * numOfWorkingDays) + this.getBonus();
        if (numOfWorkingDays >= 20) {
            total *= 1.05;
        }
        return total;
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