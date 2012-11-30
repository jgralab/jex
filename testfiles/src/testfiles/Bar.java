package testfiles;

public interface Bar extends Comparable<Bar> {

	enum ABC {
		A, B, C;
		
		public void foo() {
		}
	}

	public int[] gimme(int a, long b);
}
