package ch12.sec11.exam02;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor

public class Car {

	private String model;
	private String owner;
	private String price;

	public Car(String model) {
		this.model = model;
	}

}
