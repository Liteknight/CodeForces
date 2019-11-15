import java.util.Scanner;

public class InSearchOfAnEasyProblem {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String r = "EASY";
		
		for (int i=0; i<n; i++) {
			int e = sc.nextInt();
			if (e == 1) {				
				r = "HARD";
				break;
			}
		}
		System.out.println(r);
		sc.close();
	}
}