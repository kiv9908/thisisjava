package design.decorator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Americano implements Basic {

	private int shot;
	private int price;

	@Override
	public int getShot() {
		// TODO Auto-generated method stub
		return shot;
	}

	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return price;
	}

}
