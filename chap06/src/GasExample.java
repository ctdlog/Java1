
public class GasExample {

	public static void main(String[] args) {
		Gas myGas = new Gas();
		
		myGas.setGas(5); //Gas�� setGas() �޼ҵ� ȣ��
		
		boolean gasState = myGas.isLeftGas(); //Gas�� isLeftGas() �޼ҵ� ȣ��
		if(gasState) {
			System.out.println("����մϴ�.");
			myGas.run(); //Gas�� run() �޼ҵ� ȣ��
		}
		
		if(myGas.isLeftGas()) { //Gas�� isLeftGas() �޼ҵ� ȣ��
			System.out.println("gas�� ������ �ʿ䰡 �����ϴ�.");
		} else {
			System.out.println("gas�� �����ϼ���.");
		}
		
	}

}
