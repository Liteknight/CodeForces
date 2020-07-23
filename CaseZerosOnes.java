import java.util.Scanner;

public class CaseZerosOnes {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), i, o = 0, z = 0;
		String s = in.next();
		in.close();

		for (i = 0; i < n; i++) {
			if (s.charAt(i) == '1') {
				o++;
			} else {
				z++;
			}
		}
		System.out.println(Math.abs(o - z));
	}
}
