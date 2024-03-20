import java.util.Scanner;

class Solution {

	// 필드
	private int tickets;
	private int[][] requests;

	int grade[][];

	// 생성자

	public int solution(int tickets, int[][] requests) {

		this.tickets = tickets;
		this.requests = requests;

	}

	int cal() {

		grade = new int[requests.length][2];
		int maxGrade = 0;

		for (int i = 0; i < requests.length; i++) {

			if (requests[i][0] < maxGrade) {
				maxGrade = requests[i][0];

			}

		}

		Scanner sc = new Scanner(System.in);

		/*
		 * 입력 티켓수 int 배열 int[]
		 * 
		 * 처리 필드 생성
		 * 
		 * 제일 높은 등급 순으로 정렬 if 남은티켓수 < 차감하려는 티켓 수 result = 남은 티켓수 return result else
		 * 남은티켓수-차감하려는 티켓 수 return result
		 * 
		 * 결과 int result = new int();
		 */

		int soldTickets = 0;

		return soldTickets;
	}
}