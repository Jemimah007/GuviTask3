package JavaTask7;

public class Exceptions {

	public static void main(String[] args) {
		try {
		int a[] = {20,30,40,50,60};
		System.out.println(a[7]);
		}catch (Exception e) {
		System.out.println("ArrayIndexOutOfBoundsException");
		}
		try {
		String b = "Jemi";
		System.out.println(b.charAt(7));
		} catch (Exception ea) {
			System.out.println("StringOutOfBoundsException");
		}
		

	}

}
