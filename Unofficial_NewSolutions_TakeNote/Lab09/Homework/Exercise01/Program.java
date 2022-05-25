import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FilenameFilter; // Interface => accept(File dir, String name) is abstract method
import java.util.Scanner;
import java.util.ArrayList;

public class Program {

    public static ArrayList<String> readFile(String pathName) {
        ArrayList<String> listWord = new ArrayList<String>();
        try {
            File input = new File(pathName);
            Scanner sc = new Scanner(input);
            while(sc.hasNext()) {
                String word = sc.next();
                String wordAfterRemovePunctuation = removePunctuations(word); // String is immutable => We must assign to another String object
                listWord.add(wordAfterRemovePunctuation);
            } 
            sc.close();
            return listWord;
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            return null;
        }
    }

    public static String removePunctuations(String word) {
        word = word.replace(",", ""); // String is immutable 
        word = word.replace(".", ""); // String is immutable
        word = word.replace("\"", ""); // String is immutable
        word = word.replace(":", ""); // String is immutable
        return word;
    }

    public static String[] findListFilesWithSameExtensionInFolder(String pathName, String extension) {
        File directoryPath = new File(pathName);
        FilenameFilter filter = new FilenameFilter() { // instantiate an anonymous class from an interface
        // Once we have instantiated an anonymous class, we can assign that instance to a variable in order to be able to reference it somewhere later
            @Override
            public boolean accept(File dir, String name) {
               if (name.toLowerCase().endsWith(extension)) {
                  return true;
               } else {
                  return false;
               }
            }
        };

        String[] listFilesWithSameExtension = directoryPath.list(filter);
        return listFilesWithSameExtension;
    }

    public static boolean isFile(String pathName) {
        File temp = new File(pathName);
        if(temp.isDirectory()) {
            return false;
        }
        return true;
    }

    public static void isExist(String pathName) {
        File temp = new File(pathName);
        if (temp.exists() && isFile(pathName)) {
            System.out.println("File exists");
        } 
        else if (temp.exists() && !isFile(pathName)) {
            System.out.println("Directory exists");
        } 
        else {
            System.out.println("File/Directory doesn't exist");
        }
    }

    public static void appendText(String pathName, String content) {
        try {
            FileWriter myWriter = new FileWriter(pathName, true);
            myWriter.write(content);
            myWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
        }
    }

    public static String findLongestWord(ArrayList<String> data) {
        String longestWord = data.get(0);
        for (String str : data) {
            if (str.length() > longestWord.length()) {
                longestWord = str;
            }
        }
        return longestWord;
    }

    public static void main(String[] args) {
        ArrayList<String> data = readFile("paragraph.txt");

        // Check if a file or directory specified by pathname exists or not
        // isExist("..\\Exercise01");
        // isExist("paragraph.txt");
        // isExist("demo.txt");
        // isExist("..\\Demo");

        // Check if given pathname is a directory or a file
        // System.out.println(isFile("..\\Exercise01")); // Directory
        // System.out.println(isFile("paragraph.txt")); // File
        
        // Append text to an existing file
        // appendText("paragraph.txt", " Flatland: A Romance of Many Dimensions, Edwin A Abbott");
        
        // Find the longest word in a text file
        // System.out.println(findLongestWord(data));
    }
}
