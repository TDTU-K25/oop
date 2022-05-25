class ClassB extends ClassA {
    protected int value;

    public ClassB() {

    }

    public ClassB(int val) {
        super.value = val - 1;
        value = val;
    }
    
    public void print() {
        super.print();
        System.out.println("Class B: value = " + value);
    }
}