
public abstract class HummerModel {

	protected abstract void start();

	protected abstract void alarm();

	protected abstract void stop();

	protected boolean isAlarm() {
		return true;
	}

	public final void run() {
		this.start();
		if (isAlarm())
			this.alarm();
		this.stop();
	}

}
