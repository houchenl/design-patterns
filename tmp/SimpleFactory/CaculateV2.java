import java.util.Scanner;

public class CaculateV2 {

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
			switch (strOperate) {
				case "+":
					strResult = String.valueOf(Double.parseDouble(strNumberA) 
						+ Double.parseDouble(strNumberB));
					break;
				case "-":
					strResult = String.valueOf(Double.parseDouble(strNumberA) 
						- Double.parseDouble(strNumberB));
					break;
				case "*":
					strResult = String.valueOf(Double.parseDouble(strNumberA) 
						* Double.parseDouble(strNumberB));
					break;
				case "/":
					if (!strNumberB.equals("0"))
						strResult = String.valueOf(Double.parseDouble(strNumberA) 
							/ Double.parseDouble(strNumberB));
					else
						strResult = "can't be zero.";
					break;
			}	

		} catch (Exception e) {}
		
		System.out.println("result is " + strResult);
	}

}
