
public class Client {
	
	public static void main(String[] args) {
		// define context
		Context context = null;
		
		// test first strategy
		context = new Context(new FirstStrategy());
		context.operate();
		
		// test second strategy
		context = new Context(new SecondStrategy());
		context.operate();
		
		// test third strategy
		context = new Context(new ThirdStrategy());
		context.operate();
	}
	
}