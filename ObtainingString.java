import java.util.Scanner;

public class ObtainingString {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), i, j, k, o = 0;
		
		char s[] = in.next().toCharArray();
		String t = in.next(), os = "";
		in.close();

		for (i = 0; i < n; i++) {
			boolean b = false;
			for (j = i; j < n; j++) {
				
				if (t.charAt(i) == s[j]) {
					o += j - i;
					b = true;
					
					for (k = j; k > i; k--) {
						os += k + " ";
						
						char tmp = s[k];
						s[k] = s[k - 1];
						s[k - 1] = tmp;
					}
					break;
				}
			}
			if (!b) {
				System.out.println(-1);
				return;
			}
		}
		System.out.println(o + "\n" + os);
	}
}
