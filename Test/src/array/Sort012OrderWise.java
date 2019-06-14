package array;
import java.util.Arrays;
import java.util.Scanner;

public class Sort012OrderWise {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
			int size = sc.nextInt();
			int arr[]= new int[size];
			for(int i =0;i<size;i++){
				arr[i]=sc.nextInt();
			}
			
			sort(arr,size);
			for(int j =0;j<size;j++){
				System.out.print(arr[j]+" ");
			}
			System.out.println();
		}

				
	}

	private static void sort(int[] arr, int size) {

		int low = 0 , mid=0;
		int high=size-1;
		for(;mid<=high;){
			if(arr[mid]==0){
				swap(arr,low,mid);
				low++;
				mid++;
			}else if(arr[mid]==2){
				swap(arr,high,mid);
				high--;
			}else{
				mid++;
			}
		}
		
	}

	private static void swap(int[] arr, int low, int high) {
		
		int temp=arr[low];
		arr[low]=arr[high];
		arr[high]=temp;
	}

}
