package array;
import java.util.Scanner;

public class ReverseInGrp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}

			int div = n / k;
			int rem = n % k;

			int start = 0;
			int end = k - 1;
			while (div > 0) {
				reverse(arr, start, end);
				div--;
				start += k;
				end += k;
			}

			if (rem > 0) {
				reverse(arr, start, end - k + rem);
			}
			StringBuilder sb = new StringBuilder();
			for(int i = 0; i < n; i++){
				sb.append(arr[i]+" ");
			}
		}
	}

	private static void reverse(int[] arr, int start, int end) {

		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}

	}

}
