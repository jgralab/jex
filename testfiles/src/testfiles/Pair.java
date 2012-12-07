package testfiles;

import java.io.Serializable;

public class Pair<A extends Number & Serializable, B> {
	A theA;
	B theB;

	public Pair(A a, B b) {
		theA = a;
		theB = b;
	}

	public A getA() {
		return theA;
	}

	public B getB() {
		return theB;
	}
}
