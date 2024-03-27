package test4.auctionProblem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class test4 {

	public static void main(String[] args) {
		int n = 4;
		int[] amounts = { 1000000, 490000, 700000, 290000 };
		int count = 0;
		int[] answer = new int[amounts.length];

		// 배열의 순서와 값을 ArrayList(1)로 저장 -> ArrayList(2)로 저장
		List<Integer[]> list = new ArrayList<Integer[]>();
		for (int i = 0; i < amounts.length; i++) {
			list.add(new Integer[] { i, amounts[i] });
		}

		for (Integer[] arr : list) {
			System.out.println(Arrays.toString(arr));
		}

		// (2)를 값을 기준으로 오름차순 정렬
		while (count < n) {

			Collections.sort(list, new Comparator<Integer[]>() {

				@Override
				public int compare(Integer[] a1, Integer[] a2) {
					// 먼저 값을 비교하여 값이 같은 경우
					if (a1[1].equals(a2[1])) {
						// 더 작은 인덱스를 가진 요소를 더 앞쪽에 위치하도록 정렬
						return Integer.compare(a1[0], a2[0]);
					}
					// 값이 다른 경우에는 값을 기준으로 내림차순 정렬
					return a2[1].compareTo(a1[1]);
				}
			});

			for (Integer[] arr : list) {
				System.out.println(Arrays.toString(arr));
			}

			// (2)에서 앞에서부터 하나씩 낙찰, 리스트에 저장
			Integer[] amount = list.get(0);

			// 정렬되어 있기 때문, 2번째와만 같은지 비교

			if (!amount[1].equals(list.get(1)[1])) {
				answer[count] = list.get(1)[1] + 10000;
				amount[1] -= answer[count];
				System.out.println(amount[1]);
				list.set(0, amount);

			} else {
				answer[count] = amount[1];
				amount[1] = 0;
				System.out.println(amount[1]);
				list.set(0, amount);
			}

			count += 1;

		}
		System.out.println(Arrays.toString(answer));

	}

}
