
public class SingletonAA {

	private SingletonAA instance = null;

	// 类初始化时实例化instance
	static {
		instance = new SingletonAA();
	}

	private SingletonAA() {}

	public static SingletonAA getInstance() {
		return instance;
	}

}
