
import java.util.Scanner;
import java.util.Arrays;

public class FormingTeams {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt(), i, problems=0;
		int[] nums = new int[n];
		
		for (i=0; i<n; i++) {
			nums[i] = in.nextInt();
		}
		Arrays.sort(nums);
		
		for (i=0; i<n; i+=2) {
			
			problems += Math.abs(nums[i] - nums[i+1]);
		}
		System.out.println(problems);
		in.close();
	}

}
