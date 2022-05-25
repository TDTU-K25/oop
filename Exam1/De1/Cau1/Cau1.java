public class Cau1 {
    public static int sumEvenPos(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            if (i % 2 == 0) {
                sum += a[i];
            }
        }
        return sum;
    }

    public static String lowerCaseCharacters(String str) {
        String[] words = str.split(" ");
        String strAfterLowerCaseChars = "";
        for (String word : words) {
            String firstChar = word.substring(0, 1);
            String remainChars = word.substring(1);
            String temp = firstChar;
            char[] strToArrayOfChar = remainChars.toCharArray();
            for (int i = 0; i < strToArrayOfChar.length; i++) {
                strToArrayOfChar[i] = Character.toLowerCase(strToArrayOfChar[i]);
                temp += strToArrayOfChar[i];
            }
            strAfterLowerCaseChars += (temp + " ");
        }
        return strAfterLowerCaseChars.trim();
    }

    public static void main(String[] args) {
        int[] a = {1,-2,3,1,-2,6};
        System.out.println(sumEvenPos(a));

        String s = new String("TrUOng DAi Hoc Ton DuC ThAnG");
        System.out.println(lowerCaseCharacters(s));
    }
}