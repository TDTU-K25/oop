public class FullTimeStaff extends Staff {
    protected int baseSalary;
    protected double bonusRate;

    public FullTimeStaff(String sID, String sName, int baseSalary, double bonusRate) {
        super(sID, sName);
        this.baseSalary = baseSalary;
        this.bonusRate = bonusRate;
    }

    public int getBaseSalary() {
        return this.baseSalary;
    }

    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double getBonusRate() {
        return this.bonusRate;
    }

    public void setBonusRate(double bonusRate) {
        this.bonusRate = bonusRate;
    }

    @Override
    public double paySalary(int workedDays) {
        int reward;
        if (workedDays <= 21) {
            reward = 0;
        } else {
            reward = (workedDays - 21) * 100000;
        }
        return this.baseSalary * this.bonusRate + reward;
    }

    @Override
    public String toString() {
        return super.toString() + "_" + this.bonusRate + "_" + this.baseSalary;
    }
}