import java.util.Scanner;

public class AntiSudoku {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t-- > 0) {
			
			for (int i = 0; i < 9; i++) {
				String s = in.next(), n = s.replaceAll("1", "2");
				System.out.println(n);
			}
		}
		in.close();
	}
}
