package PractiseQue3;

public class BankTest {
    public static void main(String[] args) {

        BankAccount a1 =
            new BankAccount("Ravi", "ACC101", 25000);

        BankAccount a2 =
            new BankAccount("Sneha", "ACC102", 40000);

        System.out.println(a1.getAccountHolder());
        System.out.println("Balance: " + a2.getBalance());
        System.out.println("Bank: " + BankAccount.bankName);
        System.out.println("Total Accounts: "
                           + BankAccount.accountCount);
    }
}
