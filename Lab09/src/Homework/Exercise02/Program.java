import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

public class Program {

    public static ArrayList<Integer> readFile(String fileName) {
        ArrayList<Integer> myList = new ArrayList<Integer>();
        File input = new File(fileName);
        try {
            Scanner sc = new Scanner(input);
            while(sc.hasNextInt()) {
                int value = sc.nextInt();
                myList.add(value);
            }
            sc.close();
            return myList;
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            return null;
        }
    }

    public static Integer sumOfAllElements(ArrayList<Integer> lst) {
        int sum = 0;
        for (Integer element : lst) {
            sum += element;
        }
        return sum;
    }

    public static void writeToFile(String fileName, Integer sum) {
        try {
            FileWriter myWriter = new FileWriter(fileName);
            myWriter.write(String.valueOf(sum)); // convert Integer to String if we write an Integer object to file => There will be a question mark
            myWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> listIntNums = readFile("input.txt");
        if (listIntNums == null) {
            return;
        }
        writeToFile("output.txt", sumOfAllElements(listIntNums));
    }
}