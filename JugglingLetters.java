import java.util.Scanner;

public class JugglingLetters {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t-- > 0) {
			
			int n = in.nextInt(), i, j, a[] = new int[26];
			boolean o = true;
			for (i = 0; i < n; i++) {
				
				String s = in.next();
				for (j = 0; j < s.length(); j++) {
					a[s.charAt(j) - 'a']++;
				}
			}
			for (i = 0; i < 26; i++) {
				if (a[i] % n != 0) {
					o = false;
				}
			}
			System.out.println(o ? "YES" : "NO");
		}
		in.close();
	}
}
