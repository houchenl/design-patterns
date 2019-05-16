
public class CashFactory {

	public static Cash createCash(String type) {
		Cash cash = null;

		switch (type) {
			case "正常收费":
				cash = new CashNormal();
				break;
			case "满300返100":
				cash = new CashReturn(300, 100);
				break;
			case "打8折":
				cash = new CashRebate(0.8);
				break;
		}

		return cash;
	}

}
