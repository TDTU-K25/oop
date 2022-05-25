public class Ex3 {
    public static String getFirstAndLastName(String str) {
        String[] words = str.split(" ");
        String firstName = words[words.length-1];
        String lastName = words[0];
        return (lastName + " " + firstName);
    }

    public static String getMiddleName(String str) {
        String[] words = str.split(" ");
        String middleName = "";
        for (int i = 1; i < words.length - 1; i++) {
            middleName += (words[i] + " ");
        }
        return middleName.trim();
    }

    public static String capitalizeFullName(String str) {
        String[] words = str.split(" ");
        String fullNameAfterCapitalize = "";
        for (String word : words) {
            char firstChar = word.charAt(0); 
            firstChar = Character.toUpperCase(firstChar); 
            String remainCharsInWord = word.substring(1);
            fullNameAfterCapitalize += (firstChar + remainCharsInWord + " ");
        }
        return fullNameAfterCapitalize.trim();
    }

    public static String uppercaseVowelsAndLowercaseConsonantsInWord(String str) {
        String[] words = str.split(" ");
        String temp = "";
        for (String word : words) {
            char[] strToArrayChar = word.toCharArray();
            for (int i = 0; i < strToArrayChar.length; i++) {
                if (strToArrayChar[i] == 'u' || strToArrayChar[i] == 'e' || strToArrayChar[i] == 'o' || strToArrayChar[i] == 'a' || strToArrayChar[i] == 'i') {
                    strToArrayChar[i] = Character.toUpperCase(strToArrayChar[i]); 
                }
                else {
                    strToArrayChar[i] = Character.toLowerCase(strToArrayChar[i]); 
                }
            }
            String newWord = new String(strToArrayChar);
            temp += (newWord + " ");
        }
        return temp.trim();
    }

    public static void main(String[] args) {
        String fullName = "Nguyen Thi Thu Thao";
        System.out.println(getFirstAndLastName(fullName));
        System.out.println(getMiddleName(fullName));
        System.out.println(capitalizeFullName(fullName));
        System.out.println(uppercaseVowelsAndLowercaseConsonantsInWord(fullName));
    }
}
