package design.adapter;

public class Adaptor implements Game110v {

	private Electric220v e220;

	public Adaptor(Electric220v e220) {
		this.e220 = e220;
	}

	@Override
	public void on() {
		this.e220.powerOn();

	}

}
