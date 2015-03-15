public class InvestmentCalculatorApp {
	
		public static void main(String args[])
		{
			InvestmentCalculator ic = new InvestmentCalculator();
			int newValue = ic.calculate();
			System.out.println("The new value is " +newValue);
		}
}