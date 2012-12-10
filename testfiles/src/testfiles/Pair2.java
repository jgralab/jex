package testfiles;


public class Pair2<Aaa, Bee extends Aaa> {
	Aaa theA;
	Bee theB;

	public Pair2(Aaa a, Bee b) {
		theA = a;
		theB = b;
	}

	public Aaa getA() {
		return theA;
	}

	public Bee getB() {
		return theB;
	}
	
	Iterable<? extends Bee> foo(){
		return null;
	}
}
