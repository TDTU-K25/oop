public class Ex4 {
    public static int lengthOfStr(String str) {
        return str.length();
    }

    public static int countNumberOfWordsInStr(String str) {
        String[] words = str.split(" ");
        return words.length;
    }

    public static String concatenateStr(String mainStr, String strWantToConcatWithMainStr) {
        return mainStr + strWantToConcatWithMainStr;
    }

    public static String reverseString(String str) {
        char[] strToArrayChar = str.toCharArray();
        String reverseStr = "";
        for (int i = 0; i < strToArrayChar.length / 2; i++) {
            char temp = strToArrayChar[i];
            strToArrayChar[i] = strToArrayChar[strToArrayChar.length-1-i];
            strToArrayChar[strToArrayChar.length-1-i] = temp;
        }
        for (int i = 0; i < strToArrayChar.length; i++) {
            reverseStr += strToArrayChar[i]; // auto convert char to String
        }
        return reverseStr;
    }

    public static boolean isPalindromeStr(String str) {
        if (str.compareTo(reverseString(str)) == 0)
            return true;
        else   
            return false;
    }

    public static void main(String[] args) {
        // String str = "ABBA";
        // System.out.println(lengthOfStr(str));
        // System.out.println(countNumberOfWordsInStr(str));
        // System.out.println(reverseString(str));  
        // System.out.println(isPalindromeStr(str));
        // String mainStr = "Hello";
        // String strWantToConcatWithMainStr = " World";
        // System.out.println(concatenateStr(mainStr, strWantToConcatWithMainStr));
    }
}
