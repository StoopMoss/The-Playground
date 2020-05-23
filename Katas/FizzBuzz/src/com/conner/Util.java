

public class Util {
    public static Boolean stringCompare(String string1, String string2) {
		if (string1.length() != string2.length()) {
			return false;
		}

		for (int i = 0; i < string1.length(); i++) {
			if (string1.charAt(i) != string2.charAt(i)) {
				return false;
			}
		}
		return true;
	}

}