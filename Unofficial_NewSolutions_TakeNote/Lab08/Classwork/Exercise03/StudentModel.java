import java.util.ArrayList;

public class StudentModel {

    // Can add non-access modifier static => Don't need to create object
    public ArrayList<Student> findStudent(ArrayList<Student> lstStu) {
        ArrayList<Student> temp = new ArrayList<Student>();
        for (Student s : lstStu) {
            if(s.getRank().equals(MathStudent.RANK_PASSED) || s.getRank().equals(ITStudent.RANK_A)) {
                temp.add(s);
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<Student>();
        ITStudent it1 = new ITStudent("Nguyen Minh Dang", 7.5, 52100001);
        ITStudent it2 = new ITStudent("Nguyen Thanh Truc", 4.25, 52100002);
        studentList.add(it1);
        studentList.add(it2);
        studentList.add(new ITStudent("Nguyen Huu Loc", 9, 52100003));

        MathStudent m1 = new MathStudent("Nguyen Quoc Bao", 6, "M002");
        studentList.add(m1);
        studentList.add(new MathStudent("Tran Lan Anh", 4, "M001"));

        System.out.println(new StudentModel().findStudent(studentList)); // anonymous declaration
        // When you print a List, the List's toString() method is called, which in turn calls to toString() method of its elements.
    }
}
