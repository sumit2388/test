package array;
import java.util.Scanner;

public class MaxSumSubarray {

	public static void main (String[] args) {
		
		
//		Scanner sc = new Scanner(System.in);
//		int t=sc.nextInt();
//		
//		for(int i =0;i<t;i++){
//			int size = sc.nextInt();
//			int [] arr = new int[size];
//			for(int j =0;j<size;j++){
//				arr[j]=sc.nextInt();
//			}
//			getMaxSum(arr);
//		}
		int arr[] ={-5,6,-7,2,5,6,-10};
		getMaxSum(arr);
	}
	
	private static void getMaxSum(int[] arr) {
		int max = Integer.MIN_VALUE;
		int sum =0;
 		for(int i =0; i<arr.length;i++){
			sum+=arr[i];
			if(max<sum)
				max=sum;
			if(sum<0)
				sum=0;
		}
		System.out.println(max);
	}

}
