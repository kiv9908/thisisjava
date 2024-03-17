package ch05;

import java.util.Arrays;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class ArrayEx {

	public static void main(String[] args) {

		// 선언
		int[] arr;

		// 초기화
		arr = new int[] { 1, 2, 3, 4, 5 };
		// new(새로운 메모리 주소로)를 써서 새로운 배열을 만들어 초기화
		int[] arr2 = new int[] { 1, 2, 3, 4, 5 };
		int[] arr3 = new int[5]; // {0,0,0,0,0}

		// 값 변경
		arr3[0] = 1;
		System.out.println(Arrays.toString(arr3));

		// 용도 : 하나의 변수에 여러값을 하나로 저장
		// 반복문과 함께 사용
		// for(인덱스=0; 인덱스<길이; 인덱스++){}

		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}

		int a = 1;
		int b = a;
		b = 2;
		System.out.println(a); // a = 1

		// 참조자료형
		// 같은 값을 가르키고 있기 때문에 a2를 바꾸면 b2도 바꾸는거 처럼 보인다.
		int[] a2 = { 1, 2 };
		int[] b2 = a2;
		b2[0] = 3;
		System.out.println(a2); // a2 = {3,2}

		// 자동 초기화
		// 기본 자료형은 0, 참조 자료형은 null 값으로 초기화
		ArrayEx[] names = new ArrayEx[5];
		System.out.println(Arrays.toString(names));
		
		// 다차원배열 (2차원 이상)
		// 행렬
		// 배열안에 배열
		int[][] arr2d = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		
		// [행] [열]
		System.out.println(arr2d[1][1]);
		arr2d = new int[][] {{1,2,3},{4,5,6},{7,8,9}};
		
		// 배열안에 모든 요소 출력
		for (int i = 0 ; i<arr2d.length; i++) {
			for (int j = 0 ; j < arr2d[i].length;j++) {
				System.out.println(arr2d[i][j]);
			}
		
				
		}
		
		// 복사
		// 얕은 복사 (주소 복사)
		int[] array = {1,2,3,4,5};
		int[] array2 = array;
		System.out.println(Arrays.toString(array));
		System.out.println(Arrays.toString(array2));
		
		// 깊은 복사
		
		// 방법 1 - for문 이용
		// 옮겨담을 배열 선언 및 초기화
		int[] array3 = new int[array.length];
		// 옮겨 담기
		for (int i = 0 ; i < array.length; i++) {
			array3[i] = array[i];
		}
		
		System.out.println(Arrays.toString(array3));
		System.out.println(array == array2);
		System.out.println(array == array3);
		
		// 방법 2 - System.arraycopy
		// array -> array4
		int[] array4 = new int[array.length];
		System.arraycopy(array, 0, array4, 0, array.length);
		System.out.println(Arrays.toString(array4));
		
		// 방법3 - Arrays.copyOf
		// array -> array5
		int[] array5 = Arrays.copyOf(array, array.length);
		System.out.println(Arrays.toString(array5));
		
		// 출력
		for (int i = 0 ; i<array5.length ; i++) {
			System.out.println(array5[i]);
		}
		
		// 향상된 for문 (값만 필요할 때)
		// 단점 index처리 못함
		for (int ar : array5) {
			System.out.println(ar);
		}
		
		
		

	}

}
