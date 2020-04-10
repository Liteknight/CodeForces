import java.util.Scanner;

public class CapsLock {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String s = in.next();

		if (s.equals(s.toUpperCase())) {
			System.out.println(s.toLowerCase());
			
		} else if (s.substring(1).equals(s.substring(1).toUpperCase())) {
			System.out.println(s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase());
			
		} else {
			System.out.println(s);
		}
		in.close();
	}
}