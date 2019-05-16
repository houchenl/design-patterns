
public class Mall {

	public static void main(String[] args) {
		Cash cash = CashFactory.createCash("打8折");
		double totalPrice = 0d;
		try {
			if (cash != null)
				totalPrice += cash.acceptCash(20 * 3);
		} catch (Exception e) {}
		
	}

}
