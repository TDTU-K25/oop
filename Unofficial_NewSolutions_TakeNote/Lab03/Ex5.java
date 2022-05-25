public class Ex5 {
    public static String[][] countWordsAppear(String str) {
        String[] words = str.split(" ");
        for (int i = 0; i < words.length; i++) {
            char[] strToArrayChar = words[i].toCharArray();
            String temp = "";
            for (int j = 0; j < strToArrayChar.length; j++) {
                if ((strToArrayChar[j] >= 65 && strToArrayChar[j] <=90) || (strToArrayChar[j] >= 97 && strToArrayChar[j] <= 122)) {
                    temp += strToArrayChar[j];
                }
            }
            words[i] = temp;
        }
        
        int[] tempArr = new int[words.length]; // array to mark duplicate words  
        
        for (int i = 0; i < words.length - 1; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].compareToIgnoreCase(words[j]) == 0) {
                    tempArr[j] = -1;
                }
            }
        }

        int count = 0;
        for (int i = 0; i < words.length; i++) {
            if (tempArr[i] != -1) {
                count++;
            }
        }

        String[][] result = new String[count][2];

        int k = 0;
        for (int i = 0; i < words.length; i++) {
            if (tempArr[i] != -1) {
                result[k][0] = words[i];
                k++;
            }
        }

        int l = 0;
        for (int i = 0; i < words.length - 1; i++) {
            int countWords = 1; // mỗi từ xuất hiện ít nhất 1 lần 
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].compareToIgnoreCase(words[j]) == 0) {
                    countWords++;
                }
            }
            if (tempArr[i] != -1) {
                result[l][1] = Integer.toString(countWords);
                l++;
            }
        }

        return result;
    }

    public static void printResult(String[][] result) {
        for (int i = 0; i < result.length; i++) {
                System.out.println("\'" + result[i][0] + "\': " + result[i][1] + ",");
        }
    }

    public static void main(String[] args) {
        String para = new String("You are living on a Plane. What you style Flatland is the vast level surface of what I may call a fluid, on, or in, the top of which you and your countrymen move about, without rising above it or falling below it.");
        String[][] result = countWordsAppear(para);
        printResult(result);
    }
}
