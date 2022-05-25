public class TestStudent {
    public static void main(String[] args) {
        Student st = new Student(32142, "Chien", "Nguyen");

        System.out.println(st.getID());
        System.out.println(st.getFirstName());
        System.out.println(st.getLastName());
        System.out.println(st.getName());

        st.setID(95201);
        st.setFirstName("Linh");
        st.setLastName("Pham");

        System.out.println(st.toString());
    }
}
