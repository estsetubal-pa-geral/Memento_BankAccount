import java.util.Stack;

public  class BankAccountCaretaker {
    // Caretaker class that holds and manages the mementos

    private Stack<BankAccountMemento> mementoStack = new Stack<>();

        public void saveMemento(BankAccountMemento memento) {
            mementoStack.push(memento);
        }

        public BankAccountMemento undo() {
            if (!mementoStack.isEmpty()) {
                return mementoStack.pop();
            }
            return null;
        }

}
