package ch16.problem.no8;

public class Example {
	private static Student[] students = { new Student("홍길동", 90, 96), new Student("신용권", 95, 93) };

	// avg() 메소드 작성
	private static double avg(Function<Student> f) {

		double total = 0;

		for (int i = 0; i < students.length; i++) {
			total += f.apply(students[i]);

		}
		return total / students.length;

	}

	public static void main(String[] args) {
		double englishAvg = avg(s -> s.getEnglishScore()); // apply는 점수를 리턴하는 걸로 재정의
		System.out.println("영어 평균 점수: " + englishAvg);
		double mathAvg = avg(s -> s.getMathScore());
		System.out.println("수학 평균 점수: " + mathAvg);
	}

}