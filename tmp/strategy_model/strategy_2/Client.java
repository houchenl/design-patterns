
public class Client {
	
	public static void main(String[] args) {
		// define context
		Context context = null;
		
		// test first strategy
		context = new Context(new FirstStrategy());
		context.operate();
		context.calu(1, 2);
		
		// test second strategy
		context = new Context(new SecondStrategy(), 100, 200);
		context.operate();
		context.calu(1, 2);
		
		// test third strategy
		context = new Context(new ThirdStrategy());
		context.operate();
		context.calu(1, 2);
	}
	
}