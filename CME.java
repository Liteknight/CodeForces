import java.util.Scanner;

public class CME {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int q = sc.nextInt(), n, i, buy;	
		
		for (i=0; i<q; i++) {
			
			n = sc.nextInt();
			buy = 0;
			
			if (n == 2) {
				buy = 2;
				
			} else if (n % 2 != 0) {
				buy = 1;
			}
			
			System.out.println(buy);
		}
		sc.close();
	}
}