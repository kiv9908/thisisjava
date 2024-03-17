package ch05;

public class ArrayLengthExample {

	public static void main(String[] args) {
		// 배열 변수 선언과 배열 타입
		int[] scores = {84, 90, 96};
		int sum = 0;
		for (int i = 0; i<scores.length; i++) {
			sum += scores[i];
		}
		System.out.println("총합 : "+sum);
		double avg = (double)sum / scores.length;
		System.out.println("평균 : "+avg);
	}

}
