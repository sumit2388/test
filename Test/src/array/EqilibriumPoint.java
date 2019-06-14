package array;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class EqilibriumPoint {

	public static void main(String[] args) {

		int arrr[] = { 1,2,2,1 };
		int n = arrr.length;
		System.out.println(findEqu(arrr, n));

		// Scanner sc = new Scanner(System.in);
		// int t = sc.nextInt();
		// while(t-->0){
		// int size = sc.nextInt();
		// int arr[]= new int[size];
		// for(int i =0;i<size;i++){
		// arr[i]=sc.nextInt();
		// }
		//
		// System.out.println(findEqu(arr,size));
		//
		// }
	}

	private static int findEqu(int[] arr, int n) {
		int leftSum=0;
		int rightSum=0;
		for(int i =0 ;i<n;i++){
			rightSum+=arr[i];
		}
		for(int i =0 ;i<n;i++){
			rightSum=rightSum-arr[i];
			if(leftSum==rightSum){
				return i+1;
			}
				leftSum=leftSum+arr[i];
					
			}
		return-1;
		}

}


