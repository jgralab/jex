package testfiles.sub_pkg;


public @interface TestAnnotation {
	@TestAnnotation(desc = "bla")
	abstract String desc();
}

@interface Name {
	abstract String first();

	String last();
}

/**
 * Indicates the author of the annotated program element.
 */
@Author(value = @Name(first = "x", last = "y"))
@interface Author {
	Name value();
}

/**
 * Indicates the reviewer of the annotated program element.
 */
@interface Reviewer {
	Name value();
}