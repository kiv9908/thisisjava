package ch17.problem.no5;

import java.util.Arrays;
import java.util.List;

public class Example {

	public static void main(String[] args) {
		// Arrays.asList 원소를 바로 입력해서 리스트로 만듦
		List<String> list = Arrays.asList("This is a java book", "Lambda Expressions",
				"Java8 supports lambda expression");
		list.stream().forEach(s -> System.out.println(s));

	}

}
