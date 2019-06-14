package misc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Combination {

	public static void main(String[] args) {

		String a ="tombola";
		String [] arr = a.split("");
		List<List<String>> com=combination(arr);
	
		List<String> l = new ArrayList<>();
		for(List<String> i : com){
			if(i.size()==2 ){
				StringBuilder s = new StringBuilder();
				for(String s1 :i){
					s.append(s1);
				}
				l.add(s.toString());
			}
		}
		
		Set<String> set = new TreeSet<>();
		set.addAll(l);
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		
		
		
		System.out.println(combination(arr));
	}

	private static List<List<String>> combination(String[] n) {
		
		List<List<String>> result = new LinkedList<>();
		combinations(n,0,result,new LinkedList<String>());
		return result;
		
	}

	private static void combinations(String[] n, int i, List<List<String>> result, LinkedList<String> path) {
		
		if(i == n.length){
			result.add(path);
			return;
		}
		LinkedList<String> pathWithCurrent = new LinkedList(path);
		pathWithCurrent.add(n[i]);
		
		combinations(n,i+1,result,path); // exclude current item
		
		
//		System.out.println("##");
		
		
		combinations(n,i+1,result,pathWithCurrent); // include current item
	}

}
