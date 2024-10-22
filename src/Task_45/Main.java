package Task_45;

public class Main {
    public static void main(String[] args) {
        Approver teamLead = new TeamLead();
        Approver manager = new Manager();
        Approver director = new Director();
        Approver ceo = new CEO();

        teamLead.setNextApprover(manager);
        manager.setNextApprover(director);
        director.setNextApprover(ceo);

        ExpenseRequest request1 = new ExpenseRequest(500);
        ExpenseRequest request2 = new ExpenseRequest(4000);
        ExpenseRequest request3 = new ExpenseRequest(8000);
        ExpenseRequest request4 = new ExpenseRequest(20000);

        teamLead.approveExpense(request1);
        teamLead.approveExpense(request2);
        teamLead.approveExpense(request3);
        teamLead.approveExpense(request4);
    }
}
