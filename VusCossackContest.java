import java.util.Scanner;

public class VusCossackContest {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n, m, k;
		n = sc.nextInt();
		m = sc.nextInt();
		k = sc.nextInt();
		
		if (m >= n && k >= n) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		sc.close();
	}
}