package array;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class FindMinimumKUsingQueue {

	public static void main(String[] args) {

		int arr [] ={1,2,3,1,4,5,2,3,6};
		
		
		Map<Integer, Integer> map = new HashMap<>();
		for(int i =0 ;i<arr.length;i++){
			if(map.containsKey(arr[i])){
				map.put(arr[i], 1);
			}else{
				map.put(arr[i], map.get(arr[i])+1);
			}
			
		}
		System.out.println(map);
		
		
		Scanner sc = new Scanner(System.in);
		
		for(int i =0 ;i<3;i++){
			System.out.println(sc.next());
		}
		/*int t = sc.nextInt();
		while(t-->0){
			int n= sc.nextInt();
			int k = sc.nextInt();
			int [] arr = new int[n];
			for(int i=0;i<n ;i++){
				arr[i]=sc.nextInt();
			}
			find1(arr,n,k);
		}*/
		
	}

	private static void find1(int[] arr, int n, int k) {
		
		Queue<Integer> q = new PriorityQueue<>(new Comparator<Integer>() {
			public int compare(Integer o1, Integer o2) {
				return -o1.compareTo(o2);
			}
		});
		
		
		for(int i=0; i<k; i++){
			q.add(arr[i]);			
		}
		StringBuilder sb = new StringBuilder();
		for(int i=k;i<n;i++){
			sb.append(q.peek()+" ");
			q.remove(arr[i-k]);
			q.add(arr[i]);
		}
		sb.append(q.peek());
		System.out.println(sb.toString());
		
	}

	
	}




