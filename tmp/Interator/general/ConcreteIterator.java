import java.util.Vector;

public class ConcreteIterator implements Iterator {

    private int currentIndex;
	private Vector mVector;

	public ConcreteIterator(Vector vector) {
		mVector = vector;
	}

    @Override
	public Object first() {
		currentIndex = 0;
		return mVector.get(currentIndex);
	}

	@Override
	public Object next() {
		currentIndex++;
		return mVector.get(currentIndex);
	}

	@Override
	public Object currentItem() {
		return mVector.get(currentIndex);
	}

	@Override
	public boolean isDone() {
		if (currentIndex >= mVector.size() - 1)
			return true;
		else
			return false;
	}

}
