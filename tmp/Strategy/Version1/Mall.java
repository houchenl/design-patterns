
public class Mall {

	private double mTotal;

	public static void main(String[] args) {
		Mall mall = new Mall();

		mall.submit(22, 2);
		mall.submit(13, 1);
		mall.submit(8, 3);

		System.out.println("total " + mall.mTotal);
	}

	private void submit(String price, String number) {
		try {
			double cost = Double.parseDouble(price) * Double.parseDouble(number);

			mTotal += cost;
		} catch (Exception e) {}
	}

	private void submit(double price, double number) {
		try {
			double cost = price * number;

			mTotal += cost;
		} catch (Exception e) {}
	}

}
