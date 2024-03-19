package ch08;

public class MethodOrder {

	public static void main(String[] args) {
		MethodEx m = new MethodEx();
		m.one();

	}
}

class MethodEx {

	void one() {
		two();
		System.out.println("One");
	}

	void two() {
		three();
		System.out.println("two");
	}

	void three() {
		System.out.println("three");
	}

}
