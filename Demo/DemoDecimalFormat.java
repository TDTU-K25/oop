import java.text.DecimalFormat;
import java.util.Scanner;

public class DemoDecimalFormat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Lưu ý rằng số chữ số ở phần nguyên là không cố định, tức là dù có khai báo là 3 dấu "#" ở phần nguyên,
        // thì vẫn có thể xử lý một số có phần nguyên là 5 hoặc 8 chữ số

        // ở đây cứ 3 số nguyên sẽ được ngăn cách bằng 1 dấu phẩy
        // phần thập phân và phần nguyên được ngăn cách bởi dấu chấm
        double money = 250000.235;
        DecimalFormat formatCurrency = new DecimalFormat("$###,###.##");
        System.out.println(money + " -> " + formatCurrency.format(money));
    
        // Ở phần thập phân thì sẽ được làm tròn đến đúng với số lượng dấu #
        DecimalFormat formatPercent = new DecimalFormat("###.##%");
        double percent = 0.082;
        System.out.println(percent + " -> " + formatPercent.format(percent));

        sc.close();
    }
}
