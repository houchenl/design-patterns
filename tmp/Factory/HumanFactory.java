
public class HumanFactory extends AbstractHumanFactory {

	public <T extends Human> T createHuman(Class<T> clz) {
		T human = null;

		try {
			human = (T) Class.forName(clz.getName()).newInstance();
		} catch (Exception e) {
			System.out.println("人种生成错误");
		}

		return human;
	}

}
