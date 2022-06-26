public class Test {
    public static void main(String[] args) {
        // Using the subclasses
        Cat c1 = new Cat("Kitty");
        // c1.greets(); // "Meow"
        Dog d1 = new Dog("Ben");
        // d1.greets(); // ""Woof""
        BigDog bd1 = new BigDog("Kai");
        // bd1.greets(); // "Wooow"
         
        // Using Polymorphism
        Animal a1 = new Cat("Bi");
        // a1.greets(); // find greets() method in Animal class 
        //-> if method exist => invoke greets() method in Cat class
        //-> else => Compile error because Animal class doesn't have greets() method 
        Animal a2 = new Dog("Zen"); 
        // a2.greets(); // ""Woof""
        Animal a3 = new BigDog("");
        // a3.greets(); // "Wooow"
        // Animal a4 = new Animal(); // Compile error: can't create an object from abstract class
        
        // Downcast
        Dog d2 = (Dog) a2;
        BigDog bd2 = (BigDog)a3; 
        Dog d3 = (Dog)a3; // BigDog is subclass of Dog 
        // Cat c2 = (Cat)a2; // Compile error: Dog can't be cast to Cat
        d2.greets(d3); // "Woooof" 
        d3.greets(d2); // "Woooof" (Wrong) => Execution result must be "Woooooow"
        // d2.greets(bd2); // "Woooof"
        // bd2.greets(d2); // "Woooooow"
        // bd2.greets(bd1); // "Woooooooow"
    }
}