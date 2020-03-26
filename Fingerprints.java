import java.util.Scanner;

public class Fingerprints {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), m = in.nextInt(), i;
		int[] seq = new int[n], finger = new int[m];
		String str = "";
		
		for (i = 0; i < n; i++) {
			seq[i] = in.nextInt();
		}
		for (i = 0; i < m; i++) {
			finger[i] = in.nextInt();
		}
		for (int x : seq) {
			for (int y : finger) {
				if (x == y) {
					str += x + " ";
				}
			}
		}
		System.out.println(str);
		in.close();
	}
}
