package interfaces;

interface IABCBank {

    default void welcome() {
        System.out.println("Welcome in ABC Bank!");
    }

    void openAccount();

    void closeAccount();
}

interface IBankAccount {
    void deposit();

    void withdraw();

    void balance();
}

class Saving implements IBankAccount, IABCBank {

    @Override
    public void deposit() {
        System.out.println("Deposit in Saving Account");
    }

    @Override
    public void withdraw() {
        System.out.println("Withdraw from Saving Account");
    }

    @Override
    public void balance() {
        System.out.println("Balance in Saving Account");
    }

    @Override
    public void openAccount() {
        System.out.println("Open Account");
    }

    @Override
    public void closeAccount() {
        System.out.println("Close Account");
    }

}

public class InterfaceExample {

    public static void main(String[] args) {

        Saving saving = new Saving();

        saving.welcome();

        saving.deposit();
        saving.withdraw();
        saving.balance();

    }

}
