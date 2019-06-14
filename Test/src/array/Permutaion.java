package array;
import java.util.HashSet;
import java.util.Set;

public class Permutaion {

	public static void main(String[] args) {
		Permutaion p = new Permutaion();
		String a = "AABC";
		Set<String> r = new HashSet<>();
		p.permutaion("", a, r);
		for (String s : r) {
			System.out.println(s);
		}

	}

	private void permutaion(String pre, String suf, Set<String> r) {
		if (suf.length() == 0) {
			r.add(pre);
		}
		for (int i = 0; i < suf.length(); i++) {
			permutaion(pre + suf.charAt(i), suf.substring(0, i) + suf.substring(i + 1), r);
		}

	}

}
