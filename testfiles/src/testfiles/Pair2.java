package testfiles;


public class Pair2<A, B extends A> {
	A theA;
	B theB;

	public Pair2(A a, B b) {
		theA = a;
		theB = b;
	}

	public A getA() {
		return theA;
	}

	public B getB() {
		return theB;
	}
	
	Iterable<? extends B> foo(){
		return null;
	}
}
