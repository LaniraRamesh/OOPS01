package oopsConceptTrial;

public class AxisBank extends BankInfo {

	public void deposit() {
		System.out.println("deposit the money");
	}
	public static void main(String[] args) {
		BankInfo object=new AxisBank();
		object.fixed();
		object.deposit();
	}
	
}
