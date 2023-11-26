// Memento class to represent the state of the BankAccount
class BankAccountMemento {
    private double balance;
    //just the  balance field is saved
    // is assumed that accountHolder is final, never changed
    public BankAccountMemento(double balance) {

        this.balance = balance;
    }


    public double getBalance() {
        return balance;
    }
}