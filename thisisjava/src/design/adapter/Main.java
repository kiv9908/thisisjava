package design.adapter;

public class Main {

	public static void main(String[] args) {

		Switch s = new Switch();
		connect(s);

		SamsungTV tv = new SamsungTV();
		Adaptor a = new Adaptor(tv);
		connect(a);

	}

	static void connect(Game110v v) {
		v.on();
	}

}
