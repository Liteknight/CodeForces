import java.util.Scanner;

public class FafaAndHisCompany {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n, ways, leaders, workers;
		n = sc.nextInt();
		ways = 0;
		
		for (int i=1; i<n; i++) {
			leaders = i;
			workers = (n - leaders) / leaders;
			
			if (workers * leaders + leaders == n) {
				ways++;
			}
		}
		
		System.out.println(ways);
		sc.close();
	}
}