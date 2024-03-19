package ch08;

public class MethodEx2 {

	public static void main(String[] args) {

		// print 시작 -> divide 시작 -> pow 시작 -> add 시작 -> add 종료 -> pow 종료 -> divide 종료 ->
		// print 종료
		System.out.println(divide(pow(add(3, 3))));

	}

	// 더하기
	static int add(int x, int y) {
		return x + y;
	}

	// 제곱
	static int pow(int x) {
		return x * x;
	}

	// 나누기
	static int divide(int x) {
		return x / x;
	}
}