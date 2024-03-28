package design.adapter;

public class SamsungTV implements Electric220v {

	@Override
	public void powerOn() {
		System.out.println("삼성티비 220v");
	}

}
