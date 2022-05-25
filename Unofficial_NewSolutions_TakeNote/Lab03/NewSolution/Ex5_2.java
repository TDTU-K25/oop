public class Ex5_2 {
    public static void frequency(String paragraph) {
        paragraph = paragraph.toLowerCase();
        String[] wordOfpara = paragraph.split("[^a-z0-9A-Z]");
        int[] index = new int[wordOfpara.length];
        for (int i = 0; i < index.length - 1; i++) {
            if (index[i] > -1 && wordOfpara[i].length() > 0) {
                for (int j = i + 1; j < index.length; j++) {
                    if (wordOfpara[i].equals(wordOfpara[j])) {
                        index[i] += 1;
                        index[j] = -1;
                    }
                }
            }
        }
        for (int i = 0; i < index.length; i++) {
            if (index[i] >= 0 && wordOfpara[i].length()>0) {
                System.out.printf("'%s': %d,\n", wordOfpara[i], index[i] + 1);
            }
        }
    }

    public static void main(String[] args) {
        String paragraph = "You are living on a Plane. What you style Flatland is the vast level surface of what I may call a fluid, on, or in, the top of which you and your countrymen move about, without rising above it or falling below it";
        frequency(paragraph);
    }
}