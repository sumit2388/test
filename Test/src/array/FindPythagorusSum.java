package array;

import java.util.HashSet;
import java.util.Set;

public class FindPythagorusSum {

	public static void main(String[] args) {

		
		int [] ar={3 ,2 ,4 ,6, 5};
		Set<Integer> s = new HashSet<>();
		for(int i =0 ;i<ar.length;i++){
			s.add(ar[i]*ar[i]);
		}
		
		for(int i =0 ;i<ar.length;i++){
			for(int j =i+1 ;j<ar.length;j++){
				if(s.contains(ar[i]*ar[i]+ar[j]*ar[j])){
					System.out.println("true");
				}
			}
		}
	}

}
