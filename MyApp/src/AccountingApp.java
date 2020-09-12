public class AccountingApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double valueofSupply = Double.parseDouble(args[0]);
		double vatRate = 0.1;
		double expenseRate = 0.3;
		double vat = valueofSupply * vatRate;
		double total = valueofSupply + vat;
		double expanse = valueofSupply * expenseRate;
		double income = valueofSupply - expanse;
		double dividend1 = income * 0.5;
		double dividend2 = income * 0.3;
		double dividend3 = income * 0.2;

		System.out.println("Value of supply(VOS) : " + valueofSupply);
		System.out.println("Value added tax(VAT) : " + vat);
		System.out.println("Total : " + total);
		System.out.println("Expense : " + expanse);
		System.out.println("Income : " + income);
		System.out.println("Dividend1 : " + dividend1);
		System.out.println("Dividend2 : " + dividend2);
		System.out.println("Dividend3 : " + dividend3);
	}
}
