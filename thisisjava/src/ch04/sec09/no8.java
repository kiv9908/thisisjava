package ch04.sec09;

public class no8 {

	public static void main(String[] args) {
		int amountPaid = 187000;

		while (amountPaid != 0) {
			if ((int) (amountPaid / 50000) >= 1) {
				System.out.println("5만원권 "+(int) (amountPaid / 50000)+"장");
				amountPaid = amountPaid - 50000 * (int) (amountPaid / 50000);

			} else if ((int) (amountPaid / 10000) >= 1) {
				System.out.println("1만원권 "+(int)(amountPaid / 10000)+"장");
				amountPaid = amountPaid - 10000 * (int) (amountPaid / 10000);
			} else if ((int) (amountPaid / 5000) >= 1) {
				System.out.println("5천원권 "+(int)(amountPaid / 5000)+"장");
				amountPaid = amountPaid - 5000 * (int) (amountPaid / 5000);
			} else {
				System.out.println("1천원권 "+(int)(amountPaid / 1000)+"장");
				amountPaid = amountPaid - 1000 * (int) (amountPaid / 1000);
			}
		}

	}

}
