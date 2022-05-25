public class Test {
    public static void main(String[] args) {
        Employee epl = new Employee("B01", "Nguyen Van Hau", 100000, "Administration");
        //add more statements to test your code

        System.out.println(epl.geteID());
        System.out.println(epl.geteName());
        System.out.println(epl.geteSalary());
        System.out.println(epl.geteDept());
        System.out.println(epl.getBonus());
        System.out.println(epl.totalSalary(20));
    }
}
