package Task_45;

class TeamLead extends Approver {
    public void approveExpense(ExpenseRequest request) {
        if (request.getAmount() < 1000) {
            System.out.println("TeamLead approved expense of " + request.getAmount());
        } else if (nextApprover != null) {
            nextApprover.approveExpense(request);
        }
    }
}

class Manager extends Approver {
    public void approveExpense(ExpenseRequest request) {
        if (request.getAmount() < 5000) {
            System.out.println("Manager approved expense of " + request.getAmount());
        } else if (nextApprover != null) {
            nextApprover.approveExpense(request);
        }
    }
}

class Director extends Approver {
    public void approveExpense(ExpenseRequest request) {
        if (request.getAmount() < 10000) {
            System.out.println("Director approved expense of " + request.getAmount());
        } else if (nextApprover != null) {
            nextApprover.approveExpense(request);
        }
    }
}

class CEO extends Approver {
    public void approveExpense(ExpenseRequest request) {
        System.out.println("CEO approved expense of " + request.getAmount());
    }
}
