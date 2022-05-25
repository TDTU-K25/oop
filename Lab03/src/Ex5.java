public class Ex5 {
    public static String[][] countWordsAppear(String str) {
        String[] words = str.split(" ");
        for (int i = 0; i < words.length; i++) {
            char[] strToArrayChar = words[i].toCharArray();
            String temp = "";
            // remove punctuation in word 
            for (int j = 0; j < strToArrayChar.length; j++) {
                if ((strToArrayChar[j] >= 65 && strToArrayChar[j] <=90) || (strToArrayChar[j] >= 97 && strToArrayChar[j] <= 122)) {
                    temp += strToArrayChar[j];
                }
            }
            words[i] = temp;
        }
        
        int[] tempArr = new int[words.length]; // array to mark duplicate words except the first appearance of each word
        for (int i = 0; i < words.length - 1; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].compareToIgnoreCase(words[j]) == 0) {
                    tempArr[j] = -1;
                }
            }
        }

        // the number of words after remove duplicate words
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            if (tempArr[i] != -1) {
                count++;
            }
        }

        // Create 2-dimension array with the number of rows is the number of words after remove duplicate words and two column is word and its frequency
        String[][] result = new String[count][2];

        // Store word into 2-dimension array
        int k = 0;
        for (int i = 0; i < words.length; i++) {
            if (tempArr[i] != -1) {
                result[k][0] = words[i];
                k++;
            }
        }

        // Store frequency of words appears into array
        int l = 0;
        for (int i = 0; i < words.length - 1; i++) {
            int countWords = 1; // each word appear at least 1 time 
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].compareToIgnoreCase(words[j]) == 0) {
                    countWords++;
                }
            }
            if (tempArr[i] != -1) {
                result[l][1] = Integer.toString(countWords); // int -> String
                l++;
            }
        }

        return result;
    }

    public static void printResult(String[][] result) {
        for (int i = 0; i < result.length; i++) {
                if (i == result.length - 1)
                    System.out.println("\'" + result[i][0] + "\': " + result[i][1]);
                else
                    System.out.println("\'" + result[i][0] + "\': " + result[i][1] + ",");
        }
    }

    public static void main(String[] args) {
        String para = new String("You are living on a Plane. What you style Flatland is the vast level surface of what I may call a fluid, on, or in, the top of which you and your countrymen move about, without rising above it or falling below it.");
        String[][] result = countWordsAppear(para);
        printResult(result);
    }
}
