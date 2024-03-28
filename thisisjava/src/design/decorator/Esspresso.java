package design.decorator;

import lombok.AllArgsConstructor;

@AllArgsConstructor
// 아메리카노를 꾸며줌, decorator
public class Esspresso implements Basic {
	// 아메리카노 주입!
	private Basic ame;
	private int upPrice;
	private int upShot;
	private String name;

	@Override
	public int getShot() {
		return ame.getShot() + this.getShot();
	}

	@Override
	public int getPrice() {
		return ame.getPrice() + this.getPrice();
	}

}
