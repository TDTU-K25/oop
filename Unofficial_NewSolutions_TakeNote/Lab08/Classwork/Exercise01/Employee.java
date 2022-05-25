public class Employee extends Person {
    private int id;
    private double salary;

    public Employee(String name, int birthYear, int id, double salary) {
        super(name, birthYear);
        this.id = id;
        this.salary = salary;
    }

    public void setID(int id) {
        this.id = id;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getID() {
        return this.id;
    }

    public double getSalary() {
        return this.salary;
    }

    @Override
    public String toString() {
        return String.format("Employee[name = %s, birthYear = %d, id = %d, salary = %f]", this.name, this.birthYear, this.id, this.salary);
    }
}