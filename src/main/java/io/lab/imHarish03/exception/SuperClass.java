package io.lab.imHarish03.exception;

public class SuperClass {
	void method() throws Exception {
		System.out.println("SuperClass");
	}

}

class SubClass extends SuperClass {
	@Override
	void method() throws ArithmeticException {

		// Exception is not a child of RuntimeException
		System.out.println("SubClass");
	}

	public static void main(String[] args) {
		SubClass o = new SubClass();
		o.method();
	}
}
