import java.util.Scanner;

public class SentimentReplace {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), k = in.nextInt();

		if (k == 1) {
			int i, a[] = new int[n];
			String o = "No";
			
			for (i = 0; i < n; i++)
				a[i] = in.nextInt();
			int b = in.nextInt();

			for (i = 0; i < n; i++) {
				if (a[i] == 0)
					a[i] = b;
				
				if (i > 0)
					if (a[i] <= a[i - 1])
						o = "Yes";
			}
			System.out.println(o);
		} else {
			System.out.println("Yes");
		}
		in.close();
	}
}
