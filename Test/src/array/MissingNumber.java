package array;
import java.util.Scanner;

public class MissingNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		
		for(int i =0;i<t;i++){
			int size = sc.nextInt();
			int [] arr = new int[size];
			for(int j =0;j<size;j++){
				arr[j]=sc.nextInt();
			}
					
			missingNumber(arr,size);
		}
		
	}
	
	public static void missingNumber(int [] arr,int n){
		
		int total=n*(n+1)/2;
		int sum=0;
		for(int i =0;i<n;i++){
			sum+=arr[i];
		}
		System.out.println(total-sum);
	}
}