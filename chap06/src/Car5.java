
public class Car5 {
	int speed;
	
	void run() {
		System.out.println(speed + "���� �޸��ϴ�.");
	}
	
	public static void main(String[] args) {
		Car5 myCar = new Car5();
		myCar.speed = 60;
		myCar.run();
	}
}
