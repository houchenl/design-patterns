
public class Mall {

	public static void main(String[] args) {
		CashContext cashContext = new CashContext("打8折");
		double totalPrice = 0d;
		try {
			if (cashContext != null)
				totalPrice += cashContext.getResult(20 * 3);
		} catch (Exception e) {}
	}

}
