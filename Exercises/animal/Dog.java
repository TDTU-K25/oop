public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void greets() {
        System.out.println("Woof");
    }

    // Overloading 
    // This method doesn't exist in Animal Class 
    public void greets(Dog another) {
        System.out.println("Woooof");
    }
}