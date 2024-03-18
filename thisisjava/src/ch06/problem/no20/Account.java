package ch06.problem.no20;

public class Account {

	// account 마다 다른 계좌, 이름, 금액이기 때문에 static안됨.
	private String ano;
	private int balance;
	private String AccountUser;

	// 생성자(초기화)
	public Account(String ano, int balance, String AccountUser) {
		this.ano = ano;
		this.balance = balance;
		this.AccountUser = AccountUser;

	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public static int getBalance() {
		return balance;
	}

	public static void setBalance(int balance) {
		Account.balance = balance;
	}

	public static String getAccountUser() {
		return AccountUser;
	}

	public static void setAccountUser(String accountUser) {
		AccountUser = accountUser;
	}

}
