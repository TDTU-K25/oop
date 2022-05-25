public class StringEx1 {
    public static String shortName(String str) {
        String[] words = str.split(" ");
        String firstName = words[words.length - 1];
        String lastName = words[0];
        return firstName + " " + lastName;
    }

    public static String hashtagName(String str) {
        String[] words = str.split(" ");
        String firstName = words[words.length - 1];
        String lastName = words[0];
        return "#" + firstName + lastName;
    }

    public static String upperCaseAllVowel(String str) {
        String[] words = str.split(" ");
        String result = "";
        for (String word : words) {
            String temp = "";
            char[] strToArrayOfChar = word.toCharArray();
            for (int i = 0; i < strToArrayOfChar.length; i++) {
                if (strToArrayOfChar[i] == 'u' || strToArrayOfChar[i] == 'e' || strToArrayOfChar[i] == 'o' || strToArrayOfChar[i] == 'a' || strToArrayOfChar[i] == 'i') {
                    strToArrayOfChar[i] = Character.toUpperCase(strToArrayOfChar[i]);
                }
                temp += strToArrayOfChar[i];
            }
            result += (temp + " ");
        }
        return result.trim();
    }

    public static String upperCaseAllN(String str) {
        String[] words = str.split(" ");
        String result = "";
        for (String word : words) {
            String temp = "";
            char[] strToArrayOfChar = word.toCharArray();
            for (int i = 0; i < strToArrayOfChar.length; i++) {
                if (strToArrayOfChar[i] == 'n') {
                    strToArrayOfChar[i] = Character.toUpperCase(strToArrayOfChar[i]);
                }
                temp += strToArrayOfChar[i];
            }
            result += (temp + " ");
        }
        return result.trim();
    }

    public static void main(String[] args) {
        String fullName = "Nguyen Le Trong Tin";
        System.out.println(shortName(fullName));
        System.out.println(hashtagName(fullName));
        System.out.println(upperCaseAllVowel(fullName));
        System.out.println(upperCaseAllN(fullName));
    }
}
