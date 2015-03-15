public class InvestmentCalculator {

		public int calculate()
		{
			int firstYear = 14000 + 14000*40/100;
			int secondYear = firstYear - 1500;
			int thirdYear = secondYear+secondYear*12/100;
			return thirdYear;
		}
		
	public InvestmentCalculator() {}
}