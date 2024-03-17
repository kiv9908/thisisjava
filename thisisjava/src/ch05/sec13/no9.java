package ch05.sec13;

import java.util.Scanner;

public class no9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean flag = true;
        int numberOfStudent = 0;
        int[] score = null;
        int scoreSum = 0;
        int scoreMax = 0;
        double avg = 0;


        while (flag) {

            System.out.println("-------------------------------------------------");
            System.out.println("1. 학생수 |2. 점수입력 |3. 점수리스트 |4. 분석 |5. 종료");
            System.out.println("-------------------------------------------------");
            System.out.print("선택> ");
            String num = sc.nextLine();

            if (num.equals("1")) {

                System.out.print("학생수> ");
                numberOfStudent = Integer.parseInt(sc.nextLine());
                // 학생수 받아서 배열 초기화까지 해줘야 이 후 저장 가능
                score = new int[numberOfStudent];

            } else if (num.equals("2")) {
                for (int i = 0; i < score.length; i++) {
                    System.out.print("scores[" + i + "]> ");
                    score[i] = Integer.parseInt(sc.nextLine());
                }
            } else if (num.equals("3")) {
                for (int i = 0; i < score.length; i++) {
                    System.out.println("scores[" + i + "]> " + score[i]);
                }
            } else if (num.equals("4")) {
                for (int i = 0; i < score.length; i++) {
                    scoreSum += score[i];
                    if (score[i] > scoreMax) {
                        scoreMax = score[i];
                    }

                }
                avg = (double) scoreSum / numberOfStudent;

                System.out.println("최고 점수: " + scoreMax);
                System.out.println("평균 점수: " + avg);
            } else if (num.equals("5")) {
                System.out.println("프로그램 종료");
                break;
            }

        }
    }
}


