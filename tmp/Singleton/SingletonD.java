
/**
* 登记式：静态内部类
*/
public class SingletonD {

	private SingletonD() {}

	private static class SingletonHolder {
		private static final SingletonD instance = new SingletonD();
	}

	public static SingletonD getInstance() {
		return SingletonHolder.instance;
	}

}
