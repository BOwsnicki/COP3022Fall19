
public class Reader3 {
	public static void main(String[] args) {
		String s1 = "hello123";
		String s2 = "hello";
		
		try {
			StringUtil.scanString(s2);
		} catch (NoDigitException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
