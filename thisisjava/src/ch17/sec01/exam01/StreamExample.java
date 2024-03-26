package ch17.sec01.exam01;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

import ch16.sec05.exam03.Member;

public class StreamExample {
	public static void main(String[] args) {
		// Set 컬렉션 생성
		Set<String> set = new HashSet<>();
		set.add("홍길동");
		set.add("신용권");
		set.add("감자바");

		// Stream을 이용한 요소 반복 처리
		Stream<String> stream = set.stream();
		stream.forEach(name -> System.out.println(name));
//		set.stream().forEach(name -> System.out.println(name));

		List<Member> list = new ArrayList<>();
		list.add(new Member("hong", "홍길동"));
		list.add(new Member("kim", "김길동"));
		list.add(new Member("choi", "최길동"));

		list.stream().forEach(m -> System.out.println(m));
		
		Stream stream 
	}
}