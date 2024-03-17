package ch04.sec09;

import java.util.Scanner;

public class no7 {

	public static void main(String[] args) {

		int balance = 0; // balance 잔고
		boolean flag = true; // 이렇게 하면 조건 충족시 멈출 수 있음!
		Scanner scan = new Scanner(System.in); // 반복문 안에서 생성하면 메모리가 차기 때문에 밖에서 생성하기

		while (flag) {
			System.out.println("---------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("---------------------------------");
			System.out.print("선택> ");

			String number = scan.nextLine();

			// number == 1 이거 안됩니다!!!
			if (number.equals("1")) {
				System.out.print("예금액> ");
				balance += Integer.parseInt(scan.nextLine()); // Interger.parseInt 문자-> 정수

			} else if (number.equals("2")) {
				System.out.print("출금액> ");
				String str3 = scan.nextLine();
				balance -= Integer.parseInt(scan.nextLine());

			} else if (number.equals("3")) {
				System.out.print("잔고> " + balance);
				System.out.println();

			} else if (number.equals("4")) {
				System.out.print("프로그램 종료");
				break;
			}

		}

	}

}
