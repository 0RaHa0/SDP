package Task_45;

abstract class Approver {
    protected Approver nextApprover;

    public void setNextApprover(Approver approver) {
        this.nextApprover = approver;
    }

    public abstract void approveExpense(ExpenseRequest request);
}
