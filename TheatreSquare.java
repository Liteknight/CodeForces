
import java.util.Scanner;

public class TheatreSquare {
	
	private static long cover (int a, int b) {
		return (long)Math.ceil((double) a / (double) b);
	}
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt(), m = in.nextInt(), a = in.nextInt();
		System.out.println(cover(n, a) * cover(m, a));
		
		in.close();
	}
}
