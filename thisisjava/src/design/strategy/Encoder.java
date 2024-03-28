package design.strategy;

public class Encoder {

	private EncodingStrategy strategy;

	void setStrategy(EncodingStrategy strategy) {
		this.strategy = strategy;
	}

	public String getMessage(String msg) {
		return strategy.encode(msg);
	}
}
