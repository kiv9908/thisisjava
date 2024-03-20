package test2;

import java.util.Arrays;
import java.util.Comparator;

class Solution {
	public int solution(int tickets, int[][] requests) {

		int soldTickets = 0;

		Arrays.sort(requests, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[0] - o2[0];
			}
		});

		for (int i = 0; i < requests.length; i++) {

			if (tickets >= requests[i][1]) {

				soldTickets += requests[i][1];
				tickets -= requests[i][1];

			}

		}

		return soldTickets;
	}

}
