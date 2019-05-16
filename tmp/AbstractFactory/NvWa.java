
public class NvWa {

	public static void main(String[] args) {
		HumanFactory maleFactory = new MaleFactory();
		HumanFactory femaleFactory = new FemaleFactory();

		Human maleYellowHuman = maleFactory.createYellowHuman();
		maleYellowHuman.getColor();
		maleYellowHuman.talk();
		maleYellowHuman.getSex();

		Human femaleYellowHuman = femaleFactory.createYellowHuman();
		femaleYellowHuman.getColor();
		femaleYellowHuman.talk();
		femaleYellowHuman.getSex();

		Human maleBlackHuman = maleFactory.createBlackHuman();
		maleBlackHuman.getColor();
		maleBlackHuman.talk();
		maleBlackHuman.getSex();

		Human femaleBlackHuman = femaleFactory.createBlackHuman();
		femaleBlackHuman.getColor();
		femaleBlackHuman.talk();
		femaleBlackHuman.getSex();

		Human maleWhiteHuman = maleFactory.createWhiteHuman();
		maleWhiteHuman.getColor();
		maleWhiteHuman.talk();
		maleWhiteHuman.getSex();

		Human femaleWhiteHuman = femaleFactory.createWhiteHuman();
		femaleWhiteHuman.getColor();
		femaleWhiteHuman.talk();
		femaleWhiteHuman.getSex();
	}
}