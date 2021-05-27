class Accounting{
	public static double valueOfSupply;
	public static double vatRate;
	public static double expenseRate;
	
	public void print() {
		System.out.println("Value of supply : " +valueOfSupply);
		System.out.println("VAT : "+ getVAT());
		System.out.println("Total : "+ getTotal());
		System.out.println("Expense : "+ getExpense());
		System.out.println("Income : "+ getIncome());
		System.out.println("Dividend 1 : "+ getDividend1());
		System.out.println("Dividend 2 : "+ getDividend2());
		System.out.println("Dividend 3 : "+ getDividend3());
	}
	
	public double getDividend1() {
		return getIncome() * 0.5;
	}
	
	public double getDividend2() {
		return getIncome() * 0.3;
	}
	
	public double getDividend3() {
		return getIncome() * 0.2;
	}
	
	private double getIncome() {
		return valueOfSupply - getExpense();
	}
	
	private double getExpense() {
		return valueOfSupply*expenseRate;
	}
	
	private double getTotal() {
		return valueOfSupply + getVAT();
	}
	
	private double getVAT() {
		return valueOfSupply*vatRate;
	}
}


public class AccountingClassApp {
	
	public static void main(String[] args) {

		// instance
		Accounting a1 = new Accounting();
		a1.valueOfSupply = 10000.0;
		a1.vatRate = 0.05;
		a1.expenseRate = 0.2;
		a1.print();
		
		Accounting a2 = new Accounting();
		a2.valueOfSupply = 10000.0;
		a2.vatRate = 0.05;
		a2.expenseRate = 0.2;
		a2.print();
		
	}
	
	
	
}
