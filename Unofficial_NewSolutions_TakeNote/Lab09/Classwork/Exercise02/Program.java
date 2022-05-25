import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

public class Program {

    public static ArrayList<String> readFile(String fileName) {

        ArrayList<String> myList = new ArrayList<String>();
        File input = new File(fileName);
        try { 
            Scanner sc = new Scanner(input); // Checked Exception (file not found (wrong path)) => Exception handling

            while(sc.hasNextLine()) { // method indicates whether there is another line or not
                String line = sc.nextLine();
                myList.add(line);
            }
            sc.close();
            return myList;
        } catch (FileNotFoundException e ) { // catch must receive a parameter which is an object of an Exception class 
            System.out.println("File not found.");
            return null;
        }
    }

    public static void writeToFile(String fileName, ArrayList<String> data) {
        try {
            FileWriter myWriter = new FileWriter(fileName);

            /*
            for (String str : data) {   
                myWriter.write(str.toUpperCase());
                myWriter.write(System.lineSeparator()); // In Java you shouldn't use '\n' for newline because in other operating system such as Linux,... '\r\n' is newline character
                // System.lineSeparator() is newline character for suitable OS
            }
            */
            
            for (int i = 0; i < data.size(); i++) {
                myWriter.write(data.get(i).toUpperCase());
                if (i == data.size() - 1) {
                    break;
                }
                myWriter.write(System.lineSeparator());
            }

            myWriter.close();
        } catch(IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ArrayList<String> lines = readFile("input.txt"); // result can be null if you pass a non-exist file
        if (lines == null) {
            return;
        }
        writeToFile("output.txt", lines);
    }
}

