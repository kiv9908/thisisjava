package ch07.sec03.exam02;

public class Driver {
	// 메소드 선언(클래스 타입의 매개변수를 가지고 있음)
	public void drive(Vehicle vehicle) {
		vehicle.run();
	}

	// 위처럼 상속 + 오버라이딩 => 다형성을 이용하면 아래 메서드를 만들지 않아도 된다!!
//	public void drive(Bus bus) {
//		vehicle.run();
//	}
//	
//	public void drive(Taxi taxi) {
//		vehicle.run();
//	}
}
