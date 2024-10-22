package Task_43;

class RemoteControl {
    private Command[] slots;
    private Command lastCommand;

    public RemoteControl() {
        slots = new Command[5];
    }

    public void setCommand(int slot, Command command) {
        slots[slot] = command;
    }

    public void pressButton(int slot) {
        slots[slot].execute();
        lastCommand = slots[slot];
    }

    public void pressUndo() {
        lastCommand.undo();
    }
}