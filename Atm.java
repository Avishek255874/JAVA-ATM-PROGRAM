import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        int balance = 1000;
        int withdraw, deposit;
        int choice;
        System.out.println("Welcome to the ATM");
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("\nChoose your transaction:");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Exit");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.printf("Your balance is: $%d\n", balance);
                    break;
                case 2:
                    System.out.print("Enter the amount to withdraw: ");
                    withdraw = scanner.nextInt();
                    if (withdraw > balance) {
                        System.out.println("Insufficient balance. Try again.");
                    } else {
                        balance -= withdraw;
                        System.out.printf("Withdrawal successful. Your updated balance is: $%d\n", balance);
                    }
                    break;
                case 3:
                    System.out.print("Enter the amount to deposit: ");
                    deposit = scanner.nextInt();
                    balance += deposit;
                    System.out.printf("Deposit successful. Your updated balance is: $%d\n", balance);
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM. Have a nice day!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 4);
        scanner.close();
    }
}
