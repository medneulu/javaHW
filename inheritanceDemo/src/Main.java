
public class Main {

	public static void main(String[] args) {
	
		LoanUI loanUI = new LoanUI();
		loanUI.CalculateLoan(new TeacherLoanManager());
		loanUI.CalculateLoan(new AgricuLoanManager());
		loanUI.CalculateLoan(new SoldierLoanManager());
	}

}
