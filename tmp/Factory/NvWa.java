
public class NvWa {

	public static void main(String[] args) {
		AbstractHumanFactory yinYangLu = new HumanFactory();

		System.out.println("---- 造出的第一批人是白种人 ----");
		Human whiteHuman = yinYangLu.createHuman(WhiteHuman.class);
		whiteHuman.getColor();
		whiteHuman.talk();

		System.out.println("---- 造出的第二批人是黑种人 ----");
		Human blackHuman = yinYangLu.createHuman(BlackHuman.class);
		blackHuman.getColor();
		blackHuman.talk();

		System.out.println("---- 造出的第三批人是黄种人 ----");
		Human yellowHuman = yinYangLu.createHuman(YellowHuman.class);
		yellowHuman.getColor();
		yellowHuman.talk();
	}

}
