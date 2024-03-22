package ch14.sec05.exam02;

public class JoinExample {
	public static void main(String[] args) throws Exception {
		SumThread sumThread = new SumThread();
		sumThread.start();

		sumThread.join(); // 메인 메서드는 호출하면 바로 다 실행, thread 안기다려줌

		System.out.println("1~100 합: " + sumThread.getSum());
	}
}