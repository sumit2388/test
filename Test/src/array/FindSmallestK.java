package array;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class FindSmallestK {

	public static void main(String[] args) {
		
		
		
//		Scanner sc = new Scanner(System.in);
//		int t = sc.nextInt();
//		while(t-->0){
//			int n = sc.nextInt();
//			int [] arr  = new int[n];
//			for(int i=0;i<n;i++){
//				arr[i]=sc.nextInt();
//			}
//			int k = sc.nextInt();
//		}

		int[] arr = {7, 10, 4, 3, 20 ,15 };

		int n = arr.length;
		int k = 3;
		find(arr, n, k);
//		PriorityQueue<Integer> pq = new PriorityQueue<>(n, Collections.reverseOrder());
//		for (int i = 0; i < n; i++) {
//
//			pq.add(arr[i]);
//			if (pq.size() > k) {
//				pq.remove();
//			}
//		}
//
//		System.out.println(pq.remove());
	}





	public static void find(int[] arr, int n, int k) {

		int max = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}

		int[] countArr = new int[max+1];
		for (int i = 0; i < n; i++) {
			int value = countArr[arr[i]] + 1;
			countArr[arr[i]] = value;
		}
		int x = k;
		for (int i = 0; i <= max+1; i++) {
			x = x - countArr[i];
			if (x <= 0) {
				System.out.println(i);
				break;
			} 
		}

	}

}
