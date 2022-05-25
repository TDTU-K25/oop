public class SingletonTest {
    public static void main(String[] args) {
        SingletonExample singletonExample = SingletonExample.getInstance();
        SingletonExample temp = SingletonExample.getInstance();

        // Can create lots of reference variables but just only point to only one object 
        System.out.println(singletonExample);
        System.out.println(temp);
        // Both of them have the same object identifier
        
        singletonExample.display();
    }
}