package ch12.sec04;

import java.util.Properties;
import java.util.Set;

public class GetPropertyExample {

	public static void main(String[] args) {
		String osName = System.getProperty("os.name");
		String userName = System.getProperty("user. name");
		String userHome = System.getProperty("user.home");
		System.out.println(osName);
		System.out.println(userName);
		System.out.println(userHome);

		// 전체 키와 값을 출력
		System.out.println("------------------------------------------------");
		System.out.println("key： value");
		System.out.println("------------------------------------------------ ");
		Properties props = System.getProperties(); // 모든 propertise 다 가져옴
		Set keys = props.keySet(); // key set을 다 모아서 return
		for (Object objKey : keys) { // keys에 들어 있는 타입을 다 모르기 때문에 자동형변환
			String key = (String) objKey; // 강제형변환
			String value = System.getProperty(key);
			System.out.printf("%-40s： %s\n", keys, value);
		}

		System.out.println("------------------------------------------------");
		System.out.println(keys);
	}
}
