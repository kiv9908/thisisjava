package test5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {

	public static void main(String[] args) {

		String[] words = { "2455373", "425", "373", "378" };
		String[] numstrs = { "ZASSETE", "S4Z537B", "7_ASZEYB" };

		// words을 가능한 문자로 바꾼다

		// key에 숫자를 넣고, value에 기호를 배열로 넣어서 HashMap을 만든다
		Map<String, String[]> map = new HashMap<>();
		map.put("0", new String[] { "O", "()" });
		map.put("1", new String[] { "I" });
		map.put("2", new String[] { "Z", "S", "7_" });
		map.put("3", new String[] { "E", "B" });
		map.put("4", new String[] { "A" });
		map.put("5", new String[] { "Z", "S" });
		map.put("6", new String[] { "b", "G" });
		map.put("7", new String[] { "T", "Y" });
		map.put("8", new String[] { "B", "E3" });
		map.put("9", new String[] { "g", "q" });

		// HashMap Key에 words[i]를 넣고 가능한 문자로 바꾼 값들을 value에 배열로 넣는다
		Map<String, String[]> wordsToStr = new HashMap<String, String[]>();
		String k;
		List<String[]> v = new ArrayList<>();

		// 단, 서로 다른 숫자가 같은 기호로 치환되지는 않습니다.

		for (int i = 0; i < words.length; i++) {
			for (int j = 0; j < words[i].length(); j++) {
				// words 배열의 0번째의 0번째 글자 k에 저장
				// k가 될수 있는 문자들을 v에 저장
				k = String.valueOf(words[i].charAt(j));
				v.add(map.get(k));
			}

		}

		System.out.println("map 출력");
		for (String key : map.keySet()) {
			String[] value = map.get(key);
			System.out.println(key + " : " + Arrays.toString(value));
		}

		System.out.println("가능한 문자 어레이리스트 출력");
		for (int i = 0; i < wordsToStr.size(); i++) {
			System.out.println(i + ":" + Arrays.toString(wordsToStr.get(i)));
		}

		// words의 여러 버전 중 하나씩 가져와서 numstrs 원소 중 포함하는 원소가 있는지 세는 작업을 모든 numstrs 원소에 한다
	}

}
