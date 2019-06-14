package array;
import java.io.Serializable;
import java.util.LinkedList;
import java.util.Scanner;

public class Leader implements Serializable{

	public static void main(String[] args) {
		int arr [] ={10,7,7,5,1,2};
		leader(arr,arr.length);
		
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
			int n = sc.nextInt();
			int [] arrr = new int[n];
			for(int i =0;i<n;i++)
			{
				arrr[i]=sc.nextInt();
			}
			leader(arrr,n);
		}

	}
	private static void leader(int[] arr, int n) {
		int leader=0;
		StringBuilder  sb = new StringBuilder();
		int i=n-1;
		while(i>=0){
			if(arr[i]>=leader){
				leader=arr[i];
				continue;
			}
			arr[i]=-1;
			i--;
		}
		for(int j =0;j<n;j++){
			if(arr[j]!=-1)
				sb.append(arr[j]+" ");

		}
		System.out.println(sb.toString());		
		
		
	}

}
