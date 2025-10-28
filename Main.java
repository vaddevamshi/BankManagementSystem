import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Account> accounts = new ArrayList<>();

        while (true) {
            System.out.println("\n==== BANK MANAGEMENT SYSTEM ====");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. View Details");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter Account Number: ");
                    int accNo = sc.nextInt();
                    sc.nextLine(); 
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Initial Deposit: ");
                    double balance = sc.nextDouble();
                    accounts.add(new Account(accNo, name, balance));
                    System.out.println("Account created successfully!");
                }

                case 2 -> {
                    System.out.print("Enter Account Number: ");
                    int accNo = sc.nextInt();
                    System.out.print("Enter Amount to Deposit: ");
                    double amount = sc.nextDouble();
                    Account acc = findAccount(accounts, accNo);
                    if (acc != null) {
                        acc.deposit(amount);
                    } else {
                        System.out.println("Account not found!");
                    }
                }

                case 3 -> {
                    System.out.print("Enter Account Number: ");
                    int accNo = sc.nextInt();
                    System.out.print("Enter Amount to Withdraw: ");
                    double amount = sc.nextDouble();
                    Account acc = findAccount(accounts, accNo);
                    if (acc != null) {
                        acc.withdraw(amount);
                    } else {
                        System.out.println("Account not found!");
                    }
                }

                case 4 -> {
                    System.out.print("Enter Account Number: ");
                    int accNo = sc.nextInt();
                    Account acc = findAccount(accounts, accNo);
                    if (acc != null) {
                        acc.showDetails();
                    } else {
                        System.out.println("Account not found!");
                    }
                }

                case 5 -> {
                    System.out.println("Exiting... Thank you!");
                    sc.close();
                    return;
                }

                default -> System.out.println("Invalid choice! Try again.");
            }
        }
    }


    static Account findAccount(ArrayList<Account> accounts, int accNo) {
        for (Account acc : accounts) {
            if (acc.accountNumber == accNo)
                return acc;
        }
        return null;
    }
}
