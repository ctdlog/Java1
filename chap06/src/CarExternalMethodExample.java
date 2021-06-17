
public class CarExternalMethodExample {

	public static void main(String[] args) {
		CarExternalMethod myCar = new CarExternalMethod();
		myCar.keyTurnOn();
		myCar.run();
		int speed = myCar.getSpeed();
		System.out.println("현재 속도: " + speed + "km/h");

	}

}
