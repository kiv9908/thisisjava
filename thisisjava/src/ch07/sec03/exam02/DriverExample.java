package ch07.sec03.exam02;

public class DriverExample {

	public static void main(String[] args) {
		// Driver 객체 생성
		Driver driver = new Driver();

		// 매개값으로 Bus 객체를 제공하고 drive() 메소드 호출
		// 객체 제공시 Vehicle (부모) -> Bus (자식)으로 자동형변환
		// 오버라이딩 된 메서드 bus 클래스의 메소드 run() 실행
		Bus bus = new Bus();
		driver.drive(bus);

		// 매개값으로 Taxi 객체를 제공하고 driver() 메소드 호출
		// 객체 제공시 Vehicle (부모) -> taxi (자식)으로 자동형변환
		// 오버라이딩 된 메서드 taxi 클래스의 메소드 run() 실행
		Taxi taxi = new Taxi();
		driver.drive(taxi);

	}

}
