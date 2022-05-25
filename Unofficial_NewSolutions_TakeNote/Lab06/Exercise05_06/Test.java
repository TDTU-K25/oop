public class Test {
    public static void main(String[] args) {
        // Employee e = new Employee("52100999", "Pham Anh Khoa", 2016, 2, 2);
        // System.out.println(e.considerEmulation());
        // System.out.println(e.getSenioritySalary());
        // System.out.println(e.getSalary());

        Manager m = new Manager();
        System.out.println(m.considerEmulation());
        System.out.println(m.bonusByPosition());
        System.out.println(m.getSalary());
    }
}
