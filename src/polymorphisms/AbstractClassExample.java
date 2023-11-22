package polymorphisms;

// Contoh abstrak class untuk Akun
abstract class Account {
    private String accountNumber;
    private double balance;

    public Account(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }

    // Metode abstrak untuk setoran
    abstract void deposit(double amount);

    // Metode abstrak untuk penarikan
    abstract void withdraw(double amount);

    // Metode untuk menampilkan saldo
    public void displayBalance() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }
}

// Kelas turunan untuk Akun Tabungan
class SavingsAccount extends Account {
    double interestRate;

    public SavingsAccount(String accountNumber, double interestRate) {
        super(accountNumber);
        this.interestRate = interestRate;
    }

    @Override
    void deposit(double amount) {
        // Implementasi setoran untuk Akun Tabungan
        System.out.println("Depositing into Savings Account: $" + amount);
        // Logika setoran
    }

    @Override
    void withdraw(double amount) {
        // Implementasi penarikan untuk Akun Tabungan
        System.out.println("Withdrawing from Savings Account: $" + amount);
        // Logika penarikan
    }
}

// Kelas turunan untuk Akun Giro
class CheckingAccount extends Account {
    private double overdraftLimit;

    public CheckingAccount(String accountNumber, double overdraftLimit) {
        super(accountNumber);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    void deposit(double amount) {
        // Implementasi setoran untuk Akun Giro
        System.out.println("Depositing into Checking Account: $" + amount);
        // Logika setoran
    }

    @Override
    void withdraw(double amount) {
        // Implementasi penarikan untuk Akun Giro
        System.out.println("Withdrawing from Checking Account: $" + amount);
        // Logika penarikan
    }
}

public class AbstractClassExample {
    public static void main(String[] args) {
        // Membuat objek Akun Tabungan
        Account savingsAccount = new SavingsAccount("SA123456", 0.02);
        savingsAccount.deposit(1000);
        savingsAccount.withdraw(200);
        savingsAccount.displayBalance();

        System.out.println(); // Baris kosong untuk pemisahan

        // Membuat objek Akun Giro
        Account checkingAccount = new CheckingAccount("CA789012", 500);
        checkingAccount.deposit(1500);
        checkingAccount.withdraw(2000);
        checkingAccount.displayBalance();
    }
}
