package testfiles;

import java.io.Serializable;

public class Foo extends Object implements Serializable, Bar {

	private static final long serialVersionUID = 1L;
	private final int foo = 17 + ((int) Math.random() * 1000);

	@Override
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
