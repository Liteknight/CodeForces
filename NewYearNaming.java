import java.util.Scanner;

public class NewYearNaming {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(), m = sc.nextInt(), i;
		String[] s = new String[n], t = new String[m];

		for (i=0; i<n; i++) s[i] = sc.next();
		for (i=0; i<m; i++) t[i] = sc.next();

		int q = sc.nextInt();
		
		for (i=0; i<q; i++) {
			
			int y = sc.nextInt()-1;
			System.out.println(s[y%n] + t[y%m]);
		}
		sc.close();
	}
}