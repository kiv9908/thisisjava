package ch09.sec07.exam02;

public class Home {

	// 익명 구현 개체

	private RemoteControl rc = new RemoteControl() {

		@Override
		public void turnOn() {
			System.out.println("TV를 켭니다.");

		}

		@Override
		public void turnOff() {
			System.out.println("TV를 끕니다.");

		}
	};

	// 메소드(필드이용)
	public void use1() {
		rc.turnOn();
		rc.turnOff();

	}

	// 메소드(로컬변수이용)
	public void use2() {
		RemoteControl rc = new RemoteControl() {

			@Override
			public void turnOn() {
				System.out.println("에어컨을 켭니다.");

			}

			@Override
			public void turnOff() {
				System.out.println("에어컨을 끕니다.");

			}
		};

		rc.turnOn();
		rc.turnOff();
	}

	public void use3(RemoteControl rc) {
		rc.turnOn();
		rc.turnOff();

	}

}
