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
        String strAfterUpperCaseAllVowel = "";
        for (String word : words) {
            String temp = "";
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == 'u' || word.charAt(i) == 'e' || word.charAt(i) == 'o' || word.charAt(i) == 'a' || word.charAt(i) == 'i') {
                    temp += Character.toUpperCase(word.charAt(i));
                }
                else {
                    temp += word.charAt(i);
                }
            }
            strAfterUpperCaseAllVowel += (temp + " ");
        }
        return strAfterUpperCaseAllVowel.trim();
    }

    public static String upperCaseAllN(String str) {
        String[] words = str.split(" ");
        String strAfterUpperCaseAllN = "";
        for (String word : words) {
            String temp = "";
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == 'n') {
                    temp += Character.toUpperCase(word.charAt(i));
                }
                else {
                    temp += word.charAt(i);
                }    
            }
            strAfterUpperCaseAllN += (temp + " ");
        }
        return strAfterUpperCaseAllN.trim();
    }

    public static void main(String[] args) {
        String fullName = "Nguyen Le Trong Tin";
        System.out.println(shortName(fullName));
        System.out.println(hashtagName(fullName));
        System.out.println(upperCaseAllVowel(fullName));
        System.out.println(upperCaseAllN(fullName));
    }
}
