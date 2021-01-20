import java.util.Scanner;

public class LineToCashier {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), i, j, a[] = new int[n], b[] = new int[n], m = Integer.MAX_VALUE;

		for (i = 0; i < n; i++) {
			a[i] = in.nextInt();
			b[i] = a[i] * 15;
		}
		for (i = 0; i < n; i++)
			for (j = 0; j < a[i]; j++)
				b[i] += in.nextInt() * 5;		
		in.close();	
		
		for (i = 0; i < n; i++)
			m = Math.min(m, b[i]);		
		System.out.println(m);
	}
}
