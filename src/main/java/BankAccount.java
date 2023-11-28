// Originator class that represents the BankAccount
public class BankAccount {
    private final String accountHolder;
    private double balance;

    public BankAccount(String accountHolder, double initialBalance) {
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    // Create a memento to capture the current state of the account
    public Memento save() {
        return new Memento( balance);
    }

    // Restore the account state from a memento
    public void restore(Memento memento) {

        this.balance = memento.getBalance();
    }

    public void deposit(double amount) {
        balance += amount;
       }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
         }
    }

    public double getBalance() {
        return balance;
    }

    // Memento class to represent the state of the BankAccount
    public class Memento {
        private double balance;
        //just the  balance field is saved
        // is assumed that accountHolder is final, never changed
        public Memento(double balance) {

            this.balance = balance;
        }


        public double getBalance() {
            return balance;
        }
    }
}