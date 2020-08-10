import java.util.Scanner;

public class BookReading {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), t = in.nextInt(), i;
		
		for (i = 0; i < n; i++) {
			t -= (86400 - in.nextInt());
			
			if (t <= 0) {
				System.out.println(i + 1);
				break;
			}
		}
		in.close();
	}
}
