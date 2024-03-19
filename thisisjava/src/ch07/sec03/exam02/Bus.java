package ch07.sec03.exam02;

public class Bus extends Vehicle {
	// 메소드 재정의
	@Override
	public void run() {
		System.out.println("버스가 달립니다.");
	}

	public void bell() {
		System.out.println("벨을 누릅니다.");
	}
}