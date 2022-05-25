import java.util.Scanner;

public class Ex7 {

    public static boolean isAlphanumeric(char c) {
        if((c >= 48 && c <= 57) || ((c >= 65 && c <=90) || (c >= 97 && c <= 122)))
			return true;
		else 
		    return false;
    } 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter character: ");
        char c = sc.nextLine().charAt(0);

        if(isAlphanumeric(c))
            System.out.println(c + " is alphanumeric");
        else
            System.out.println(c + " isn't alphanumeric");

        sc.close();
    }
}