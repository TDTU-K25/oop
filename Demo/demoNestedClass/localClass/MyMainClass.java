class OuterClass {
    int x = 10;

    public int methodA() {
        class InnerClass {
            int y = 5;
        }
        InnerClass myInner = new InnerClass();
        return x + myInner.y;
    }
}

public class MyMainClass {
    public static void main(String[] args) {
        OuterClass myOuter = new OuterClass();
        System.out.println(myOuter.methodA());
    }
}