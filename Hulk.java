import java.util.Scanner;

public class Hulk {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String result = "I hate";
		
		for (int i=1; i<n; i++) {
			
			if (i % 2 == 0) {
				result += " that I hate";
			} else {
				result += " that I love";
			}
		}
		result += " it";
		System.out.println(result);
		sc.close();
	}
}