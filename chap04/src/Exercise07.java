import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) {
		boolean run = true;
		
		int balance = 0;
		int num;
		int deposit;
		int withdraw;
		
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("-------------------------------");
			System.out.println("1.���� | 2.��� | 3.�ܰ� | 4.����");
			System.out.println("-------------------------------");
			System.out.print("����> ");
			num = scanner.nextInt();
			if(num == 1) {
				System.out.print("���ݾ�>");
				deposit = scanner.nextInt();
				balance += deposit;
			} else if(num == 2) {
				System.out.print("��ݾ�>");
				withdraw = scanner.nextInt();
				balance -= withdraw;
			} else if(num == 3) {
				System.out.print("�ܰ�>");
				System.out.println(balance);
			} else if(num == 4) {
				break;
			}
			
			
		}
		
		System.out.println("���α׷� ����");
		
	}

}
