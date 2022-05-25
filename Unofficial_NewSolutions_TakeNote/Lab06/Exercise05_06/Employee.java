import java.util.Calendar;

public class Employee {
    // Attributes
    protected String ID;
    protected String fullName;
    protected int yearJoined;
    protected double coefficientsSalary; // Hệ số lương
    protected int numDaysOff;

    protected static int basicSalary = 1150;

    // Constructors
    public Employee() {
        this.ID = "0";
        this.fullName = "";
        this.yearJoined = 2020;
        this.coefficientsSalary = 1.0;
        this.numDaysOff = 0;
    }

    public Employee(String ID, String fullName, double coefficientsSalary) {
        this.ID = ID;
        this.fullName = fullName;
        this.yearJoined = 2020;
        this.coefficientsSalary = coefficientsSalary;
        this.numDaysOff = 0;
    }

    public Employee(String ID, String fullName, int yearJoined, double coefficientsSalary, int numDaysOff) {
        this.ID = ID;
        this.fullName = fullName;
        this.yearJoined = yearJoined;
        this.coefficientsSalary = coefficientsSalary;
        this.numDaysOff = numDaysOff;
    }

    public double getSenioritySalary() { // lương thâm niên
        double senioritySalary = 0;
        int yearsOfWork = Calendar.getInstance().get(Calendar.YEAR) - this.yearJoined;
        if (yearsOfWork >= 5) {
            senioritySalary = yearsOfWork * (double)basicSalary / 100.0;
        }
        return senioritySalary;
    }

    public String considerEmulation() { // đánh giá thi đua
        if (this.numDaysOff <= 1) {
            return "A";
        }

        if (this.numDaysOff <= 3) {
            return "B";
        }
        
        return "C";
    }

    protected double getEmulationCoefficient() { // hệ số lương thi đua
        double emulationCoefficient = 0;
        if (this.considerEmulation().equals("A")) {
            emulationCoefficient = 1.0;
        }
        else {
            if (this.considerEmulation().equals("B")) {
                emulationCoefficient = 0.75;
            }
            else {
                emulationCoefficient = 0.5;
            }
        }
        return emulationCoefficient;
    }

    public double getSalary() {
        return basicSalary + basicSalary * (this.coefficientsSalary + this.getEmulationCoefficient()) + this.getSenioritySalary();
    }
}
