public class Manager extends Employee {
    // Attributes
    private String position;
    private String department;
    private double salaryCoefficientPosition;

    // Constructors
    public Manager() {
        super();
        this.position = "Head officer";
        this.department = "Administrative";
        this.salaryCoefficientPosition = 5.0;
    }

    public Manager(String ID, String fullName, double coefficientsSalary, String position, double salaryCoefficientPosition) {
        super(ID, fullName, coefficientsSalary);
        this.position = position;
        this.department = "";
        this.salaryCoefficientPosition = salaryCoefficientPosition;
    }

    public Manager(String ID, String fullName, int yearJoined, double coefficientsSalary, int numDaysOff, String position, String department, double salaryCoefficientPosition) {
        super(ID, fullName, yearJoined, coefficientsSalary, numDaysOff);
        this.position = position;
        this.department = department;
        this.salaryCoefficientPosition = salaryCoefficientPosition;
    }

    @Override
    public String considerEmulation() {
        return "A";
    }

    public double bonusByPosition() {
        return basicSalary * this.salaryCoefficientPosition;
    }

    @Override
    public double getSalary() {
        return basicSalary + basicSalary * (this.coefficientsSalary + this.getEmulationCoefficient()) + this.getSenioritySalary() + this.bonusByPosition();
    }
}
