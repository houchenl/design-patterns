
public class CashContext {

	private Cash mCash;

	public CashContext(String type) {
		switch (type) {
			case "满300返100":
				mCash = new CashReturn(300, 100);
				break;
			case "打8折":
				mCash = new CashRebate(0.8);
				break;
			case "正常收费":
			default:
				mCash = new CashNormal();
				break;
		}
	}

	public double getResult(double money) {
		return mCash.acceptCash(money);
	}

}
