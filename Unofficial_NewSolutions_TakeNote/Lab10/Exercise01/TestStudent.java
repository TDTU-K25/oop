public class TestStudent {
    public static void main(String[] args) {
        Student outerObject = new Student("Ben", "Ho Chi Minh City", "Male", 9.5);
        Student.StudentOperator innerObject = outerObject.new StudentOperator();
        innerObject.print();
        System.out.println(innerObject.type());
    }
}
