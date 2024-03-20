package ch11;

import pack1.A;

public class ExceptionEx {

	public static void main(String[] args) throws Exception {
		System.out.println("시작");
		int[] arr = { 1, 2, 3 };
		A a = null;

		try {
			a = new A();
			System.out.println(arr[2]);
			System.out.println(1 / 1);
			System.out.println("실행문");
			throw new TestException("내가 만든 예외");

		} catch (Exception e) {

			// 어떤 에러가 나는지 확인하기 getMessage()
//			System.out.println(e.getMessage());
//			e.printStackTrace();
			System.out.println(e.getMessage());
		} finally {
			System.out.println("항상 실행 됩니다.");
			if (a != null)
				a.method();

			System.out.println("끝");

		}

		test();
	}

	static void test() throws Exception {
//		try {
		// Class.forName => string을 메모리에 올린다
		Class.forName("java.lang.String");
//	}catch(ClassNotFoundException e){
//	{

	}
}
