package ch04.sec09;

import java.util.Scanner;

public class no9 {

	public static void main(String[] args) {

		int num = (int) (Math.random() * 100);
		int tryNum = 0;
		System.out.println(num);

		while (true) {
			Scanner scanner = new Scanner(System.in);
			int userNum = Integer.valueOf(scanner.nextLine());

			if (userNum < num) {
				System.out.println("큰 값을 입력하세요.");
				tryNum++;
			} else if (userNum > num) {
				System.out.println("작은 값을 입력하세요.");
				tryNum++;
			} else {
				System.out.println("정답입니다. 시도횟수 : " + tryNum + "번");
				break;
			}
		}

	}

}
