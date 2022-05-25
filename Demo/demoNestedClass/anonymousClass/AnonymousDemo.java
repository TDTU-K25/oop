interface Age {
    void getAge();
}

class AnonymousDemo {
    public static void main(String[] args) {
        // MyClass is hidden inner class of Age interface
        // whose name is not written but an object to it
        // is created.

        // Age oj1 = new Age(); Can't create an object from interface
        Age oj1 = new Age() {
            int x = 21;

            @Override
            public void getAge() {
                // printing age
                System.out.print("Age is " + x);
            }
        }; 
        // anonymous class is declared within curly brackets
        // an anonymous class declaration is an expression, hence it must be a part of a statement. This explains why we have put a semicolon at the end of the statement.
        oj1.getAge();
    }
}