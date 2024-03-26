package sortEx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortEx {

	public static void main(String[] args) {
		// 기본자료형 배열 정렬

		int[] array = { 50, 10, 60, 30, 80, 40, 90 };
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));

		// 참조자료형 배열
		Integer[] array2 = new Integer[] { 50, 10, 60, 30, 80, 40, 90 };
		Arrays.sort(array2); // 오름차순
		Arrays.sort(array2, Collections.reverseOrder()); // 내림차순 -> 기본자료형은 안됨!
		System.out.println(Arrays.toString(array2));

		// Person 대신 Map => List
		// 나이순으로 정렬
		List<Map<String, Object>> list = new ArrayList();

		// K 이름, V : 나이
		// 3개의 map이 들어있는 ArrayList 객체!
		Map<String, Object> person = new HashMap<>();

		person.put("name", "홍길동");
		person.put("age", 45);
		list.add(person);

		person = new HashMap<>();
		person.put("name", "강자바");
		person.put("age", 25);
		list.add(person);

		person = new HashMap<>();
		person.put("name", "박지원");
		person.put("age", 31);
		list.add(person);

		System.out.println(list);

		// 정렬
//		Collections.sort(list);
		// map이 들어있기 때문에 정렬이 안됨, 제네릭타입이 Map<String,Integer>
		Collections.sort(list, new Comparator<Map>() {

			@Override
			public int compare(Map o1, Map o2) {
				return (int) o2.get("age") - (int) o1.get("age");
			}
		});

		// 기본자료형의 래퍼클래스가 제네릭타입인 경우는 가능

	}

}
