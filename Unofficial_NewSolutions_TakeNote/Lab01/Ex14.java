import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("----Menu----");
            System.out.println("1. Coca");
            System.out.println("2. Pepsi");
            System.out.println("3. Sprite");
            System.out.println("4. Snack");
            System.out.println("5. Shutdown Machine");
            System.out.println("Please enter the number: ");

            choice = sc.nextInt();

            double price, pay;

            switch (choice) {
                case 1: 
                    price = 2;
                    System.out.println("The price of Coca is "+ price + "$, please enter the amount of money: ");
                    pay = sc.nextDouble();
                    if (pay >= price)
                        System.out.println("Your change: " + (pay - price));
                    else
                        System.out.println("Not enough money to buy this item. Please select again.");
                    break;
                case 2:
                    price = 1.5;
                    System.out.println("The price of Pepsi is "+ price + "$, please enter the amount of money: ");
                    pay = sc.nextDouble();
                    if (pay >= price)
                        System.out.println("Your change: " + (pay - price));
                    else
                        System.out.println("Not enough money to buy this item. Please select again.");
                    break;
                case 3:
                    price = 1;
                    System.out.println("The price of Sprite is "+ price + "$, please enter the amount of money: ");
                    pay = sc.nextDouble();
                    if (pay >= price)
                        System.out.println("Your change: " + (pay - price));
                    else
                        System.out.println("Not enough money to buy this item. Please select again.");
                    break;
                case 4:
                    price = 0.5;
                    System.out.println("The price of Snack is "+ price + "$, please enter the amount of money: ");
                    pay = sc.nextDouble();
                    if (pay >= price)
                        System.out.println("Your change: " + (pay - price));
                    else
                        System.out.println("Not enough money to buy this item. Please select again.");
                    break;
                case 5:
                    System.out.println("Machine is shutting down.");
                    break;
                default: 
                    System.out.println("Please enter the valid number");
                    break;
            }
        } while(choice != 5);
        sc.close();
    }
}