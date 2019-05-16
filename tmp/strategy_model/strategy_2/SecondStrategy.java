
public class SecondStrategy implements StrategyInterface {
	
	public void operate(Context context) {
		System.out.println("operate in second strategy, param1 is " + context.getParam1() + ", param2 is " + context.getParam2());
	}
	
	public void calu(int num1, int num2) {
		System.out.println("calu in second strategy.");
	}
	
}