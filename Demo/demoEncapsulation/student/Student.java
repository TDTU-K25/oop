// Service Class (no main method)
// default visibility (no modifier before class name)
class Student {
    // Attributes
    public static final int MAX_LEG = 2; // class attribute
    public static final int MAX_ARM = 2; // class attribute
    private String studentID; // instance attribute
    private String fullName; // instance attribute
    private String country; // instance attribute
    private double wallet; // instance attribute
 
    // Constructor
    public Student() {
        this("99999999", "Nguyen Van A", "VietNam", 3000.75); // call another constructor (code reuse)
    };// default constructor 
                        // By default, numeric attributes are initialized to 0
                        // object attributes are initialized to null

    public Student(String studentID, String fullName, String country, double wallet) { // overloaded constructor
        this.studentID = studentID; // this.studentID is attribute of object of Student Class, studentID is parameter that user enters
        this.fullName = fullName; 
        this.country = country;
        this.wallet = wallet;
    }

    // Accessor
    public String getStudentID() {
        return this.studentID; // this.studentID is attribute of object of Student Class 
    }

    public String getFullName() {
        return this.fullName;
    }

    public String getCountry() {
        return this.country;
    }

    public double getWallet() {
        return this.wallet;
    }

    // Mutators
    public void payForLiving(double costOfLiving) {
        if (this.wallet < costOfLiving)
            return;
        this.wallet -= costOfLiving;
    }

    // public boolean payForLiving(double costOfLiving) {
    //     if (this.wallet < costOfLiving)
    //         return false;
    //     this.wallet -= costOfLiving;
    //     return true;
    // }

    public void depositWallet(double amount) {
        if (amount < 0)
            return;
        wallet += amount;
    }

    public void printInfo() {
        System.out.println("Student ID: " + this.studentID);
        System.out.println("Full name: " + this.fullName);
        System.out.println("Country: " + this.country);
        System.out.println("Wallet: " + this.wallet);
    }

    // Methods
    public void calling() {
        System.out.println("Hey!");
    }

    // Overriding method 
    public String toString() {
        return "[" + getStudentID() + ", " + getFullName() + ", " + getCountry() + ", " + getWallet() + "]";
    }
}
