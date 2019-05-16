import java.util.Scanner;

public class CaculateV4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Please input number A");
		String strNumberA = in.nextLine();
		System.out.println("Please select operater(+ - * /)");
		String strOperate = in.nextLine();
		System.out.println("Please input number B");
		String strNumberB = in.nextLine();

		String strResult = "";

		try {
			Operation oper = OperationFactory.getOperation(strOperate);
			if (oper != null) {
				strResult = String.valueOf(oper.getResult(Double.parseDouble(strNumberA), 
					Double.parseDouble(strNumberB)));
			}
		} catch (Exception e) {}
		
		System.out.println("result is " + strResult);
	}

}
