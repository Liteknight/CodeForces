import java.util.Scanner;

public class Magnets {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(), j, groups=1;
		String mag1 = sc.next(), mag2;
		
		for (j=1; j<n; j++) {
			mag2 = sc.next();
			
			if (!mag1.equals(mag2)) {
				groups++;
			}
			mag1 = mag2;
		}
		
		System.out.println(groups);
		sc.close();
	}
}