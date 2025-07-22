package practice;

public class CaseConverter {

	

	    /** Converts every A–Z in the input to a–z. */
	    String toLower(String input) {
	        char[] chars = input.toCharArray();      // work with a mutable array
	        for (int i = 0; i < chars.length; i++) {
	            char c = chars[i];
	            if (c >= 'A' && c <= 'Z') {          // ASCII range for capitals
	                chars[i] = (char) (c + ('a' - 'A')); // shift 65‑>97, 66‑>98, …
	            }
	        }
	        return String.valueOf(chars);
	    }

	    /** Converts every a–z in the input to A–Z. */
	    String toUpper(String input) {
	        char[] chars = input.toCharArray();
	        for (int i = 0; i < chars.length; i++) {
	            char c = chars[i];
	            if (c >= 'a' && c <= 'z') {          // ASCII range for lowercase
	                chars[i] = (char) (c - ('a' - 'A')); // shift 97‑>65, 98‑>66, …
	            }
	        }
	        return String.valueOf(chars);
	    }

	    // Quick demo
	    public static void main(String[] args) {
	        CaseConverter cc = new CaseConverter();

	        String original = "Hello World 123!";
	        System.out.println("Original : " + original);
	        System.out.println("Lowercase: " + cc.toLower(original));
	        System.out.println("Uppercase: " + cc.toUpper(original));
	    }
	}



