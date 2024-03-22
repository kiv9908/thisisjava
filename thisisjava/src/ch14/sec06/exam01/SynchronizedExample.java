package ch14.sec06.exam01;

public class SynchronizedExample {
	public static void main(String[] args) {
		// 계산기 생성
		Calculator calculator = new Calculator();

		// 계산기에 50을 넣음
		User1Thread user1Thread = new User1Thread();
		user1Thread.setCalculator(calculator);
		user1Thread.start();

		// 계산기에 100을 넣음
		User2Thread user2Thread = new User2Thread();
		user2Thread.setCalculator(calculator);
		user2Thread.start();
	}
}