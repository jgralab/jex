package testfiles;

import java.io.Serializable;

public class Foo extends Object implements Serializable, Bar {

	private static final long serialVersionUID = Math.random() > 0.5 ? 17L
			: 19L;
	private final int foo = 17 + ((int) Math.random() * 1000);

	protected final Bar bar = new Bar() {

		@Override
		public int compareTo(Bar o) {
			return 0;
		}

		@Override
		public int[] gimme(int a, long b) {
			return null;
		}
	};

	@java.lang.Override
	public int compareTo(Bar o) {
		{
			return o.gimme(foo, 10)[0] - gimme(foo - 1, 10)[1];
		}
	}

	@Override
	public int[] gimme(int a, long b) {
		return new int[] { a + (int) b, (int) b - a };
	}
}
