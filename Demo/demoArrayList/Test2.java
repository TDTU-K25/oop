import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        ArrayList mylist = new ArrayList();
        mylist.add(10); // autoboxing
        mylist.add("Hello");
        mylist.add(true);
        mylist.add(15.75);
        int i = (Integer)mylist.get(0); // unboxing
        String s = (String)mylist.get(1);
        boolean b = (boolean)mylist.get(2);
        double d = (double)mylist.get(3);
        System.out.println("1st element: " + i);
        System.out.println("2nd element: " + s);
        System.out.println("3rd element: " + b);
        System.out.println("4th element: " + d);
    }
}