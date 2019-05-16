
public class OperationDiv extends Operation {

	public double getResult(double numberA, double numberB) {
		double tResult = 0d;

		if (numberB != 0d) {
			tResult = numberA / numberB;
		}

		return tResult;
	}

}
