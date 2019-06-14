package misc;

import java.util.ArrayList;
import java.util.List;

public class Permutation {

	public static void main(String[] args) {

		String s = "ab";

		ArrayList<String> ll =permutation(s);
		for(String a : ll){
			System.out.println(a);
		}
	}

	private static ArrayList<String> permutation(String s) {
		ArrayList<String> l = new ArrayList<String>();
		permute("", s, l);
		return l;
	}

	private static void permute(String prefix, String suffix, ArrayList<String> l) {
		if (suffix.length() == 0) {
			l.add(prefix);
		} else {
			int j=0;
			for (int i = 0; i < suffix.length(); i++) {
				System.out.println(++j);
				permute(prefix + suffix.charAt(i), suffix.substring(0, i) + suffix.substring(i + 1, suffix.length()),
						l);
			}
		}
	}

}
