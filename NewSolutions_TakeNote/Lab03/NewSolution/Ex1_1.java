import java.util.Arrays;

public class Ex1_1 {

    public static int[] arrayOfDuplicateValues(int[] a) {
        int[] temp = new int[a.length]; // Temp array to store duplicate values
        int countDuplicateValues = 0; // Count duplicate values
        for (int i = 0; i < a.length; i++) { // go through each element in the main array
            boolean exist = false; // Suppose the element which we consider doesn't exist in the temp array
            for (int num : temp) { // go through each element in the temp array
                if (a[i] == num) {
                    exist = true;
                    break;
                }
            }
            if (exist) { // if the element already exists in temp array that mean it is duplicate value => skip
                continue;
            }     

            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    temp[countDuplicateValues] = a[i];
                    countDuplicateValues++;
                    break;
                }
            }
        }

        int[] result = new int [countDuplicateValues]; // Create a return array with the size of the number of duplicate values
        for (int i = 0; i < result.length; i++) {
            result[i] = temp[i];
        }
        return result;
        
    }

    public static int[] arrayAfterRemoveDuplicateValues(int[] a) {
        int[] temp = new int[a.length]; // Temp array to store numbers that appear once
        int countUnique = 0; // Count all the numbers appear one time
        for (int i = 0; i < a.length; i++) { // go through each element in the main array
            boolean exist = false; // Suppose the element which we consider doesn't exist in the temp array
            for (int num : temp) { // go through each element in the temp array
                if (a[i] == num) {
                    exist = true;
                    break;
                }
            }
            if (!exist) { // temp array without element in consideration => add element to it
                temp[i] = a[i];
                countUnique++;
            }
        }

        int[] result = new int[countUnique]; // Create a return array with the size of the number of elements that appear once

        
        int j = 0;
        for (int i = 0; i < a.length; i++) {
            boolean exist = false;
            for (int num : result) { // Suppose the element which we consider doesn't exist in the result array
                if (a[i] == num) { // if the element which is in consideration appears in result array => skip
                    exist = true;
                    break;
                }
            }
            if (!exist) { // if the element which is in consideration doesn't appear in result array => assign it to the result array
                result[j] = a[i];
                j++;
            }
    }
    return result;
}

    public static void main(String[] args) {
        int[] a = {1,3,1,3,2,4};

        int[] result = arrayAfterRemoveDuplicateValues(a);
        System.out.println(Arrays.toString(result));

        System.out.println();

        result = arrayOfDuplicateValues(a);
        System.out.println(Arrays.toString(result));
    }
}
