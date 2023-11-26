// Originator class that represents the BankAccount
class BankAccount {
    private final String accountHolder;
    private double balance;

    public BankAccount(String accountHolder, double initialBalance) {
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    // Create a memento to capture the current state of the account
    public BankAccountMemento createMemento() {
        return new BankAccountMemento( balance);
    }

    // Restore the account state from a memento
    public void restoreFromMemento(BankAccountMemento memento) {

        this.balance = memento.getBalance();
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited $" + amount + " into account. New balance: $" + balance);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn $" + amount + " from account. New balance: $" + balance);
        } else {
            System.out.println("Insufficient funds. Withdrawal failed.");
        }
    }

    public double getBalance() {
        return balance;
    }
}