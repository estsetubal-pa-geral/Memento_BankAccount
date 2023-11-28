public class Main {

    /**
     * /* In this example, the BankAccount.BankAccountMemento class represents the state of the BankAccount,
     * /* the BankAccount class is the originator that creates and restores its state from mementos,
     * /* MementoManager class acts as the caretaker, managing the stack of mementos.
     * /* The Main class demonstrates creating a bank account, performing operations, and undoing the last operation using the Memento pattern.
     **/

    public static void main(String[] args) {
        BankAccount account = new BankAccount("John Doe", 1000.0);
        BankAccountCaretaker caretaker = new BankAccountCaretaker(account);

        // Save the initial state
        caretaker.save();

        // Perform operations
        account.deposit(500.0);
        caretaker.save();
        // Show current state
        System.out.println("Current state - Account Holder: " + account.getBalance() +
                ", Balance: $" + account.getBalance());

        account.withdraw(200.0);

        // Show current state
        System.out.println("Current state - Account Holder: " + account.getBalance() +
                ", Balance: $" + account.getBalance());

        // Undo the last operation
       caretaker.undo();

        // Show current state
        System.out.println("Current state - Account Holder: " + account.getBalance() +
                ", Balance: $" + account.getBalance());

    }
}

