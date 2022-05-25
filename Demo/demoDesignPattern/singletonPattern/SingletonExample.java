class SingletonExample {
    private static SingletonExample singletonExample; // private static SingletonExample singletonExample = null;
    // By default, if no object is passed to a reference variable then it will store a null value.

    private SingletonExample() {

    }

    public static SingletonExample getInstance() {
        if (singletonExample == null) {
            singletonExample = new SingletonExample();
        }
        return singletonExample;
    }

    public void display() {
        System.out.println("Welcome to Singleton Design Pattern");
    }
}