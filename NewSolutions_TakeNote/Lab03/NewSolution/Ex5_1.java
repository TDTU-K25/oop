public class Ex5_1 {
    public static String[][] countFrequency(String str) {
        str = str.replace(",", "");
        str = str.replace(".", "");
        
        String[] words = str.split(" ");
        String[] temp = new String[words.length];
        int countUnique = 0;
        
        for (int i = 0; i < words.length; i++) {
            boolean exist = false;
            for (String tempString : temp) {
                if (words[i].equalsIgnoreCase(tempString)) {
                    exist = true;
                    break;
                }
            }

            if (!exist) {
                temp[i] = words[i];
                countUnique++;
            }
        }

        int[] frequency = new int[countUnique];
        for (String word : words) {
            for (int i = 0; i < countUnique; i++) {
                if (word.equalsIgnoreCase(temp[i])) {
                    frequency[i]++;
                }
            }
        }

        String[][] result = new String[countUnique][2];
        
        for (int i = 0; i < result.length; i++) {
            result[i][0] = temp[i];
            result[i][1] = Integer.toString(frequency[i]);
        }

        return result;
    }
    public static void main(String[] args) {
        String para = new String("You are living on a Plane. What you style Flatland is the vast level surface of what I may call a fluid, on, or in, the top of which you and your countrymen move about, without rising above it or falling below it.");
        countFrequency(para);
    }
}
