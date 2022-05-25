public class Staff extends Person {
    // Attributes
    private String school;
    private double pay;

    // Constructor
    public Staff(String name, String address, String school, double pay) {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    public String getSchool() {
        return this.school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public double getPay() {
        return this.pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    @Override
    public String toString() {
        return String.format("Staff[name=%s, address=%s, school=%s, pay=%f]", this.name, this.address, this.school, this.pay);
    }
}
