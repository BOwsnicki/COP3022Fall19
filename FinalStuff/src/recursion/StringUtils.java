package recursion;

public class StringUtils {
	public static String indent(String prefix, int level, String s) {
		if (level == 0) {
			return s;
		} else {
			return prefix + indent(prefix, level-1,s);
		}
	}
	
	public static String center(String s) {
		if (s.length() <= 2) {
			return s;
		}
		return center(s.substring(1,s.length() - 1));
	}
	
	public static String reverse(String s) {
		if (s.length() <= 1) {
			return s;
		}
		return reverse(s.substring(1)) + s.charAt(0);
	}
	
	public static String palindromer(String s) {
		if (s.length() == 0) {
			return s;
		} else {
			if (s.length() == 1) {
				return s+s;
			} else {
				return s.charAt(0) + palindromer(s.substring(1)) + s.charAt(0);
			}
		}
	}

	
	public static void main(String[] args) {
		String s = "abcdefghi";
		System.out.println(indent("...",5,s));
		System.out.println(center(s));
		System.out.println(reverse(s));
		System.out.println(palindromer(s));
	}
}
