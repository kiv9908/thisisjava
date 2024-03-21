package ch12.sec10;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternExample {

	public static void main(String[] args) {

		// complie 미리 작업을 해놓는 것, 실행하기 위한 준비작업을 통칭함
		// 소문자 b로 시작, 알파벳 소문자 1개 이상
		Pattern p = Pattern.compile("b[a-z]*");

		Matcher m;
		m = p.matcher("bat");

		System.out.println(m.matches());

		String[] str = { "bat", "bed", "blue", "cat" };
		for (String s : str) {
			m = p.matcher(s);
			System.out.println(m.matches());
		}

	}

}
