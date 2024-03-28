package design.decorator;

public class Main {

	public static void main(String[] args) {
		Basic ame = new Americano(2, 2000);
		System.out.println(ame.getPrice());

		Basic ess = new Esspresso(ame, 500, 2, "에스프레소");

	}

}
