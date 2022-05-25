public class Test {
    public static void main(String[] args) {
        // A a = new C(); // Cat is Animal
        // a.m();
        // Execution result: "C.m" 
        // Superclass (A) có method m(), subclass(C) có method m() (override) => Gọi method m() của C class

        // B b = new A(); // Animal is Bee -> Wrong
        // b.n();
        // Compilation Error: subclass substitutability
        // Super sp = new Sub(); Đúng
        // Sub sb = new Super(); Sai

        // A a = new B(); // Bat is Animal
        // a.m();
        // Execution result: "A.m"
        // Superclass (A) có method m(), subclass(B) có method m() (không override) => Gọi method m() của B class là method m() của A class vì method m() của B class không override

        // A a;
        // C c = new D(); // C là con trỏ 
        // a = c; // a = new D(); (a, c cùng tham chiếu đến 1 địa chỉ)
        // a.n(); 
        // Execution result: "D.n"
        // Superclass (A) có method n(), subclass(D) có method n() (override) => Gọi method n() của D class

        // B b = new D();
        // b.p();
        // Compilation Error: There isn't any relationship between class B and class D

        // C c = new C();
        // c.n();
        // Execution result: "A.n"
        // Superclass (A) có method n(), subclass(C) có method n() (không override) => Gọi method n() của C class là method n() của A class vì method m() của C class không override

        // A a = new D();
        // a.p(); 
        // Compilation Error: A class doesn't own p() method
        // Superclass (A) KHÔNG có method p(), subclass(D) có method p() => LỖI
    }
}
