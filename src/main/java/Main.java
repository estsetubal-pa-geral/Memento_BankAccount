public class Main {

    /**
     * /* In this example, the BankAccountMemento class represents the state of the BankAccount,
     * /* the BankAccount class is the originator that creates and restores its state from mementos,
     * /* MementoManager class acts as the caretaker, managing the stack of mementos.
     * /* The Main class demonstrates creating a bank account, performing operations, and undoing the last operation using the Memento pattern.
     **/

    public static void main(String[] args) {
        BankAccount account = new BankAccount("John Doe", 1000.0);
        BankAccountCaretaker mementoManager = new BankAccountCaretaker();

        // Save the initial state
        mementoManager.saveMemento(account.createMemento());

        // Perform operations
        account.deposit(500.0);
        mementoManager.saveMemento(account.createMemento());

        account.withdraw(200.0);
        mementoManager.saveMemento(account.createMemento());

        // Show current state
        System.out.println("Current state - Account Holder: " + account.getBalance() +
                ", Balance: $" + account.getBalance());

        // Undo the last operation
        BankAccountMemento previousState = mementoManager.undo();
        if (previousState != null) {
            account.restoreFromMemento(previousState);
            System.out.println("Undone last operation - Account Holder: " +
                    account.getBalance() + ", Balance: $" + account.getBalance());
        } else {
            System.out.println("No more operations to undo.");
        }
    }
}

