import java.util.Scanner;

public class ConstructStr {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t-- > 0) {
			
			int n = in.nextInt(), a = in.nextInt(), b = in.nextInt(), i, j = 0;
			String s = "";
			char[] c = "qwertyuiopasdfghjklzxcvbnm".toCharArray();

			while (s.length() < n) {
				i = 0;
				while (s.length() < n && i < a) {
					if (j < b) {
						s += c[j];
						j++;
					} else {
						s += 'q';
					}
					i++;
				}
				j = 0;
			}
			System.out.println(s);
		}
		in.close();
	}
}
