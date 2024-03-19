package ch08.sec02;

public interface RemoteControl {

	// name는 상수
	// public static final 생략 (자동생성)
	String name = "리모콘";

	// public이 기본이라 안써도 됨
	void turnOn();

	void search(String url);

}
