package ch06.sec15;

public class Singleton {

	private static Singleton singleton = new Singleton();
//	private static Singleton singleton;

	private Singleton() {

	}

	public static Singleton getSingleton() {
//		if (singleton == null) {
//			return singleton = new Singleton()
//		}
		return singleton;
	}
}
