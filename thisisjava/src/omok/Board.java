package omok;

import java.util.Scanner;

public class Board {

	// 필드
	// map은 size * size로 만들어짐
	int size;
	static String[][] map;
	static int[][][] memo;

	static String[] rowIndex = { " 0", " 1", " 2", " 3", " 4", " 5", " 6", " 7", " 8", " 9", "10", "11", "12", "13",
			"14", "15", "16", "17", "18", "19" };
	static String[] colIndex = { " ", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P",
			"Q", "R", "S" };

	// 하, 대각선 우, 우, 대각선 좌
	static int[] dx = { 1, 1, 0, -1 };
	static int[] dy = { 0, 1, 1, 1 };
	static String whoIsWin;

	// 생성자

	Board(int size) {
		this.size = size;
		map = new String[size][size];
		memo = new int[size][size][4];
		// map 배열을 만들고, 그 안에 . 을 담는다
		for (int row = 0; row < size; row++) {
			for (int col = 0; col < size; col++) {
				map[row][col] = ".";
			}
		}
	}

	// 메소드
	// map 배열을 출력한다
	public void print(Player a, Player b) {

		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		int trunCount = 1;

		while (flag) {

			for (int row = 0; row < size; row++) {
				System.out.print(rowIndex[row]);
				for (int col = 0; col < size; col++) {
					System.out.print(" " + map[row][col]);
				}
				System.out.println();
			}
			// Step 1: 좌표 출력하기
			for (int i = 0; i < colIndex.length; i++) {
				System.out.print(" " + colIndex[i]);
			}
			System.out.println();

			// Step 2: 바둑판에 돌 놓기
			// Step 3: 검은 돌, 흰 돌 번갈아 가며 놓기

			// 사용자, 컴퓨터 출력
			System.out.print(a.name + "> ");
			// 좌표 입력 받기
			String input = sc.nextLine();
			// 띄어쓰기로 구분된 문자 -> 배열로 바꾸기
			String[] arr = input.split(" ");
			char[] chrArr = input.toCharArray();
			// 배열 원소 int로 변환 후, map 값 교체
			// 알파벳(열) 숫자(행) 입력 순서 반영

			if (trunCount % 2 != 0) {
				map[Integer.parseInt(arr[1])][chrArr[0] - 65] = a.stone;
				trunCount += 1;
				whoIsWin = checkFive();
			} else {
				map[Integer.parseInt(arr[1])][chrArr[0] - 65] = b.stone;
				trunCount += 1;
				whoIsWin = checkFive();
			}

//			whoIsWin = checkFive();
//			System.out.println(whoIsWin);

			if (whoIsWin.equals(a.stone)) {
				System.out.println(a.name + "가 이겼습니다.");
				flag = false;

				for (int row = 0; row < size; row++) {
					System.out.print(rowIndex[row]);
					for (int col = 0; col < size; col++) {
						System.out.print(" " + map[row][col]);
					}
					System.out.println();
				}
				// Step 1: 좌표 출력하기
				for (int i = 0; i < colIndex.length; i++) {
					System.out.print(" " + colIndex[i]);
				}
				System.out.println();

			} else if (whoIsWin.equals(b.stone)) {
				System.out.println(b.name + "가 이겼습니다.");
				flag = false;

				for (int row = 0; row < size; row++) {
					System.out.print(rowIndex[row]);
					for (int col = 0; col < size; col++) {
						System.out.print(" " + map[row][col]);
					}
					System.out.println();
				}
				// Step 1: 좌표 출력하기
				for (int i = 0; i < colIndex.length; i++) {
					System.out.print(" " + colIndex[i]);
				}
				System.out.println();
			}
		}

	}

	public String checkFive() {
		for (int j = 0; j < size; j++) {
			for (int i = 0; i < size; i++) {
				if (!".".equals(map[i][j])) {
					for (int d = 0; d < 4; d++) {
						if (calc(i, j, d, map[i][j]) == 5) {
							return map[i][j];
						}
					}
				}
			}
		}
		return "진행중";
	}

	public int calc(int x, int y, int dir, String stone) {
		int nx = x + dx[dir];
		int ny = y + dy[dir];

		// 범위를 벗어난 경우 제외
		if (nx < 0 || nx >= size || ny < 0 || ny >= size) {
			return 6;
		}

		// 재귀적으로 호출하여 연속된 돌의 개수를 계산
		if (map[nx][ny].equals(stone)) {
			return memo[nx][ny][dir] = calc(nx, ny, dir, stone) + 1;
		}
		return 1;

	}
}
