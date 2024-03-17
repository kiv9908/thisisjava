package ch02.sec06;

import java.util.Scanner;

public class SrtingExample {

	public static void main(String[] args) {
		String name = "홍길동";
		String job = "프로그래머";
		System.out.println(name);
		System.out.println(job);
		
		String str = "나는 \" 자바\"를 배웁니다.";
		System.out.println(str);
		
		str = "번호\t이름\t직업";
		System.out.println(str);
		
		System.out.print("나는\n"); // println 아님 주의
		System.out.print("자바를\n");
		System.out.println("나는\n 자바를\n배웁니다.");
		
		String text = """ 
				나는
				자바를
				배웁니다.""";

		System.out.println(text);
		
		String str1 = "" +
		"{\n"+
		"\t\"id\":winter\",\n"+
		"\t\"name\":\"눈송이\"\n"+
		"}";
		
		System.out.println(str1);
		
		String s1 = "1";
		// int i1 = (int)s1; XXX
		// 문자열 -> 기본자료형 : 클래스명.parse자료형
		int i1 = Integer.parseInt(s1);
		
		System.out.println(i1);
		
		String s2 = "true";
		boolean s21 = Boolean.parseBoolean(s2);
		if(s21) {
			int x2 = 1;
			System.out.println("true");
		} else {
			System.out.println("false");	
		}
		
		String s4 = String.valueOf(1);
		System.out.println(s4);
		
		
	}

}
