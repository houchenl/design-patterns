
public class Mall {

	private double mTotal;

	public static void main(String[] args) {
		Mall mall = new Mall();

		mall.submit(22, 2);
		mall.submit(13, 1);
		mall.submit(8, 3);

		System.out.println("total " + mall.mTotal);
	}

	private void submit(String price, String number, int index) {
		try {
			double cost = 0d;

			switch (index) {
				case 0:
					cost = Double.parseDouble(price) * Double.parseDouble(number);
					break;
				case 1:
					cost = Double.parseDouble(price) * Double.parseDouble(number) * 0.7;
					break;
				case 2:
					cost = Double.parseDouble(price) * Double.parseDouble(number) * 0.5;
					break;
			}

			mTotal += cost;
		} catch (Exception e) {}
	}

	private void submit(double price, double number) {
		try {
			double cost = 0d;

			switch (index) {
				case 0:
					cost = Double.parseDouble(price) * Double.parseDouble(number);
					break;
				case 1:
					cost = Double.parseDouble(price) * Double.parseDouble(number) * 0.7;
					break;
				case 2:
					cost = Double.parseDouble(price) * Double.parseDouble(number) * 0.5;
					break;
			}

			mTotal += cost;
		} catch (Exception e) {}
	}

}
