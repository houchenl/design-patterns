
public class Context {
	
	private int param1, param2;
	
	private StrategyInterface strategy;
	
	public Context(StrategyInterface strategy) {
		this.strategy = strategy;
	}
	
	public Context(StrategyInterface strategy, int param1, int param2) {
		this.strategy = strategy;
		this.param1 = param1;
		this.param2 = param2;
	}
	
	public void operate() {
		strategy.operate(this);
	}
	
	public void calu(int num1, int num2) {
		if (num1 < 0 || num2 < 0) return;
		
		strategy.calu(num1, num2);
	}
	
	public int getParam1() {
		return this.param1;
	}
	
	public int getParam2() {
		return this.param2;
	}
	
}