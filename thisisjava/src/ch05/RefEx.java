package ch05;

public class RefEx {

	public static void main(String[] args) {
		String name = null; // null로 초기화 된다!

		System.out.println(name);
//		System.out.println(name.equals("홍길동")); // 변수가 null인 상태에서 객체의 데이터나 메소드를 사용하려 할 때 발생하는 예외

		name = "홍길동";
		for (int i = 0; i < name.length(); i++) {
			System.out.println(name.charAt(i));
		}

		String str = "자바 프로프그래밍";
		System.out.println(str.charAt(5));
		System.out.println(str.substring(3, 5));
		System.out.println(str.indexOf("프"));

		System.out.println(System.currentTimeMillis());

		String fileName = "내사진.jpg";
				
		// 파일명에 . 있어서 확장자가 한번에 안뽑히는 경우
		String newFileName = System.currentTimeMillis() + fileName.substring(fileName.lastIndexOf("."));

		System.out.println(newFileName);

	}

}
