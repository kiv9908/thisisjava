package ch03;

public class Operation {
	
	public static void main(String[] arg) {
		// 증감연산
		int a = 1;
		/*
		 * 전위연산 : 현재 실행문이 실행되기 전
		 * 후위연산 : 현재 실행문이 실행된 후
		 */
		int b = ++a; // 2
		System.out.println(++a); // 2
		System.out.println(a); // 1로 출력되고 이후 a를 출력하면 2로 나옴
		
		// 하나의 실행문에 하나의 증감식
		a++; // a += 1
		System.out.println(a); // 2
		
		String data = new String("q");
		System.out.println("q".equals(data)); // 코딩은 이렇게!
		System.out.println(data.equals("q")); // 문자열은 객체라서 . 으로 접근 가능, data가 null인 경우 에러가 날 수 있음 
		
		
		int c = 10;
		int d = 20;
		boolean e = c < d && d == 20;
		System.out.println(e);
		
		// score가 60 이상이면 합격, 30 이상 60 미만이면 재시험, 30 미만이면 유급
		int score = 59;
		String grade;
		
		grade = score >= 60 ? "합격" :
			score >= 30 && score < 60 ? "재시험" : "유급";
			
		System.out.println(grade);
		
		int value = 356;
		System.out.println(value / 100 * 100);
		System.out.println(value - value % 100);
		
	}

}
