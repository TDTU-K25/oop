import java.math.BigDecimal;

public class Ex8 {

    public static BigDecimal findMax(BigDecimal[] arr) {
        BigDecimal max = arr[0];
        for (BigDecimal element : arr) {
            if (element.compareTo(max) == 1)
                max = element;
        }
        return max;
    }
    public static void main(String[] args) {
        BigDecimal[] arr = new BigDecimal[5];
        arr[0] = new BigDecimal(5);
        arr[1] = new BigDecimal(2);
        arr[2] = new BigDecimal(4);
        arr[3] = new BigDecimal(9);
        arr[4] = new BigDecimal(7);
        System.out.println("The maximum value of an BigDecimal object array is " + findMax(arr));
    }
}
