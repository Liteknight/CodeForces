import java.util.Scanner;

public class KarenCoffee {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), k = in.nextInt(), q = in.nextInt(), arr[] = new int[200002], i, o = 0;

		for (i = 0; i < n; i++) {
			int l = in.nextInt(), r = in.nextInt();
			arr[l]++;
			arr[r + 1]--;
		}
		for (i = 0; i < arr.length; i++) {
			o += arr[i];
			arr[i] = o >= k ? 1 : 0;
		}
		for (i = 1; i < arr.length; i++)
			arr[i] += arr[i - 1];
		
		for (i = 0; i < q; i++) {
			int a = in.nextInt(), b = in.nextInt();
			System.out.println(arr[b] - arr[a - 1]);
		}
		in.close();
	}
}
