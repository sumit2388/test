package array;
import java.util.Scanner;

public class MaximumOfSubArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
			int n = sc.nextInt();
			int k = sc.nextInt();
			int [] arr = new int[n];
			for(int i=0;i<n;i++){
				arr[i]=sc.nextInt();
			}
			
			findMax(arr,n,k);
		}
	}
	private static void findMax(int[] arr, int n,int k) {
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<n-k+1;i++){
			int max=0;
			int j=0;
			while(j<k){
				if(arr[i+j]>max){
					max=arr[i+j];
				}
			}
			
			sb.append(max+" ");
			
		}
		System.out.println(sb.toString());
	}

	private static void findMax1(int[] arr, int n,int k) {
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<n-2;i++){
			int a=arr[i];
			int b=arr[i+1];
			int c=arr[i+2];
			if(a>b){
				if(a>c){
					sb.append(a+" ");
				//	return a;
				}else {
					sb.append(c+" ");
				//	return c;
				}
			}else{
				if(b>c){
					sb.append(b+" ");
				//	return b;
				}else{
					sb.append(c+" ");
				//	return c;
				}
			}
		}
	}

}
