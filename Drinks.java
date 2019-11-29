import java.util.Scanner;

public class Drinks {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(), j, p, total=0;
		
		for (j=0; j<n; j++) {
			
			p = sc.nextInt();
			total += p;
		}

		System.out.println((double) total / n);
		sc.close();
	}
}