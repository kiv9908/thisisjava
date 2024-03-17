package ch04.sec02;

public class IfExample {

	public static void main(String[] args) {
		int score = 93;
		
		if (score >= 90) {
			System.out.println("점수가 90보다 큽니다. ");
			System.out.println("등급은 A 입니다. ");
		}
		if (score < 90) // 중괄호 생략시 다음 한 줄만 조건으로 확인.
			System.out.println("점수가 90보다 작습니다.");
		System.out.println("등급은 B입니다.");
		
		// 주사위 굴려 나오는 눈 1~6 중의 하나
		// Math.random() : 0 이상 1 미만 사이의 실수 추출
		// 원하는 숫자의 개수를 곱한다
		// Math.random()*6 : 0 이상 6미만 사이의 실수 추출
		// 정수로 변환
		// 시작값 더해줌
		// (int)(Math.random()*6)+1 : 1이상 6이하 정수 추출
		
		
		System.out.println((int)(Math.random()*6)+1);
		
	}
}