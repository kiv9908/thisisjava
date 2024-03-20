package ch12.sec03.exam01;

public class MemberMain {

	public static void main(String[] args) {
		Member m1 = new Member("홍길동", 90);
		System.out.println(m1);

		Member m2 = new Member("김길동", 80);
		System.out.println(m2);

		Member m3 = new Member("홍길동", 90);
		System.out.println(m3);

		System.out.println(m1.equals(m3)); // equals는 주소값 비교이기 때문에 재정의 하지 않으면 false 가 나옴
	}

}
