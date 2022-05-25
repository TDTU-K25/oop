import java.util.Scanner;

public class Ex5 {

    public static boolean isLeapYear(int year) {
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter year: ");
        int year = sc.nextInt();
        
        if(isLeapYear(year))
            System.out.print(year + " is a leap year");
        else 
            System.out.print(year + " is a normal year");

        sc.close();
    }
}