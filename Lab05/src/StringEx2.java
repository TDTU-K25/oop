public class StringEx2 {
    public static String removePunctuationsOfParagraph(String paragraph) {
        paragraph = paragraph.replace(",", "");
        paragraph = paragraph.replace(".", "");
        return paragraph;
    }

    public static int countWord(String paragraph) {
        paragraph = removePunctuationsOfParagraph(paragraph);
        String[] words = paragraph.split(" ");
        return words.length;
    } 

    public static int countSentences(String paragraph) {
        String[] sentences = paragraph.split("\\. "); 
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
        System.out.println(countAppear(paragraph, "better"));
    }
}
