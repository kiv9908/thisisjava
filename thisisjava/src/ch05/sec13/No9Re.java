package ch05.sec13;

import java.util.Scanner;

public class No9Re {

	public static void main(String[] args) {
		/*
		 * 학생수, 각 학생들의 점수 입력
		 * 최고점수, 평균점수 출력
		 * 
		 * 1~5 입력
		 * 1 : 학생수 입력
		 * 		배열 초기화 (학생수)
		 * 2 : 점수 입력
		 * 		학생수만큼 반복해서 입력, 저장
		 * 3 : 모든 점수 출력
		 * 		반복문
		 * 4 : 최고 점수, 평균 점수 출력
		 * 		평균 : 다 더해서 길이 나눔
		 * 		최고 : 임시변수
		 * 5 : 종료
		 */
		
		boolean flag = true;
		int[] scores =new int[0];
		
		
		
		Scanner sc = new Scanner(System.in);
		
		while (flag) {

            System.out.println("-------------------------------------------------");
            System.out.println("1. 학생수 |2. 점수입력 |3. 점수리스트 |4. 분석 |5. 종료");
            System.out.println("-------------------------------------------------");
            System.out.print("선택> ");
            String input = sc.nextLine();
            
            if ("1".equals(input)) {
            	int count = Integer.parseInt(sc.nextLine());
            	scores =new int[count];
            	
            } else if ("2".equals(input)) {
            	for (int i = 0; i < scores.length; i++) {
                    System.out.print("scores[" + i + "]> ");
                    int score =Integer.parseInt(sc.nextLine());
                    scores[i] = score;
            	
            } else if ("3".equals(input)) {
            	for (int i =0;i<scores.length;i++) {
            		System.out.println("scores[" + i + "]> " + scores[i]);
           
            }
            	
            } else if ("4".equals(input)) {
            	
            } else if ("5".equals(input)) {
            	flag = false;
            }
				
			}

	}

}
