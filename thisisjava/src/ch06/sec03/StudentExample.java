package ch06.sec03;

// 실행 클래스

public class StudentExample {

	public static void main(String[] args) {

		// s1과 s2는 같은 타입, 다른 객체

		Student s1 = new Student();
		// 생성자 실행(초기화)되는거임.
		Student s2 = new Student("홍길동");
		Student s3 = new Student("김길동", 1);

		// s2 주소 값을 저장
//		Student s3 = s2;

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		// ==은 주소값으로 비교
		System.out.println(s1 == s2);
		System.out.println(s2 == s3);
		System.out.println(s2.name);
		s2.name = "김길동";
		System.out.println(s2.name);
		System.out.println(s3.name);
		System.out.println(s1.name);

		double d = Math.random();

	}

}
