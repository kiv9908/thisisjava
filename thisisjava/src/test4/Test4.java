package test4;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Test4 {

	public static void main(String[] args) {

		/*
		 * 물품 번호는 낮은 순서대로 진행 경매는 0부터 시작, 단위 1만 자본이 가장 많은 사람 낙찰, 낙찰금액 두번쨰 많은 사람 자본의 + 1만
		 * 자본이 가장 많은 사람이 2명 이상 - 참가 번호가 가장 낮은 참가자가 자본 전부 지불하고 낙찰 참가자의 자본이 모두 0원 남았을 때 경매
		 * 낙찰금액은 0원
		 * 
		 */

	}

	public int[] solution(int n, int[] amounts) {
		int[] answer = {0};
		
		int m = amounts.length;
		int count = 0;
		
		// 배열 -> List 변환 
		// 여기서 망함 왜냐면 순서 날아감, 반복문으로 map으로 담는게 좋을 듯
		List<int[]> amountsList = Arrays.asList(amounts);
		// 내림차순 
		Collections.sort(amountsList,Collections.reverseOrder());
		
		// 가장 큰 자본과 중복인 자본 수 확인
		for (int i = 1; i<m;i++) {
			if (amountsList.get(0) == amountsList.get(i)) {
				count+=1;
			}
		}
		
		
		// 자본이 가장 많은 사람이 2명 이상
		if (count>=2) {
			//참가 번호가 가장 낮은 참가자가 자본 전부 지불하고 낙찰
			amountsList.get(0)
		}
	
		
		return answer;
	}

}
