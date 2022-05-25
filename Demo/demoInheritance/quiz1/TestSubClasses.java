public class TestSubClasses {
    public static void main(String[] args) {
        ClassA objA = new ClassA(123);
        ClassB objB = new ClassB(456);
        ClassC objC = new ClassC(789);
        objA.print(); System.out.println("---------"); // Class A: value = 123;
        objB.print(); System.out.println("---------"); // Class A: value = 455, Class B: value = 456
        objC.print(); // Class A: value = 0, Class B: value = 788, Class C: value = 789
    }
}
