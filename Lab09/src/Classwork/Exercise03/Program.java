import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

public class Program {
    public <E> boolean writeFile(String path, ArrayList<E> lst) {
        try {
            FileWriter myWriter = new FileWriter(path);
            for (int i = 0; i < lst.size(); i++) {
                String line = lst.get(i).toString(); // invoke toString() method of object 
                myWriter.write(line); // => We should pass a String parameter to write() method
                if (i == lst.size() - 1) {
                    break;
                }
                myWriter.write(System.lineSeparator());
            }
            myWriter.close();
        }
        catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();    
            return false;
        }
        return true;
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
        
        if(new Program().writeFile("output.txt", studentList)) {
            System.out.println("Successfully write to file.");
        }
        else {
            System.out.println("UnSuccessfully write to file.");
        }
    }
}
