import java.util.Scanner;

public class VanyaAndFence {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(), h = sc.nextInt(), width=0, j, friend;
		
		for (j=0; j<n; j++) {
			friend = sc.nextInt();
			
			width++;
			if (friend > h) width++;
		}
		
		System.out.println(width);
		sc.close();
	}
}