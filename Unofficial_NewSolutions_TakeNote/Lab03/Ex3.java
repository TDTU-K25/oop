public class Ex3 {
    // String is immutable
    public static String getFirstAndLastName(String str) {
        String[] words = str.split(" "); // find out more about split (instance method)
        return (words[0] + " " + words[words.length-1]);
    }

    public static String getMiddleName(String str) {
        String[] words = str.split(" ");
        String middleName = "";
        for (int i = 1; i < words.length - 1; i++) {
            middleName += (words[i] + " ");
        }
        return middleName.trim(); // find out more about trim (instance method)
    }

    public static String capitalizeFullName(String str) {
        String[] words = str.split(" ");
        String fullNameAfterCapitalize = "";
        for (String word : words) {
            char firstChar = word.charAt(0); // find out more about CharAt method
            firstChar = Character.toUpperCase(firstChar); // find out more about toUpperCase method of wrapper class Character
            String remainCharsInWord = word.substring(1); // find out more about substring method
            fullNameAfterCapitalize += (firstChar + remainCharsInWord + " ");
        }
        return fullNameAfterCapitalize.trim();
    }

    public static String uppercaseVowelsAndLowercaseConsonantsInWord(String str) {
        String[] words = str.split(" ");
        String temp = "";
        for (String word : words) {
            char[] strToArrayChar = word.toCharArray(); // find out more about toCharArray method
            for (int i = 0; i < strToArrayChar.length; i++) {
                strToArrayChar[i] = Character.toUpperCase(strToArrayChar[i]);
                if (strToArrayChar[i] == 'U' || strToArrayChar[i] == 'E' || strToArrayChar[i] == 'O' || strToArrayChar[i] == 'A' || strToArrayChar[i] == 'I') {
                    strToArrayChar[i] = Character.toUpperCase(strToArrayChar[i]); // find out more about wrapper class Character (method)
                }
                else {
                    strToArrayChar[i] = Character.toLowerCase(strToArrayChar[i]); // find out more about wrapper class Character (method) 
                }
            }
            String newWord = new String(strToArrayChar);
            temp += (newWord + " ");
        }
        return temp.trim();
    }

    public static void main(String[] args) {
        String fullName = "Nguyen Van Chien";
        System.out.println(getFirstAndLastName(fullName));
        System.out.println(getMiddleName(fullName));
        System.out.println(capitalizeFullName(fullName));
        System.out.println(uppercaseVowelsAndLowercaseConsonantsInWord(fullName));
    }
}
