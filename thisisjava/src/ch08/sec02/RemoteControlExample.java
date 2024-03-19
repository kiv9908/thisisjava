package ch08.sec02;

public class RemoteControlExample {

	public static void main(String[] args) {

		RemoteControl rc;

		rc = new Television();
		rc.turnOn();

		rc = new Audio();
		rc.turnOn();

		// final이라 수정 불가
		RemoteControl.name = "";

		// 인스턴스였으면 아래처럼 못씀
		// static 이니까 가능
		// public 이기 때문에 다른 패키지에 있는 class에서도 접근 가능
		System.out.println(RemoteControl.name);

	}

}
