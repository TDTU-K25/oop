public class Test {
    public static void main(String args[]) {
        Integer[] intArray = { 1, 2, 3, 4, 5 };
        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
        Character[] charArray = { 'T', 'D', 'T', 'U' };
        System.out.println("Array integerArray contains:");
        GenericMethod.printArray(intArray);
        System.out.println("\nArray doubleArray contains:");
        GenericMethod.printArray(doubleArray);
        System.out.println("\nArray characterArray contains:");
        GenericMethod.printArray(charArray);
    }
}