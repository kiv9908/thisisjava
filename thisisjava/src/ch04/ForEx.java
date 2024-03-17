package ch04;

public class ForEx {
	public static void main(String[] args) {
		
		// 반복문 : 반복 실행문
		for (int a = 100; a <= 110 ; a++) {
			System.out.println(a+"안녕하세요");
		}
		
		// int sum = 1 + 2 + 3 + 4 + 5 를 하고 싶다면
		int sum = 0;
		for (int i = 1 ; i<=5 ; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		// 2씩 증가
		for (int i = 1 ; i<=5 ; i+=2) {
			sum += i;
		}
		System.out.println(sum);
		
		// 무한반복
//		for (;;) {
//			System.out.println("무한");
//		}
		
		// 중첩 for문
		// 구구단
		
		// 2단 출력
		for (int j = 2 ; j < 10 ; j++) {
			System.out.println("----------");
			System.out.println("["+j+"단]");

			for (int i = 1 ; i <10 ; i++) {
				System.out.println(j+" * "+i+" = "+j*i);
			}
		}
		
		
		
		
		
	}


}
