
/**
* 饿汉式
* 在类加载时就创建实例
*/
public class SingletonA {

	// 饿汉式，类加载的时候就创建实例
	// 可以通过反射机制攻击
	// 线程安全（多个类加载器除外）
	private static final SingletonA instance = new SingletonA();

	private SingletonA() {}

	public static SingletonA getInstance() {
		return instance;
	}

}
