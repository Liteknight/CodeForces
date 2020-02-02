import java.util.Scanner;

public class FileName {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(), i, count=0;
		String str = sc.next();
		
		for (i=0; i<n-2; i++) {
				
			if (str.substring(i, i+3).equals("xxx")) {
				count++;
			}
		}				
		System.out.println(count);
		sc.close();
	}
}