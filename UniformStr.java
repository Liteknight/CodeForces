import java.util.Scanner;

public class UniformStr {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();

		while (t-- > 0) {
			int n = in.nextInt(), k = in.nextInt(), i = 1;
			while (n-- > 0) {
				
				System.out.print((char) ('a' - 1 + i));
				i++;
				if (i > k) {
					i = 1;
				}
			}
			System.out.println();
		}
		in.close();
	}
}
