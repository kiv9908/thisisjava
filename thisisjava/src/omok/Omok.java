package omok;

public class Omok {
	public static void main(String[] args) {

		// 필드
		Player user = new Player("사용자", "O");
		Player computer = new Player("컴퓨터", "X");
		Board board = new Board(19);

		// 생성자
		play(board, user, computer);
	}

	// 메소드
	private static void play(Board board, Player user, Player computer) {
		board.print(user, computer);

	}

}