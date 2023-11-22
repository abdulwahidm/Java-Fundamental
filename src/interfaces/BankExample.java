package interfaces;

// Interface untuk model Bank Account
interface BankAccount {
    void deposit(double amount);

    void withdraw(double amount);

    double getBalance();
}

// Kelas Account yang mengimplementasikan BankAccount
class Account implements BankAccount {
    private double balance;

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient funds");
        }
    }

    public double getBalance() {
        return balance;
    }
}

// Kelas SavingAccount yang juga mengimplementasikan BankAccount
class SavingAccount extends Account {
    private double interestRate;

    // Metode tambahan khusus untuk SavingAccount
    public void addInterest() {
        double interest = getBalance() * interestRate / 100;
        deposit(interest);
        System.out.println("Interest added: $" + interest);
    }
}

// Contoh penggunaan
public class BankExample {
    public static void main(String[] args) {
        BankAccount myAccount = new Account();
        myAccount.deposit(1000);
        System.out.println("Balance: $" + myAccount.getBalance());

        BankAccount savingsAccount = new SavingAccount();
        savingsAccount.deposit(500);
        ((SavingAccount) savingsAccount).addInterest(); // Downcasting untuk memanggil metode tambahan SavingAccount
        System.out.println("Balance after interest: $" + savingsAccount.getBalance());
    }
}
