
public class CarExternalMethodExample {

	public static void main(String[] args) {
		CarExternalMethod myCar = new CarExternalMethod();
		myCar.keyTurnOn();
		myCar.run();
		int speed = myCar.getSpeed();
		System.out.println("���� �ӵ�: " + speed + "km/h");

	}

}
