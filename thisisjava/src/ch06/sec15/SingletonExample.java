package ch06.sec15;

public class SingletonExample {

	public static void main(String[] args) {

		// 주소값 같으니까 당연히 같은 객체라고 나옴.
		Singleton obj1 = Singleton.getSingleton();
		Singleton obj2 = Singleton.getSingleton();

		if (obj1 == obj2) {
			System.out.println("같은 singleton 객체입니다.");
		} else {
			System.out.println("다른 sigleton 객체입니다.");
		}

	}

}
