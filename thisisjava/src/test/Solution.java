package test;

class Solution {
	public int solution(int m, int[] ledger) {
		int account = 0;

		for (int i = 0; i < ledger.length; i++) {
			if (account + ledger[i] >= -m) {
				account += ledger[i];
			}
		}
		return account;
	}
}