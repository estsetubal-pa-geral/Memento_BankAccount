import java.util.Stack;

public  class BankAccountCaretaker {
    // Caretaker class that holds and manages the mementos


        private Stack<BankAccount.Memento> mementos = new Stack<>();
        private BankAccount originator;

        public BankAccountCaretaker(BankAccount originator){
            this.originator=originator;
        }

        public void save() {
            mementos.push(originator.save());
        }

        public void undo() {
            if (!mementos.isEmpty())
                originator.restore(mementos.pop());
        }

}
