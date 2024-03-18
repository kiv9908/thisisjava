package ch06.problem.no20;

import java.util.Scanner;

public class BankAppliction {

	public static Scanner scanner = new Scanner(System.in);
	public static Account[] accountArray = new Account[100];

	public static void main(String[] args) {

		boolean run = true;

		while (run) {

			System.out.println("--------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 |3.예금|4.출금|5.종료");
			System.out.println("--------------------------------------");
			System.out.print("선택> ");

			int selectNo = Integer.parseInt(scanner.nextLine());

			if (selectNo == 1) {
				createAccount();
			} else if (selectNo == 2) {
				accountList();
			} else if (selectNo == 3) {
				deposit();
			} else if (selectNo == 4) {
				withdraw();
			} else if (selectNo == 5) {
				run = false;
				System.out.println("프로그램 종료");
			}

		}
	}

	// 계좌 생성
	private static void createAccount() {

		System.out.println("-------------");
		System.out.println("계좌 생성");
		System.out.println("-------------");

		System.out.print("계좌번호(000-000형식) : ");
		String accountNum = scanner.nextLine();
		System.out.print("계좌주 : ");
		String accountOwner = scanner.nextLine();
		System.out.print("초기 입금액 : ");
		int accountBal = Integer.parseInt(scanner.nextLine());

		Account newAccount = new Account(accountOwner, accountBal, accountNum);

		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) {
				accountArray[i] = newAccount;
				System.out.println("결과 : 계좌가 생성되었습니다.");
				break;
			}
		}

	}

	private static void accountList() {

		System.out.println("-------------");
		System.out.println("계좌 목록");
		System.out.println("-------------");

		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] != null) {
				System.out.println(accountArray[i].getAno() + "\t" + accountArray[i].getAccountUser() + "\t"
						+ accountArray[i].getBalance());
			}
		}

	}

	private static void deposit() {

		System.out.println("-------------");
		System.out.println("예금");
		System.out.println("-------------");

		System.out.print("계좌번호(000-000형식) : ");
		String accountNum = scanner.nextLine();
		System.out.print("예금액 : ");
		int price = Integer.parseInt(scanner.nextLine());

		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i].getAno().equals(accountNum)) {
				if (accountArray[i].getBalance() - price < 0) {
					System.out.println("잔액이 부족합니다.");
				}
				accountArray[i].setBalance(accountArray[i].getBalance() + price);
				break;

			}
		}
	}

	private static void withdraw() {

		System.out.println("-------------");
		System.out.println("출금");
		System.out.println("-------------");

		System.out.println("계좌번호(000-000형식) : ");
		String accountNum = scanner.nextLine();
		System.out.println("cnf금액 : ");
		int accountBal = scanner.nextInt();

		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i].getAno().equals(accountNum)) {
				accountArray[i].setBalance(accountArray[i].getBalance() - accountBal);
				System.out.println("결과 : 출금이 성공되었습니다.");
				break;
			}
		}

	}
}
