import java.util.Scanner;

public class AngryStudents {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t-- > 0) {

			int k = in.nextInt(), i, d = 0;
			String s = in.next();

			for (i = 0; i < k; i++) {
				if (s.charAt(i) == 'A') {
					for (int j = i + 1; j < k; j++) {
						
						if (s.charAt(j) == 'P') {
							int x = j - i;
							d = Math.max(d, x);
						} else {
							break;
						}
					}
				}
			}
			System.out.println(d);
		}
		in.close();
	}
}
