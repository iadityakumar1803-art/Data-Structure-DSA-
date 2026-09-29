public class BankAccounts {
    static Map<Long, Double> accounts = new LinkedHashMap<>();
    // Create account
    public static void createAccount(long accountNo, double balance) {
        // TODO: Write your code
    }
    // Deposit money
    public static void deposit(long accountNo, double amount) {
        // TODO: Write your code
    }
    // Withdraw money
    public static void withdraw(long accountNo, double amount) {
        // TODO: Write your code
   }
    // Search account
    public static boolean searchAccount(long accountNo) {
        // TODO: Write your code
        return false;
    }
    // Display accounts
    public static void displayAccounts() {
        // TODO: Write your code
    }
    // Driver code
    public static void main(String[] args) {
        createAccount(10001, 5000);
        createAccount(10002, 7500);
        createAccount(10003, 10000);

        System.out.println("----- Bank Accounts -----");
        displayAccounts();

        System.out.println("\nSearching Account 10002:");

        if (searchAccount(10002)) {
            System.out.println("Account found.");
        } else {
            System.out.println("Account not found.");
        }
        System.out.println("\nDepositing Rs. 2000 into Account 10001...");
        deposit(10001, 2000);
        System.out.println("\nWithdrawing Rs. 1500 from Account 10003...");
        withdraw(10003, 1500);

        System.out.println("\nAfter Transactions:");
        displayAccounts();
    }
}