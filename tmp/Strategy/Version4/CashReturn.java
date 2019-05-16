
public class CashReturn implements Cash {

	private double mCondition = 0d;
	private double mReturn = 0d;

	public CashReturn(double condition, double return) {
		mCondition = condition;
		mReturn = return;
	}

	public double acceptCash(double money) {
		double tResult = money;

		if (money > mCondition) {
			tResult = money - Math.Floor(money / mCondition) * mReturn;
		}

		return tResult;
	}

}
