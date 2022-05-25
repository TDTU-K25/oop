public class StringEx2 {
    public static String removePunctuationsOfParagraph(String paragraph) {
        String[] words = paragraph.split(" ");
        String paragraphAfterRemovePunctuations = "";
        for (String word : words) {
            char[] strToArrayOfChar = word.toCharArray();
            String temp = "";
            for (int i = 0; i < strToArrayOfChar.length; i++) {
                if ((strToArrayOfChar[i] >= 65 && strToArrayOfChar[i] <= 90) || (strToArrayOfChar[i] >= 97 && strToArrayOfChar[i] <= 122)) {
                    temp += strToArrayOfChar[i];
                }
            }
            paragraphAfterRemovePunctuations += (temp + " ");
        }
        return paragraphAfterRemovePunctuations.trim();
    }

    public static int countWord(String paragraph) {
        paragraph = removePunctuationsOfParagraph(paragraph);
        String[] words = paragraph.split(" ");
        return words.length;
    } 

    // Xem lại
    public static int countSentences(String paragraph) {
        String[] sentences = paragraph.split("\\. "); 
        for (String setence : sentences) {
            System.out.println(setence);
        }
        return sentences.length;
    }

    public static int countAppear(String paragraph, String word) {
        paragraph = removePunctuationsOfParagraph(paragraph);
        String[] words = paragraph.split(" ");
        int count = 0;
        for (String element : words) {
            if (element.compareToIgnoreCase(word) == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String paragraph = new String("The Edge Surf is of course also a whole lot better, which will hopefully win Microsoft some converts. It offers time trial, support for other input methods like touch and gamepads, accessibility improvements, high scores, and remastered visuals.");
        System.out.println(countWord(paragraph));
        System.out.println(countSentences(paragraph));
        System.out.println(countAppear(paragraph, "will"));
    }
}
