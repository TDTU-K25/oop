import java.util.Scanner;

public class Ex3 {
    public static int remainderOfDivision(int diviend, int divisor) {
        return diviend % divisor;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter diviend: ");
        int diviend = sc.nextInt();

        System.out.print("Enter divisor: ");
        int divisor = sc.nextInt();

        System.out.println(remainderOfDivision(diviend,divisor));

        sc.close();
    }
}