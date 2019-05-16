
public enum SingletonC {

	/*
		1. 自由序列化
		2. 保证只有一个实例，即使使用反射机制也无法多次实例化一个枚举量
		3. 线程安全
	*/
	INSTANCE;

	public static SingletonC getInstance() {
		return INSTANCE;
	}

}
