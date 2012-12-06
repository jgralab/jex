package testfiles;

public interface Bar extends Comparable<Bar> {

	@interface TestAnnotation {
		String desc() default "description";

		String[] keywords();

		int[] nums();
	}

	enum ABC {
		A, B, C;

		public void foo() {
		}
	}

	public enum ComplexEnum {
		X(1, 2), Y(2, 3), Z(3, 4);

		int i;
		int j;

		ComplexEnum(int i, int j) throws RuntimeException {
			if (i < 10) {
				throw new RuntimeException();
			}
			this.i = i;
			this.j = i;
		}
	}

	// public static class Box<T> {
	// private T boxedItem;
	//
	// private Box(T x) {
	// boxedItem = x;
	// }
	//
	// public static <T> Box<T> makeBox(T x) {
	// return new Box<T>(x);
	// }
	//
	// public void set(T t) {
	// this.boxedItem = t;
	// }
	//
	// public T get() {
	// return boxedItem;
	// }
	// }

	public int[] gimme(int a, long b);

	public enum EnumAsSingleton {
		THE
	}

}
