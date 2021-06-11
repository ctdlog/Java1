
public class Exercise06 {

	public static void main(String[] args) {
		int i;
		String str = "*";
		
		for(i=1; i<=5; i++) {
			String repeated = str.repeat(i);
			System.out.println(repeated);
		}
	}

}
