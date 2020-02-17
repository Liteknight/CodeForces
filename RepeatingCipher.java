
import java.util.Scanner;

public class RepeatingCipher {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt(), i, last = 0;
		String t = in.next(), decoded = "";
		
		for (i = 0; i < n-last; i++) {
			
			decoded += t.charAt(i + last);
			last += i;
		}
			
		System.out.println(decoded);
		in.close();
	}
}
