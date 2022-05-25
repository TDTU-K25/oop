public class Test {
    public static void main(String[] args) {
        // ForeignStudent s2 = new Student(); // Sub sb = new Super(); => Wrong (Con trỏ của subclass thì không trỏ đc object của superclass)
        Student s1 = new Student();
        Student s2 = new ForeignStudent(); // Con trỏ của superclass trỏ object của subclass (Polymorphism)
        ForeignStudent s3 = new ForeignStudent();

        System.out.println(s1.toString()); // Execution result: "Student[Nguyen Van An]"
        System.out.println(s2.toString()); // Execution result: "ForeignStudent[Nguyen Van An - Vietnam]" 
        System.out.println(s3.toString()); // Execution result: "ForeignStudent[Nguyen Van An - Vietnam]" 

        // s3.study(); Although the body of ForeignStudent class doesn't have study() method, but ForeignStudent class inherits from Student class so ForeignStudent class (subclass) inherits all attributes and methods of Student class (superclass)

        // Case 1: when Student class doesn't have read() method, ForeignStudent class has read() method
        // s2.read(); // Compilation error 

        // Case 2: when Student class has read() method and ForeignStudent class has read() method (override)
        // s2.read(); // Execution result: "reading foreign book ..."

        // Case 3: when Student class has read() method and ForeignStudent class has read() method (not override)
        // s2.read(); // Execution result: "reading book ..."

        /*
        INSTANCE OF

        System.out.println(s1 instanceof Student); // true
        System.out.println(s1 instanceof ForeignStudent); // false

        System.out.println(s2 instanceof Student); // true
        System.out.println(s2 instanceof ForeignStudent); // true

        System.out.println(s3 instanceof Student); // true
        System.out.println(s3 instanceof ForeignStudent); // true

        */
        
        // System.out.println(s1.averageScore()); // 6.0
        
        // // Like case 2 above
        // System.out.println(s2.averageScore()); // 8.0
        
        // System.out.println(s3.averageScore()); // 8.0
    }
}
