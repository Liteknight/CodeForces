import java.util.Scanner;

public class TomRiddleDiary {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), i;
		String[] arr = new String[n];

		for (i = 0; i < n; i++) {
			String a = in.next(), ans = "NO";
			arr[i] = a;

			for (int j = 0; j < i; j++) {
				if (arr[j].equals(a)) {
					ans = "YES";
				}
			}
			System.out.println(ans);
		}
		in.close();
	}
}
