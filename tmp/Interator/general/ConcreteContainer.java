import java.util.Vector;

public class ConcreteContainer implements Container {

	private Vector mVector;

	public ConcreteContainer() {
		mVector = new Vector();
		mVector.add("vector 1");
		mVector.add("vector 2");
		mVector.add("vector 3");
		mVector.add("vector 4");
		mVector.add("vector 5");
	}

	@Override
	public Iterator createIterator() {
		return new ConcreteIterator(mVector);
	}

	public void setVector(Vector vector) {
		mVector = vector;
	}

	public Vector getVector() {
		return mVector;
	}

}
