import java.util.Scanner;

public class CaculateV1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Please input number A");
		String A = in.nextLine();
		System.out.println("Please input method");
		String method = in.nextLine();
		System.out.println("Please input number B");
		String B = in.nextLine();

		String result = "";

		if (method.equals("+"))
			result = String.valueOf(Double.parseDouble(A) + Double.parseDouble(B));
		else if (method.equals("-"))
			result = String.valueOf(Double.parseDouble(A) - Double.parseDouble(B));
		else if (method.equals("*"))
			result = String.valueOf(Double.parseDouble(A) * Double.parseDouble(B));
		else if (method.equals("/"))
			result = String.valueOf(Double.parseDouble(A) / Double.parseDouble(B));

		System.out.println("result is " + result);
	}

}
