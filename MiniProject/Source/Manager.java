public class Manager extends FullTimeStaff {
    private int allowance;

    public Manager(String sID, String sName, int baseSalary, double bonusRate, int allowance) {
        super(sID, sName, baseSalary, bonusRate);
        this.allowance = allowance;
    }

    public int getAllowance() {
        return this.allowance;
    }

    @Override
    public double paySalary(int workedDays) {
        return super.paySalary(workedDays) + this.allowance;
    }

    @Override
    public String toString() {
        return super.toString() + "_" + this.allowance;
    }
}