import java.util.ArrayList;

// Generic class
public class PersonModel <T> {
    private ArrayList<T> al = new ArrayList<T>();

    public void add(T obj) {
        al.add(obj);
    }

    public void display() {
        for (T obj : al) {
            System.out.println(obj);
        }
    }

    public static void main(String[] args) {
        PersonModel<Student> pm1 = new PersonModel<Student>();
        Student st1 = new Student("Lan", 2003, 52100999, 8);
        Student st2 = new Student("Loc", 2003, 52100001, 9.5);
        pm1.add(st1);
        pm1.add(st2);
        pm1.display();

        PersonModel<Employee> pm2 = new PersonModel<Employee>();
        Employee e1 = new Employee("Vinh", 1999, 1109, 1000);
        Employee e2 = new Employee("Truc", 1999, 2205, 500.5);
        pm2.add(e1);
        pm2.add(e2);
        pm2.display();

        PersonModel <Person> pm3 = new PersonModel<Person>();
        Person p1 = new Person("Uyen", 2002);
        Person p2 = new Person("Lam", 1998);
        pm3.add(p1);
        pm3.add(p2);
        pm3.display();
    }
}
