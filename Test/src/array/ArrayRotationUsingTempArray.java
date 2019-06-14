package array;
import java.util.Scanner;

public class ArrayRotationUsingTempArray {

	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		
		for(int i =0;i<t;i++){
			int size = sc.nextInt();
			int sum = sc.nextInt();
			int [] arr = new int[size];
			for(int j =0;j<size;j++){
				arr[j]=sc.nextInt();
			}
			findSum(arr,sum,size);
		}
		
	}

private static void findSum(int[] arr, int sum,int size) {
		
		int i=0;
		int j =0;
		int k= arr[j];
		boolean flag = false;
		while(i<=j && j<size){
			if(k==sum){
				flag = true;
				break;
			}
			if(k>sum){
				k-=arr[i++];
				continue;
			}
			if (++j >= size) {
				break;
			}
			k += arr[j];
		}
		
		if (flag) {
			System.out.println(i+1+" "+(j+1));
		} else {
			System.out.println(-1);
		}
		
		
	}

}
