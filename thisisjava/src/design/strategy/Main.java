package design.strategy;

public class Main {

	public static void main(String[] args) {
		Encoder encoder = new Encoder();
		// 전략객체 주입
		encoder.setStrategy(new Utf8Encoding());
		System.out.println(encoder.getMessage("안녕하세요"));

		encoder.setStrategy(new EUCkrEncoding());
		System.out.println(encoder.getMessage("안녕하세요"));

	}

}
