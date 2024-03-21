package ch13;

import java.util.ArrayList;
import java.util.List;

public class GenericEx {

	public static void main(String[] args) {

//		List<String> list = new ArrayList();
//
//		// list는 여러 종류가 담기는 타입
//		list.add(1);
//		// <String> 쓰면 String만 담으라고 강제함.
//		// int 형 add 하면 오류남
//
//		list.add("홍길동");
////		list.add(new Car());
//
//		// 오브젝트에 자동형변환이 되어 다 담김
//		// 담는건 편하지만 꺼내려면 부모-자식 관계를 고려한 강.제.형.변.환 필요
//		// 이 과정이 상당히 번거로움!
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(o);
//			System.out.println(list.get(i));
		
		Box b = new Box();
		b.setCotent("자바 프로그래밍");
		
		System.out.println(((String)b.getCotent()).replace("자바","파이썬"));
		
		// 출력 에는 문제 없음
		// replace 하려면 형변환 한바닥 해야함
		
		Box<String> b = new Box<>();
		b.setCotent("자바 프로그래밍");
		
		System.out.println(b.getCotent().replace("자바","파이썬"));
		// 스트링을 리턴하기 때문에 강제형변환 필요 없음...대박....
		
		
		
		

		}

	}

}
