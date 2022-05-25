import java.util.HashMap;
import java.util.Scanner;

public class EnglishToVietnameseDictionary {

    private static boolean isWordInDictionary(HashMap<String, String> dict, String word) {
        for (String key : dict.keySet()) {
            if (word.equals(key)) {
                return true;
            }
        }
        return false;
    }

    public static String meaningOfWord(HashMap<String, String> dict, String word) {
        if (isWordInDictionary(dict, word)) {
            for (String key : dict.keySet()) {
                if (key.equals(word)) {
                    return dict.get(key);
                }
            }
        }
        return "Doesn't exist in dictionary";
    }

    public static void main(String[] args) {
        HashMap<String, String> EnToVnDict = new HashMap<String, String>();
        Scanner sc = new Scanner (System.in);

        EnToVnDict.put("hello", "xin chao");
        EnToVnDict.put("handsome", "dep trai");
        EnToVnDict.put("height", "chieu cao");
        EnToVnDict.put("weight", "can nang");
        EnToVnDict.put("smart", "thong minh");
        EnToVnDict.put("stupid", "ngoc");
        EnToVnDict.put("fast", "nhanh");
        EnToVnDict.put("slow", "cham");
        EnToVnDict.put("triangle", "hinh tam giac");
        EnToVnDict.put("square", "hinh vuong");

        System.out.print("Enter word you want to look up: ");
        String word = sc.nextLine();
        System.out.println(String.format("%s", meaningOfWord(EnToVnDict, word)));
    }
}
