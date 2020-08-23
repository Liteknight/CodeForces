import java.util.Scanner;

public class KeyboardMole {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String d = in.next(), s = in.next(), k = "qwertyuiopasdfghjkl;zxcvbnm,./";
		
		int x = d.equals("L") ? 1 : -1;
		in.close();
		
		for (int i = 0; i < s.length(); i++) {
			System.out.print(k.charAt(k.indexOf(s.charAt(i)) + x));
		}
	}
}
