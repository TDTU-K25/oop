final class ClassC extends ClassB {
    private int value;
    
    public ClassC() {
        
    }
    
    public ClassC(int val) {
        super.value = val - 1;
        value = val;
    }
    
    public void print() {
        super.print();
        System.out.println("Class C: value = " + value);
    }
}