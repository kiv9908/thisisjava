package ch04.sec05;

public class SumFrom1To100Example {

	public static void main(String[] args) {
		
		// while문 밖에서도 변수를 쓰기 위해 선언, 초기화 진행
		int sum = 0;
		int i = 1;
		
		while(i<=100) {
			sum += i;
			i++;
		}
		
		System.out.println("1~"+(i-1)+" 합 : " + sum);
		
		// 조건을 만족하지 않더라도 한번은 실행되게 하기 위함.
		do {
			System.out.println("되나?");
			
		} while (i <= 100);
		
		// break, continue 차이
		for (int j = 1 ; j <= 10 ; j++) {
			// j 가 5일때 중지
//			if (j==5) break;
			// j가 5일때는 아래 실행 X
			if (j==5) continue;
			System.out.println(j);
		}
	}

}
