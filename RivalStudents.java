
import java.util.Scanner;

public class RivalStudents {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int t = in.nextInt(), i;
		for (i=0; i<t; i++) {
			
			int n = in.nextInt(), x = in.nextInt(), a = in.nextInt(), b = in.nextInt(),
					left = Math.min(a, b), right = Math.max(a, b);

			while (left > 1 && x > 0) {
				left--;
				x--;
			}
			while (right < n && x > 0) {
				right++;
				x--;
			}
			System.out.println(Math.abs(left - right));
		}
		in.close();
	}
}
