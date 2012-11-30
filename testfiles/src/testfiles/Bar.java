package testfiles;

public interface Bar extends Comparable<Bar> {

	enum ABC {
		A, B, C;

		public void foo() {
		}
	}

	enum ComplexEnum {
		X(1, 2), Y(2, 3), Z(3, 4);
		
		int i;
		int j;

		ComplexEnum(int i, int j) {
			this.i = i;
			this.j = i;
		}
	}

	public int[] gimme(int a, long b);
}
