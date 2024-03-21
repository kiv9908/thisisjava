package ch12;

import java.text.DecimalFormat;

public class DecimalFormatEx {

	public static void main(String[] args) {
		double price = 187000.1;

		// 자리수 맞추고 싶을 때 : 0 <-> 아닐떄 #
		DecimalFormat df = new DecimalFormat("#,###.00");
		String price2 = df.format(price);

		System.out.println(price2);

	}

}
