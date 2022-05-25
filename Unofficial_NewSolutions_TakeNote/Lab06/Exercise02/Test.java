public class Test {
    public static void main(String[] args) {
        Person p = new Person("Tin", "Q2");
        Student st = new Student("Linh", "Q7", "CS", 2021, 1000);
        Staff stf = new Staff("Truc", "Q6", "TDTU", 500);

        p.setAddress("Q1");
        st.setAddress("Thu Duc");
        stf.setAddress("Nha Be");

        st.setProgram("Marketing");
        stf.setPay(1500);

        System.out.println(p);
        System.out.println(st);
        System.out.println(stf);
    }
}
